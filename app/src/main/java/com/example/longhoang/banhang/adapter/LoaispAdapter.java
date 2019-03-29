package com.example.longhoang.banhang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.longhoang.banhang.R;
import com.example.longhoang.banhang.model.Loaisp;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Long Hoang on 3/15/2019.
 */

public class LoaispAdapter extends BaseAdapter {
    ArrayList<Loaisp> arraylistLoaisp;
    Context context;

    public LoaispAdapter(ArrayList<Loaisp> arraylistLoaisp, Context context) {
        this.arraylistLoaisp = arraylistLoaisp;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arraylistLoaisp.size();
    }

    @Override
    public Object getItem(int i) {
        return arraylistLoaisp.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class ViewHolder{
        TextView txtTenloaisp;
        ImageView imgLoaisp;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_loaisp,null);
            viewHolder.txtTenloaisp = (TextView) view.findViewById(R.id.textviewloaisp);
            viewHolder.imgLoaisp = (ImageView) view.findViewById(R.id.imageviewloaisp);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Loaisp loaisp = (Loaisp) getItem(i);
        viewHolder.txtTenloaisp.setText(loaisp.getTen());
        Picasso.with(context).load(loaisp.getHinhanh())
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(viewHolder.imgLoaisp);
        return view;
    }
}
