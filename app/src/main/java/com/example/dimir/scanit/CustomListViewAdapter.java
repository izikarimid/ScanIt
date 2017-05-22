package com.example.dimir.scanit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by dimir on 5/22/2017.
 */

public class CustomListViewAdapter extends ArrayAdapter<ProductSaleModel> {

    private List<ProductSaleModel> items = null;
    Context context;
    Bitmap image;
    ViewHolder holder = null;


    public CustomListViewAdapter(Context context, int resourceId,
                                 List<ProductSaleModel> items) {
        super(context, resourceId, items);
        this.items=items;
        this.context = context;
    }


    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView menu;


    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ProductSaleModel rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.product_list_item, null);
            holder = new ViewHolder();
            holder.menu = (TextView) convertView.findViewById(R.id.label);


            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
            holder.menu.setText(rowItem.getProduct_name());
        return convertView;
    }


}
