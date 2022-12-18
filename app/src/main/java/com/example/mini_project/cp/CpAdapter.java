package com.example.mini_project.cp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.R;
import com.example.mini_project.location.ItemAdapter;

import java.util.ArrayList;

public class CpAdapter extends RecyclerView.Adapter<CpAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<CpDTO> cplist;
    public CpAdapter(LayoutInflater inflater, ArrayList<CpDTO> cplist) {
        this.inflater = inflater;
        this.cplist = cplist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_loc_cp, parent, false);
        CpAdapter.ViewHolder viewHolder = new CpAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.img_cp_img.setImageResource(cplist.get(i).getImga());
        h.tv_cp_title.setText(cplist.get(i).getTitle());
        h.tv_cp_km.setText(cplist.get(i).getKm());
        h.tv_cp_nic.setText(cplist.get(i).getNic());
        h.tv_cp_msg.setText(cplist.get(i).getMsg());

    }

    @Override
    public int getItemCount() {
        return cplist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_cp_img, img_cp_cp;
        TextView tv_cp_title, tv_cp_km, tv_cp_nic, tv_cp_msg, tv_cp_cp;

        public ViewHolder(@NonNull View v) {
            super(v);
            img_cp_img = v.findViewById(R.id.img_cp_img);
            img_cp_cp = v.findViewById(R.id.img_cp_cp);
            tv_cp_title = v.findViewById(R.id.tv_cp_title);
            tv_cp_km = v.findViewById(R.id.tv_cp_km);
            tv_cp_nic = v.findViewById(R.id.tv_cp_nic);
            tv_cp_msg = v.findViewById(R.id.tv_cp_msg);
            tv_cp_cp = v.findViewById(R.id.tv_cp_cp);
        }
    }
}
