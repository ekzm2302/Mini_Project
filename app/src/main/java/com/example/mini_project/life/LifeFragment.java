package com.example.mini_project.life;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mini_project.PopupDTO;
import com.example.mini_project.R;
import com.example.mini_project.Setting.SettingActivity;
import com.example.mini_project.home.HomeActivity;
import com.example.mini_project.search.SearchActivity;

import java.util.ArrayList;
import java.util.List;

public class LifeFragment extends Fragment {
    RecyclerView recv_card, recv_dong;
    ArrayList<CardDTO> list;
    ArrayList<DongDTO> list2;
    ImageView search, home_ic_add;
    TextView tv_loc_dong;

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
       list2.add(new DongDTO(R.drawable.car15, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "우주를떠나", "용두동", "5분 전"));
       list2.add(new DongDTO(R.drawable.image123, "동네질문", "이 캐릭터 이름이 뭐죠?", "스폰지", "금호동", "10분 전"));
       list2.add(new DongDTO(R.drawable.car1, "취미생활", "킥보드 어디껀가요?", "킥보드매니아", "상무지구", "13분 전"));
       list2.add(new DongDTO(R.drawable.car13, "동네생활", "추억의 과자 맛있는데 어디서 팔아요?", "과자먹고싶어", "용두동", "20분 전"));
       list2.add(new DongDTO(R.drawable.wndrh4, "분실/실종센터", "제 애완동물인데 찾아주세요", "찾아줘", "첨단1지구", "33분 전"));
       list2.add(new DongDTO(R.drawable.car5, "동네생활", "길에서 주운 아이템들은 어떻게 하면 좋을까용???", "에어컨드림", "용두동", "36분 전"));
       list2.add(new DongDTO(R.drawable.car17, "동네소식", "자전거 선착순 한명 드립니다", "공짜", "첨단2지구", "1시간 전"));
       list2.add(new DongDTO(R.drawable.car11, "동네질문", "아이패드 샀는데 기능을 모르겠어요 알려주세요!", "아이폰몰라", "쌍촌동", "하루 전"));
       list2.add(new DongDTO(R.drawable.car3, "취미생활", "마당 정리좀 했습니다 예쁘죠?", "아몰라", "담양", "이틀 전"));

       DongAdapter adapter1 = new DongAdapter(inflater, getContext(), list2);
       recv_dong.setAdapter(adapter1);
       recv_dong.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        // 검색
        search = (ImageView) v.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SearchActivity.class);
                getActivity().startActivity(intent);
                getActivity().overridePendingTransition(R.anim.out_right, R.anim.out_left);
            }

        });

        tv_loc_dong = (TextView) v.findViewById(R.id.tv_loc_dong);
        tv_loc_dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                getActivity().startActivity(intent);
                getActivity().overridePendingTransition(R.anim.out_bottom2, R.anim.out_top2);
            }
        });

        home_ic_add = (ImageView) v.findViewById(R.id.home_ic_add);
        ArrayList<PopupDTO> poplist = new ArrayList<>();
        home_ic_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_ic_add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final PopupMenu popupMenu = new PopupMenu(getContext(), v);
                        getActivity().getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());

                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                if (item.getItemId() == R.id.action_menu1){
                                    Intent intent = new Intent(getActivity(), LifeActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(getContext(), "알바 점검중!", Toast.LENGTH_SHORT).show();
                                }else if (item.getItemId() == R.id.action_menu2){
                                    Intent intent = new Intent(getActivity(), LifeActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(getContext(), "과외/클래스 점검중!", Toast.LENGTH_SHORT).show();
                                }else if(item.getItemId() == R.id.action_menu3){
                                    Intent intent = new Intent(getActivity(), LifeActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(getContext(), "농수산물 점검중!", Toast.LENGTH_SHORT).show();
                                }else if(item.getItemId() == R.id.action_menu4){
                                    Intent intent = new Intent(getActivity(), LifeActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(getContext(), "부동산 점검중!", Toast.LENGTH_SHORT).show();
                                }else if(item.getItemId() == R.id.action_menu5){
                                    Intent intent = new Intent(getActivity(), LifeActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(getContext(), "중고차 점검중!", Toast.LENGTH_SHORT).show();
                                }

                                return false;
                            }
                        });
                        popupMenu.show();
                    }

                });

            }
        });
// 새로고침
        SwipeRefreshLayout swipeLayout;
        swipeLayout = (SwipeRefreshLayout) v.findViewById(R.id.swipeLayout);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeLayout.setRefreshing(false);
            }
        });
        return v;
    }

}