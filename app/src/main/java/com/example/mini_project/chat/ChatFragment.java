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
       list.add(new ChatDTO(R.drawable.wndrh1, R.drawable.car1, "강쥐강쥐", "안녕하세요 혹시 팔렸나요?", "문흥동·1분 전"));
       list.add(new ChatDTO(R.drawable.profile_img1, R.drawable.car9, "중고쟁이", "책상이 예쁜데 바로 거래가...", "진월동·46분 전"));
       list.add(new ChatDTO(R.drawable.wndrh2, R.drawable.car2, "스폰지밥", "가구 보고있는데 있나요?", "금호동·5분 전"));
       list.add(new ChatDTO(R.drawable.profile_img3, R.drawable.car11, "lililili", "아이패드 몇세대인가요", "신창동·2시간 전"));
       list.add(new ChatDTO(R.drawable.wndrh3, R.drawable.car3, "짱구에용", "하이잇!! 집보는중입니다", "쌍촌동·7분 전"));
       list.add(new ChatDTO(R.drawable.profile_img4, R.drawable.car12, "Park", "안녕하세요 팔렸나요?", "수완지구·2시간 전"));
       list.add(new ChatDTO(R.drawable.wndrh7, R.drawable.car7, "꿀이좋아아", "모니터 좋아보이네요 상태좋...", "봉선동·25분 전"));
       list.add(new ChatDTO(R.drawable.wndrh4, R.drawable.car5, "라이언", "에어컨 사욥", "양산동·13분 전"));
       list.add(new ChatDTO(R.drawable.wndrh5, R.drawable.car4, "스폰찌방", "컴퓨터 팔렸나요?", "본촌동·15분 전"));
       list.add(new ChatDTO(R.drawable.wndrh6, R.drawable.car6, "룰루라", "에어컨 하나 삽니다", "일곡동·18분 전"));
       list.add(new ChatDTO(R.drawable.wndrh8, R.drawable.car8, "공룡님이다", "노트북 사고싶어용", "주월동·31분전"));
       list.add(new ChatDTO(R.drawable.profile_img2, R.drawable.car10, "다사요옹", "안녕하세요 팔렸나요?", "신가동·1시간 전"));


        ChatAdapter adapter = new ChatAdapter(inflater, list, getContext());
       recv_Chat.setAdapter(adapter);
       recv_Chat.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return v;
    }
}