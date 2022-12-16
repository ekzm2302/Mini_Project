package com.example.mini_project.location;

import android.content.Intent;
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
import com.example.mini_project.cp.CpAdapter;
import com.example.mini_project.cp.CpDTO;

import java.util.ArrayList;


public class LocationFragment extends Fragment {
    RecyclerView recv_item, recv_story, recv_job, recv_shop, recv_cp;
    ArrayList<ItemDTO> list;
    ArrayList<StoryDTO> story;
    ArrayList<JobDTO> jobs;
    ArrayList<JobDTO2> jobs2;
    ArrayList<JobDTO3> jobs3;
    ArrayList<ShopDTO> shop;
    ArrayList<CpDTO> cplist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_location, container, false);

       // 상품리스트
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

      // 당근 나의 이야기
      recv_story = v.findViewById(R.id.recv_story);
        story = new ArrayList<>();
        story.add(new StoryDTO(R.drawable.story2, R.drawable.story3));
        story.add(new StoryDTO(R.drawable.story1, R.drawable.story4));
        StoryAdapter stadapter = new StoryAdapter(inflater, story);
        recv_story.setAdapter(stadapter);
        recv_story.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));


        // 걸어서 갈 수 있는 우리동네 알바 1
        recv_job = v.findViewById(R.id.recv_job);
        jobs = new ArrayList<>();
        jobs.add(new JobDTO(R.drawable.job1, "밀알한우", "양산동", "2km", "농업회사법인주식회사 밀알한우", "200 만원"));
        jobs.add(new JobDTO(R.drawable.job4, "맥도날드", "양산동", "3km", "카운터& 라이더 구해요", "시급 10,000원"));

        // 걸어서 갈 수 있는 우리동네 알바 2
        jobs2 = new ArrayList<>();
        jobs2.add(new JobDTO2(R.drawable.job2, "대신축산물유통", "양산동", "2.1km", "정육 일 배우면서 일 하실 정규...", "시급 9,620원"));
        jobs2.add(new JobDTO2(R.drawable.job5, "롯데리아", "본촌동", "3.5km", "라이더 & 카운터 구해요!!", "시급 9,800원"));

        // 걸어서 갈 수 있는 우리동네 알바 3
        jobs3 = new ArrayList<>();
        jobs3.add(new JobDTO3(R.drawable.job3, "바다수퍼 조개구이", "양산동", "2.2km", "조개구이집 주방이모", "180 만원"));
        jobs3.add(new JobDTO3(R.drawable.job6, "버거킹", "본촌동", "4km", "가족같은 분위기 버거킹", "160 만원"));

        JobAdapter jobAdapter = new JobAdapter(inflater, jobs, jobs2, jobs3);
        recv_job.setAdapter(jobAdapter);
        recv_job.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));


        // 이웃들의 추천 가게
        recv_shop = v.findViewById(R.id.recv_shop);
        shop = new ArrayList<>();
        shop.add(new ShopDTO(R.drawable.shop1, "24시 스터디카페& 프독", "24시 스터디카페&프리미엄독서실 문흥동 광주", "3Km", "후기 4", "단골 26"
                                                , "작은삶", "새로운 분위기 ~ 깔끔하고 좋은공기 적합한 공부불빛~ 티코너에 퍈의시설 듬뿍이 공부하시고 가세요"));

        shop.add(new ShopDTO(R.drawable.shop2, "블레드치킨", "100%오트밀(귀리)로 만든 후라이드 (국내최초)!", "4Km", "후기 3", "단골 9"
                , "Renault", "발행해주신 쿠폰으로 정말 저렴하게 너무 맜있는 치킨을 먹었습니다. 확실히 드셔보셔도 후회안합니다"));

        shop.add(new ShopDTO(R.drawable.shop3, "프리미엄 카살롱 출장세차", "저희 Car Salon은 마진율을 낮추고 고객님들의 ", "4.9Km", "후기 60", "단골 523"
                , "안녕봄", "연락드리면 빠르고 치절하게 답변해주세요 외부주차장만 있는 단지라 비오는날도 눈오는날도 좋아요"));

      shop.add(new ShopDTO(R.drawable.shop4, "광주 촘촘망 방충망", "텍스토머 촘촘망 공식 시공 가맹점 광주 촘촘망", "3.1Km", "후기 8", "단골 36"
              , "오잉", "친절하시고 시간약속도 잘지키세요~ 가격도 착하구요~ 대만족입니다^^ 저희 아래층도 하기로했어요"));

      shop.add(new ShopDTO(R.drawable.shop5, "네이처컬렉션 오치점", "LG화장품 토탈 편집샵 더페이스샵/이자녹스 등등", "3.4Km", "후기 27", "단골 168"
              , "깎아달라하면차단합니다", "좋은 크림을 무료로 받아서 너무 기뻤어요 유통기한도 엄청 넉넉하고 화장품도 너무 좋아요"));

      shop.add(new ShopDTO(R.drawable.shop6, "루네디뷰티", "속눈썹펌/페이스왁싱 전문샵 루네디뷰티 [CJ...]", "3Km", "후기 8", "단골 43"
              , "제발옷장정리하자", "굿 너무너무 만족합니다 단골등록 꾹 했어요 잡초자라면 또 뽑고 또뽑아야합니다 ㅎㅎㅎ"));

        ShopAdapter shopAdapter = new ShopAdapter(inflater, shop);
        recv_shop.setAdapter(shopAdapter);
        recv_shop.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));



        // 우리동네 인기쿠폰
       recv_cp = v.findViewById(R.id.recv_cp);
        cplist = new ArrayList<>();
        cplist.add(new CpDTO(R.drawable.cp1, "피굽남피자6호점", "2.5km", "첫 방문 30%할인"
                        , "레닌그라드", "가게가 깔끔하고 관리가 만족스러웠어요.."));

        cplist.add(new CpDTO(R.drawable.cp1, "피굽남피자6호점", "2.5km", "첫 방문 30%할인"
                , "레닌그라드", "가게가 깔끔하고 관리가 만족스러웠어요.."));

        cplist.add(new CpDTO(R.drawable.cp1, "피굽남피자6호점", "2.5km", "첫 방문 30%할인"
                , "레닌그라드", "가게가 깔끔하고 관리가 만족스러웠어요.."));

        CpAdapter cpAdapter = new CpAdapter(inflater, cplist);
        recv_cp.setAdapter(cpAdapter);
        recv_cp.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        return v;
    }
}