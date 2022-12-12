package com.example.mini_project.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;
import com.example.mini_project.home.HomeAdapter;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<ChatDTO> list;
    Context context;

    public ChatAdapter(LayoutInflater inflater, ArrayList<ChatDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_chat, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.chat_img.setImageResource(list.get(i).getImg());
        h.chat_img2.setImageResource(list.get(i).getImg2());
        h.tv_chat_msg.setText(list.get(i).getMsg());
        h.tv_chat_name.setText(list.get(i).getName());
        h.tv_chat_time.setText(list.get(i).getTime());
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView chat_img, chat_img2;
        TextView tv_chat_name, tv_chat_msg, tv_chat_time;
        public ViewHolder(@NonNull View v) {
            super(v);
            chat_img = v.findViewById(R.id.chat_img);
            chat_img2 = v.findViewById(R.id.chat_img2);
            tv_chat_name = v.findViewById(R.id.tv_chat_name);
            tv_chat_msg = v.findViewById(R.id.tv_chat_msg);
            tv_chat_time = v.findViewById(R.id.tv_chat_time);

        }
    }
}
