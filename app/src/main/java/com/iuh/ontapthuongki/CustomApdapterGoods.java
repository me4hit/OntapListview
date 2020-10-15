package com.iuh.ontapthuongki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomApdapterGoods extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> goodsArrayList;

    public CustomApdapterGoods(Context ctx, int layoutItem, ArrayList<Goods> goodsArrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.goodsArrayList = goodsArrayList;
    }

    @Override
    public int getCount() {
        return goodsArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //get Items
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);

        // get các view của Goods
        TextView nameView = view.findViewById(R.id.nameView);
        TextView shopnamView = view.findViewById(R.id.shopView);
        ImageView imageView = view.findViewById(R.id.imgitem);

        // gán
        nameView.setText(goodsArrayList.get(i).getName());
        shopnamView.setText((goodsArrayList.get(i).getShopName()));
        imageView.setImageResource(goodsArrayList.get(i).getImgGoods());
        return view;
    }


}
