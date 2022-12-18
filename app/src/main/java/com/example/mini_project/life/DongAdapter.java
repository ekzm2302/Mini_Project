package com.example.mini_project.life;

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

public class DongAdapter extends RecyclerView.Adapter<DongAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<DongDTO> list2;
   Context context;
    public DongAdapter(LayoutInflater inflater, Context context, ArrayList<DongDTO> list2) {
        this.inflater = inflater;
        this.list2 = list2;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_dong, parent, false);
        DongAdapter.ViewHolder viewHolder = new DongAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.img_dong.setImageResource(list2.get(i).getImgs());
    h.tv_dong_title.setText(list2.get(i).getTitle());
    h.tv_dong_name.setText(list2.get(i).getName());
    h.tv_dong_nic.setText(list2.get(i).getNic());
    h.tv_dong_dong.setText(list2.get(i).getDong());
    h.tv_dong_time.setText(list2.get(i).getTime());

    h.li_dong.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, LifeActivity.class);
            context.startActivity(intent);
        }
    });

    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_dong;
        TextView tv_dong_title, tv_dong_name, tv_dong_nic, tv_dong_dong, tv_dong_time;
        LinearLayout li_dong;

        public ViewHolder(@NonNull View v) {
            super(v);
            img_dong = v.findViewById(R.id.img_dong);
            tv_dong_title = v.findViewById(R.id.tv_dong_title);
            tv_dong_name = v.findViewById(R.id.tv_dong_name);
            tv_dong_nic = v.findViewById(R.id.tv_dong_nic);
            tv_dong_dong = v.findViewById(R.id.tv_dong_dong);
            tv_dong_time = v.findViewById(R.id.tv_dong_time);
            li_dong = v.findViewById(R.id.li_dong);

        }
    }
}
