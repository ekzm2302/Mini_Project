package com.example.mini_project.location;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;
import com.example.mini_project.life.DongAdapter;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<StoryDTO> story;
    public StoryAdapter(LayoutInflater inflater, ArrayList<StoryDTO> story) {
        this.inflater = inflater;
        this.story = story;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_loc_story, parent, false);
        StoryAdapter.ViewHolder viewHolder = new StoryAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.story.setImageResource(story.get(i).getImgs());
    h.story2.setImageResource(story.get(i).getImgs2());
    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView story, story2;
        public ViewHolder(@NonNull View v) {
            super(v);
            story = v.findViewById(R.id.story);
            story2 = v.findViewById(R.id.story2);
        }
    }
}
