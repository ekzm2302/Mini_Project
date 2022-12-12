package com.example.mini_project.life;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<CardDTO> list;
    public CardAdapter(LayoutInflater inflater, Context context, ArrayList<CardDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.tv_card_name.setText(list.get(i).getCard_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_card_name;

        public ViewHolder(@NonNull View v) {
            super(v);
            tv_card_name = v.findViewById(R.id.tv_card_name);
        }
    }
}
