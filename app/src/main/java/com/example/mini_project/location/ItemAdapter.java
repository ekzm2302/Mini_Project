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


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{
    ArrayList<ItemDTO> list;
    LayoutInflater inflater;
    public ItemAdapter(LayoutInflater inflater, ArrayList<ItemDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_item_item, parent, false);
        ItemAdapter.ViewHolder viewHolder = new ItemAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.img_item.setImageResource(list.get(i).getImga());
    h.tv_item_lolo.setText(list.get(i).getLolo());
    h.tv_item_km.setText(list.get(i).getKm());
    h.tv_item_name.setText(list.get(i).getName());
    h.tv_item_won.setText(list.get(i).getWon());
    h.tv_item_love.setText(list.get(i).getLove());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item;
        TextView tv_item_lolo, tv_item_km, tv_item_name, tv_item_won, tv_item_love;
        public ViewHolder(@NonNull View v) {
            super(v);
            img_item = v.findViewById(R.id.img_item);
            tv_item_lolo = v.findViewById(R.id.tv_item_lolo);
            tv_item_km = v.findViewById(R.id.tv_item_km);
            tv_item_name = v.findViewById(R.id.tv_item_name);
            tv_item_won = v.findViewById(R.id.tv_item_won);
            tv_item_love = v.findViewById(R.id.tv_item_love);
        }
    }
}
