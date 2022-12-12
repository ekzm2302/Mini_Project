package com.example.mini_project.life;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mini_project.R;

import java.util.ArrayList;

public class LifeFragment extends Fragment {
    RecyclerView recv_card, recv_dong;
    ArrayList<CardDTO> list;
    ArrayList<DongDTO> list2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_life, container, false);

       // 카드뷰

        recv_card = v.findViewById(R.id.recv_card);
        list = new ArrayList<>();
        list.add(new CardDTO("주제"));
        list.add(new CardDTO("동네소식"));
        list.add(new CardDTO("동네질문"));
        list.add(new CardDTO("동네맛집"));
        list.add(new CardDTO("취미생활"));
        list.add(new CardDTO("일상"));
        list.add(new CardDTO("분실/실종센터"));
        list.add(new CardDTO("동네사건사고"));
        list.add(new CardDTO("해주세요"));
        list.add(new CardDTO("동네사진전"));
        CardAdapter adapter = new CardAdapter(inflater, getContext(), list);
        recv_card.setAdapter(adapter);
        recv_card.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        // 목록 뷰
       recv_dong = v.findViewById(R.id.recv_dong);
       list2 = new ArrayList<>();
       list2.add(new DongDTO(R.drawable.car15, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));
       list2.add(new DongDTO(R.drawable.dong, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분전"));

       DongAdapter adapter1 = new DongAdapter(inflater, getContext(), list2);
       recv_dong.setAdapter(adapter1);
       recv_dong.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));






        return v;
    }
}