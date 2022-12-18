package com.example.mini_project.location;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<ShopDTO> shop;
    public ShopAdapter(LayoutInflater inflater, ArrayList<ShopDTO> shop) {
        this.inflater = inflater;
        this.shop = shop;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_loc_shop, parent, false);
        ShopAdapter.ViewHolder viewHolder = new ShopAdapter.ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.img_shop.setImageResource(shop.get(i).getImga());
    h.tv_shop_title.setText(shop.get(i).getTitle());
    h.tv_shop_msg.setText(shop.get(i).getMsg());
    h.tv_shop_km.setText(shop.get(i).getKm());
    h.tv_shop_hoo.setText(shop.get(i).getHoo());
    h.tv_shop_best.setText(shop.get(i).getBest());
    h.tv_shop_nic.setText(shop.get(i).getNic());
    h.tv_shop_msg2.setText(shop.get(i).getMsg2());


    }

    @Override
    public int getItemCount() {
        return shop.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_shop;
        TextView tv_shop_title, tv_shop_msg, tv_shop_km, tv_shop_hoo, tv_shop_best, tv_shop_nic, tv_shop_msg2;
        public ViewHolder(@NonNull View v) {
            super(v);
            img_shop = v.findViewById(R.id.img_shop);
            tv_shop_title = v.findViewById(R.id.tv_shop_title);
            tv_shop_msg = v.findViewById(R.id.tv_shop_msg);
            tv_shop_km = v.findViewById(R.id.tv_shop_km);
            tv_shop_hoo = v.findViewById(R.id.tv_shop_hoo);
            tv_shop_best = v.findViewById(R.id.tv_shop_best);
            tv_shop_nic = v.findViewById(R.id.tv_shop_nic);
            tv_shop_msg2 = v.findViewById(R.id.tv_shop_msg2);
        }
    }
}
