package com.example.mini_project.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;
import com.example.mini_project.life.CardAdapter;

import java.util.ArrayList;

public class SearchCardAdapter extends RecyclerView.Adapter<SearchCardAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<SearchDTO> slist;

    public SearchCardAdapter(LayoutInflater inflater, ArrayList<SearchDTO> slist) {
        this.inflater = inflater;
        this.slist = slist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_search_card, parent, false);
        SearchCardAdapter.ViewHolder viewHolder = new SearchCardAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.tv_search_name.setText(slist.get(i).getCard_name());
    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_search_name;
        public ViewHolder(@NonNull View v) {
            super(v);
            tv_search_name = v.findViewById(R.id.tv_search_name);
        }
    }
}
