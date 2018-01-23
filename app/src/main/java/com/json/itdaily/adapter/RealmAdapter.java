package com.json.itdaily.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.json.itdaily.R;
import com.json.itdaily.realmbean.MobilePhone;

import java.util.ArrayList;

/**
 * Created by Json on 2018/1/23.
 */

public class RealmAdapter extends BaseAdapter {
    ArrayList<MobilePhone> list;

    public RealmAdapter(ArrayList<MobilePhone> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (holder == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemrealm, null);
            holder.id = view.findViewById(R.id.id);
            holder.name = view.findViewById(R.id.name);
            holder.price = view.findViewById(R.id.price);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.id.setText(list.get(i).getId());
        holder.name.setText(list.get(i).getName());
        holder.price.setText(String.valueOf(list.get(i).getPrice()));

        return view;
    }

    class ViewHolder {
        TextView id, name, price;
    }
}
