package com.example.dimir.scanit;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;

import static android.R.id.list;

public class Product extends AppCompatActivity {

TextView txtproductname,txtproductprice,txtunit;
    EditText txtquantity;

    Button btncart;
    String product_name="",product_price="",unit="",product_id="";
    Controller controller;
    ListView ProductList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        controller=(Controller)getApplicationContext();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

         ProductList = (ListView) findViewById(R.id.productlist);
        txtquantity=(EditText)findViewById(R.id.txtquantity);
        txtproductname=(TextView)findViewById(R.id.txtproductname);
        txtproductprice=(TextView)findViewById(R.id.txtproductprice);
        txtunit=(TextView)findViewById(R.id.txtUnit);
        btncart=(Button)findViewById(R.id.btncart);
        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductSaleModel  product= new ProductSaleModel();
                product.setProduct_name(txtproductname.getText().toString().trim());
                product.setProduct_price(Double.parseDouble(txtproductprice.getText().toString()));
                product.setQuantity(Integer.parseInt(txtquantity.getText().toString()));
                controller.addSaleProduct(product);


                Toast.makeText(getApplicationContext() ,"Product added succesfully!", Toast.LENGTH_LONG).show();

                Intent cartActivity=new Intent(Product.this,Cart.class);
                startActivity(cartActivity);
            }
        });
        try{
            product_id= getIntent().getExtras().getString("product_id");
            product_name=getIntent().getExtras().getString("product_name");
            product_price=getIntent().getExtras().getString("product_price");
            unit=getIntent().getExtras().getString("unit");

        }catch (Exception e){

        }

        txtproductname.setText(product_name);
        txtproductprice.setText(product_price);
        txtunit.setText(unit);

        getCart();
      /*connect();*/
    }

    public void getCart() {

        List<ProductSaleModel> productSaleModels= controller.getProductSaleModelArrayList();
        CustomListViewAdapter adapter = new CustomListViewAdapter(getApplicationContext(),
                R.layout.product_list_item,productSaleModels);
                ProductList.setAdapter(adapter);
    }


}
