package com.example.mini_project.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mini_project.R;
import com.example.mini_project.life.DongAdapter;

import java.util.ArrayList;


public class ChatFragment extends Fragment {
    RecyclerView recv_Chat;
    ArrayList<ChatDTO> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_chat, container, false);
       recv_Chat = v.findViewById(R.id.recv_Chat);
       list = new ArrayList<>();
       list.add(new ChatDTO(R.drawable.profile_img1, R.drawable.car1, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img2, R.drawable.car2, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img3, R.drawable.car3, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img4, R.drawable.car5, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
       list.add(new ChatDTO(R.drawable.profile_img5, R.drawable.car4, "당근당근", "안녕하세요 팔렸나요?", "문흥동·1분전"));
        ChatAdapter adapter = new ChatAdapter(inflater, list, getContext());
       recv_Chat.setAdapter(adapter);
       recv_Chat.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return v;
    }
}