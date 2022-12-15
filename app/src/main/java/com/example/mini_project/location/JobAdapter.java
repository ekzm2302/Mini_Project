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

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<JobDTO> jobs;
    ArrayList<JobDTO2> jobs2;
    ArrayList<JobDTO3> jobs3;

    public JobAdapter(LayoutInflater inflater, ArrayList<JobDTO> jobs,ArrayList<JobDTO2> jobs2,ArrayList<JobDTO3> jobs3) {
        this.inflater = inflater;
        this.jobs = jobs;
        this.jobs2 = jobs2;
        this.jobs3 = jobs3;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_loc_job, parent, false);
        JobAdapter.ViewHolder viewHolder = new JobAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.tv_job_title.setText(jobs.get(i).getTitle());
    h.tv_job_title2.setText(jobs2.get(i).getTitle2());
    h.tv_job_title3.setText(jobs3.get(i).getTitle3());
    h.tv_job_dong.setText(jobs.get(i).getDong());
    h.tv_job_dong2.setText(jobs2.get(i).getDong2());
    h.tv_job_dong3.setText(jobs3.get(i).getDong3());
    h.tv_job_km.setText(jobs.get(i).getKm());
    h.tv_job_km2.setText(jobs2.get(i).getKm2());
    h.tv_job_km3.setText(jobs3.get(i).getKm3());
    h.tv_job_name.setText(jobs.get(i).getName());
    h.tv_job_name2.setText(jobs2.get(i).getName2());
    h.tv_job_name3.setText(jobs3.get(i).getName3());
    h.tv_job_money.setText(jobs.get(i).getMoney());
    h.tv_job_money2.setText(jobs2.get(i).getMoney2());
    h.tv_job_money3.setText(jobs3.get(i).getMoney3());
    h.img_job.setImageResource(jobs.get(i).getImga());
    h.img_job2.setImageResource(jobs2.get(i).getImga2());
    h.img_job3.setImageResource(jobs3.get(i).getImga3());
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_job,img_job2,img_job3;
        TextView tv_job_title,tv_job_title2,tv_job_title3, tv_job_dong,tv_job_dong2,tv_job_dong3,
                    tv_job_km,tv_job_km2,tv_job_km3, tv_job_name,tv_job_name2,tv_job_name3, tv_job_money,tv_job_money2,tv_job_money3;
        public ViewHolder(@NonNull View v) {
            super(v);
            img_job = v.findViewById(R.id.img_job);
            tv_job_title = v.findViewById(R.id.tv_job_title);
            tv_job_dong = v.findViewById(R.id.tv_job_dong);
            tv_job_km = v.findViewById(R.id.tv_job_km);
            tv_job_name = v.findViewById(R.id.tv_job_name);
            tv_job_money = v.findViewById(R.id.tv_job_money);

            img_job2 = v.findViewById(R.id.img_job2);
            tv_job_title2 = v.findViewById(R.id.tv_job_title2);
            tv_job_dong2 = v.findViewById(R.id.tv_job_dong2);
            tv_job_km2 = v.findViewById(R.id.tv_job_km2);
            tv_job_name2 = v.findViewById(R.id.tv_job_name2);
            tv_job_money2 = v.findViewById(R.id.tv_job_money2);

            img_job3 = v.findViewById(R.id.img_job3);
            tv_job_title3 = v.findViewById(R.id.tv_job_title3);
            tv_job_dong3 = v.findViewById(R.id.tv_job_dong3);
            tv_job_km3 = v.findViewById(R.id.tv_job_km3);
            tv_job_name3 = v.findViewById(R.id.tv_job_name3);
            tv_job_money3 = v.findViewById(R.id.tv_job_money3);
        }
    }
}
