package com.iuh.ontapthuongki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomApdapterGoods adt;
    ArrayList<Goods> goodsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.listViewsGood);
        goodsArrayList = new ArrayList<>();

        goodsArrayList.add(new Goods("Ca nấu lẩu, nấu mì mini", "Devang", R.drawable.canaulau));
        goodsArrayList.add(new Goods("1 KG GÀ KHÔ BƠ TỎI", "LTD FOOD", R.drawable.ga_bo_toi));
        goodsArrayList.add(new Goods("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        goodsArrayList.add(new Goods("Đô chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        goodsArrayList.add(new Goods("Lãnh đạo giản đơn", "Minh Long BooK", R.drawable.lanh_dao_gian_don));
        goodsArrayList.add(new Goods("Hiểu lòng trẻ con", "Minh Long BooK", R.drawable.hieu_long_con_tre));
        goodsArrayList.add(new Goods("Ca nấu lẩu, nấu mì mini", "Devang", R.drawable.canaulau));
        goodsArrayList.add(new Goods("1 KG GÀ KHÔ BƠ TỎI", "LTD FOOD", R.drawable.ga_bo_toi));
        goodsArrayList.add(new Goods("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        goodsArrayList.add(new Goods("Đô chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        goodsArrayList.add(new Goods("Lãnh đạo giản đơn", "Minh Long BooK", R.drawable.lanh_dao_gian_don));
        goodsArrayList.add(new Goods("Hiểu lòng trẻ con", "Minh Long BooK", R.drawable.hieu_long_con_tre));
        adt= new CustomApdapterGoods(this, R.layout.item_list, goodsArrayList);

        lvGoods.setAdapter(adt);
    }
}