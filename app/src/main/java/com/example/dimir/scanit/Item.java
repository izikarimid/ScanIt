package com.example.dimir.scanit;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class Item extends AppCompatActivity {

    String text;
    String productname,productprice,productunit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //connect();
    }

   /* public void connect() {

        String data;
        List<String> r = new ArrayList<String>();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,r);
        ListView list=(ListView)findViewById(R.id.itemlistview);
        try
        {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet("http://10.0.2.2/database/Retrive.php");
            HttpResponse response = client.execute(request);
            HttpEntity entity=response.getEntity();
            data= EntityUtils.toString(entity);
            Log.e("STRING", data);

            try
            {
                JSONArray json=new JSONArray(data);
                for(int i=0;i<json.length(); i++)
                {
                    JSONObject obj=json.getJSONObject(i);

                    productname=obj.getString("product_name");
                    productprice=obj.getString("product_price");
                    productunit=obj.getString("unit");

                    Log.e("STRING", productname);
                    Log.e("STRING",productprice);
                    Log.e("STRING",productunit);

                    r.add(productname);
                    r.add(productprice);
                    r.add(productunit);

                    //r.add(CompID);
                    list.setAdapter(adapter);

                    list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener()
                    {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                        {
                            Intent i1=new Intent(Item.this,Category1.class);
                            i1.putExtra("CompName", CompName);
                            startActivity(i1);
                        }
                    });
                }
            }
            catch (JSONException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClientProtocolException e) {
            Log.d("HTTPCLIENT", e.getLocalizedMessage());
        } catch (IOException e) {
            Log.d("HTTPCLIENT", e.getLocalizedMessage());
        }
    }

    *//*@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.i, menu);
        return true;
    }*/
}