package com.example.dimir.scanit;

/**
 * Created by dimir on 5/22/2017.
 */

public class ProductSaleModel {
    String product_name;
    double product_price,total;
    int quantity;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public double getTotal() {
        return this.quantity*product_price;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
