package com.example.mini_project.location;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mini_project.R;

import java.util.ArrayList;


public class LocationFragment extends Fragment {
    RecyclerView recv_item;
    ArrayList<ItemDTO> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_location, container, false);

      recv_item = v.findViewById(R.id.recv_item);
      list = new ArrayList<>();
      list.add(new ItemDTO(R.drawable.item1, "로로베이크", "1.1km", "머랭쿠키", "5,000원", "관심 12"));
      list.add(new ItemDTO(R.drawable.item2, "로로베이크", "1.1km", "귀여운머랭쿠키", "7,000원", "관심 14"));
      list.add(new ItemDTO(R.drawable.item3, "케이크집", "2km", "딸기케이크", "15,000원", "관심 5"));
      list.add(new ItemDTO(R.drawable.item4, "장난감매장", "2.1km", "건담", "35,000원", "관심 2"));
      list.add(new ItemDTO(R.drawable.item5, "우리집과일", "2.2km", "맛있는 과일", "45,000원", "관심 10"));
      list.add(new ItemDTO(R.drawable.item6, "남는귤", "2.5km", "탱탱한 귤", "15,000원", "관심 20"));
      list.add(new ItemDTO(R.drawable.item7, "넘버원케이크", "2.7km", "1번가케이크", "50,000원", "관심 22"));
      list.add(new ItemDTO(R.drawable.item8, "머랭머랭", "3.1km", "딸기머랭", "25,000원", "관심 21"));
      list.add(new ItemDTO(R.drawable.item10, "7번가카페", "3.7km", "디저트", "10,000원", "관심 41"));
      list.add(new ItemDTO(R.drawable.item11, "10번가카페", "4km", "카페·디저트", "15,000원", "관심 1"));
      list.add(new ItemDTO(R.drawable.item12, "안서리", "15km", "샤인머스켓케끼", "35,000원", "관심 13"));
      ItemAdapter adapter = new ItemAdapter(inflater, list);
      recv_item.setAdapter(adapter);
      recv_item.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));




        return v;
    }
}