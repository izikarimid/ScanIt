package com.example.dimir.scanit;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by dimir on 5/22/2017.
 */

public class Controller extends Application{
    ArrayList<ProductSaleModel> productSaleModelArrayList = new ArrayList<>();

    public  void addSaleProduct(ProductSaleModel productSaleModel){
        productSaleModelArrayList.add(productSaleModel);
    }

    public ArrayList<ProductSaleModel> getProductSaleModelArrayList() {
        return productSaleModelArrayList;
    }
}
