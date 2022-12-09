package com.example.mini_project.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mini_project.R;
import com.example.mini_project.common.CommonMethod;

import java.util.ArrayList;


public class homeFragment extends Fragment {
    RecyclerView recv_home;
    ArrayList<HomeDTO> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<HomeDTO> list = new ArrayList<>();
            list.add(new HomeDTO(R.drawable.car4, "컴퓨터 본체 팔아유", "서구 화정동 끌올: 4분 30초", "250,000원", "12" , "6" ));
            list.add(new HomeDTO(R.drawable.car1, "킥보드를 판매합니다", "서구 금호동 끌올: 30초", "100,000원", "1" , "5" ));
            list.add(new HomeDTO(R.drawable.car2, "의자 판매합니다", "서구 쌍촌동 끌올: 1분 30초", "50,000원",  "3"  , "4" ));
            list.add(new HomeDTO(R.drawable.car3, "집 팝니다", "담양 어딘가 끌올:2분 30초", "100,000,000원", "13" , "2" ));
            list.add(new HomeDTO(R.drawable.car6, "슬림 에어컨 1명선착순 나눔해요", "북구 양산동 끌올:5분 30초", "나눔", "2" , "8" ));
            list.add(new HomeDTO(R.drawable.car7, "LG 모니터 잘나오는거 팔아요", "남구 주월동 끌올:7분 50초", "50,000원", "21" , "21" ));
            list.add(new HomeDTO(R.drawable.car5, "삼성 에어컨 한대 판매합니다", "동구 충장로 끌올: 9분", "500,000원", "5" , "11" ));
            list.add(new HomeDTO(R.drawable.car8, "삼성 노트북 급처!!", "북구 일곡동 끌올: 30초", "430,000원", "13" , "11" ));
            list.add(new HomeDTO(R.drawable.car9, "책상의자 세트 판매합니다!", "광산구 송정리 끌올: 14분", "200,000원", "31" , "7" ));
            list.add(new HomeDTO(R.drawable.car17, "자전거 한대 팜 ", "북구 동림동 끌올: 어제", "70,000원", "2" , "10" ));
            list.add(new HomeDTO(R.drawable.car14, "먹다 남은 과자 팔아요 ", "서구 광천동 끌올: 어제", "24,000,000원", "2" , "10" ));
            list.add(new HomeDTO(R.drawable.car10, "예쁜 책상의자 사실분~~", "지구 어딘가 끌올: 1시간 전", "100,000원", "4" , "5" ));
            list.add(new HomeDTO(R.drawable.car13, "추억의 과자 팝니다 ", "북구 동림동 끌올: 어제", "1000원", "2" , "1" ));
            list.add(new HomeDTO(R.drawable.car12, "대가족 식탁 예쁜거 한 셋 팔아요 ", "서구 금호동 끌올: 그제", "500,500원", "2" , "13" ));
            list.add(new HomeDTO(R.drawable.car15, "제네시스gv70 팝니다 ", "북구 동림동 끌올: 어제", "1,000,000원", "2" , "15" ));
            list.add(new HomeDTO(R.drawable.car11, "상태 좋은 아이패드 A급 팝니다", "서구 쌍촌동 끌올: 2시간 전", "230,000원", "7" , "3" ));
            list.add(new HomeDTO(R.drawable.car16, "오토바이 판매합니당", "북구 동림동 끌올: 어제", "700,000원", "2" , "10" ));


        HomeAdapter adapter = new HomeAdapter(inflater, list, getContext());
        recv_home = v.findViewById(R.id.recv_home);
        recv_home.setAdapter(new HomeAdapter(inflater, list, getContext()));
        recv_home.setAdapter(adapter);
        LinearLayoutManager manager = CommonMethod.getManager(getContext());
        recv_home.setLayoutManager(manager);

        return v;
    }
}