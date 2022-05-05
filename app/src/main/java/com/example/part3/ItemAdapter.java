package com.example.part3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] description;


    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        description = d;
        mInflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView tvname = (TextView) v.findViewById(R.id.tvname);
        TextView tvnprice = (TextView) v.findViewById(R.id.tvprice);
        TextView tvdescription = (TextView) v.findViewById(R.id.tvdescription);

        String name =items[i];
        String desc = description[i];
        String cost =prices[i];

        tvname.setText(name);
        tvdescription.setText(desc);
        tvnprice.setText(cost);

        return v;
    }
}
