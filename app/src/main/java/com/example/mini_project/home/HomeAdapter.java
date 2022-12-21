package com.example.mini_project.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;

import java.util.ArrayList;
import java.util.Random;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<HomeDTO> list;
    Context context;
    public HomeAdapter(LayoutInflater inflater, ArrayList<HomeDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.item_recv_home, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

//        int j = new Random().nextInt(list.size());
        h.car.setImageResource(list.get(i).getImgs());
        h.tv_sale.setText(list.get(i).getTv_sale());
        h.tv_area.setText(list.get(i).getTv_area());
        h.tv_price.setText(list.get(i).getTv_price());
        h.tv_num1.setText(list.get(i).getTv_num1());
        h.tv_num2.setText(list.get(i).getTv_num2());

        h.item_recv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(context, HomeActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView car, chat, her, home_ic_add;
        TextView tv_sale, tv_area, tv_price, tv_num1, tv_num2;
        LinearLayout item_recv;
        public ViewHolder(@NonNull View v) {
            super(v);
            car = v.findViewById(R.id.car);
            chat = v.findViewById(R.id.chat);
            her = v.findViewById(R.id.her);
            tv_sale = v.findViewById(R.id.tv_sale);
            tv_area = v.findViewById(R.id.tv_area);
            tv_price = v.findViewById(R.id.tv_price);
            tv_num1 = v.findViewById(R.id.tv_num1);
            tv_num2 = v.findViewById(R.id.tv_num2);
            item_recv = v.findViewById(R.id.item_recv);



        }
    }
}
