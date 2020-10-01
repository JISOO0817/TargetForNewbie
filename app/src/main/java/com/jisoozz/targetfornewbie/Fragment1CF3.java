package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragment1CF3 extends Fragment {


    private RecyclerView recyclerView;
    private EditText searchEt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1cf3, container, false);


        recyclerView = rootView.findViewById(R.id.recyclerView);
        searchEt = rootView.findViewById(R.id.searchEt);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();

        ExpandableListAdapter.Item a0 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "감표");
        a0.invisibleChildren = new ArrayList<>();
        a0.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "감정표현의 준말. "));
        data.add(a0);

        ExpandableListAdapter.Item a = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "그님티");
        a.invisibleChildren = new ArrayList<>();
        a.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "그래서 님 티어가? 의 준말이다."));
        data.add(a);

        ExpandableListAdapter.Item b = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "귀집");
        b.invisibleChildren = new ArrayList<>();
        b.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "귀신의 집의 준말이다."));
        b.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "유저들끼리 하는 연합 커스텀 게임을 말한다."));
        data.add(b);

        ExpandableListAdapter.Item nn = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "나남즐");
        nn.invisibleChildren = new ArrayList<>();
        nn.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "나쁜 남자 즐연커의 준말."));
        nn.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "유저들끼리 하는 연합 커스텀 게임을 말한다."));
        data.add(b);

        ExpandableListAdapter.Item c = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "디코");
        c.invisibleChildren = new ArrayList<>();
        c.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "디스코드의 준말이다."));
        c.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "일반게임이나 랭크게임 등 디코를 이용해 유저들끼리 대화하며 게임할 수 있다."));
        data.add(c);

        ExpandableListAdapter.Item d = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "맵맛플");
        d.invisibleChildren = new ArrayList<>();
        d.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "매운맛 플연커의 준말이다."));
        d.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "유저들끼리 하는 연합 커스텀 게임중의 하나로 유저들끼리 서로 작업을 걸며 노는 게임이다."));
        data.add(d);

        ExpandableListAdapter.Item d2 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "벌레컷(버그컷)");
        d2.invisibleChildren = new ArrayList<>();
        d2.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "감시자에게 빨리 잡힌 생존자를 보고 벌레컷 당했다고 말한다."));
        data.add(d2);


        ExpandableListAdapter.Item e1 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "바상");
        e1.invisibleChildren = new ArrayList<>();
        e1.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바람의 상처의 준말이다."));
        e1.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "감시자 리퍼의 스킬을 말한다."));
        data.add(e1);

        ExpandableListAdapter.Item e2 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "벽총");
        e2.invisibleChildren = new ArrayList<>();
        e2.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "감시자가 아닌 벽(장애물)에 신호총을 쏜 것을 말한다."));
        data.add(e2);

        ExpandableListAdapter.Item e3 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "볼탱귀");
        e3.invisibleChildren = new ArrayList<>();
        e3.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "볼 탱탱 귀요미의 준말이다."));
        e3.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "주로 의사를 볼탱귀라고 한다."));

        data.add(e3);

        ExpandableListAdapter.Item e = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "빠대");
        e.invisibleChildren = new ArrayList<>();
        e.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "빠른 대전의 준말이다. (일겜)"));
        data.add(e);

        ExpandableListAdapter.Item f = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "빡커");
        f.invisibleChildren = new ArrayList<>();
        f.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "빡센 커스텀의 준말이다."));
        data.add(f);


        ExpandableListAdapter.Item f1 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "빡빡이");
        f1.invisibleChildren = new ArrayList<>();
        f1.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "기계공의 기계를 빡빡이라고 부른다."));
        data.add(f1);



        ExpandableListAdapter.Item g = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "솔랭");
        g.invisibleChildren = new ArrayList<>();
        g.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "솔로 랭크 게임의 준말이다."));
        g.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "랭을 혼자 돌린다는 뜻이다."));
        data.add(g);

        ExpandableListAdapter.Item h = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "숨꼭");
        h.invisibleChildren = new ArrayList<>();
        h.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "숨바꼭질의 준말이다."));
        h.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "유저들끼리 하는 연합커스텀 게임의 한 종류이다."));
        data.add(h);

        ExpandableListAdapter.Item i = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "아드각");
        i.invisibleChildren = new ArrayList<>();
        i.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아드각은 마지막 해독기가 99%로 아드(3시인격) 를 발동시킬 준비가 되었다는 뜻이다."));
        data.add(i);

        ExpandableListAdapter.Item j = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "연감");
        j.invisibleChildren = new ArrayList<>();
        j.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "연합사냥 감시자의 준말이다."));
        data.add(j);

        ExpandableListAdapter.Item k = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "연커");
        k.invisibleChildren = new ArrayList<>();
        k.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "연합사냥 커스텀의 준말이다."));
        k.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "(즐연커는 즐거운 연합 커스텀으로 유저들끼리 재미있게 노는 유저커스텀 게임이다.)"));
        data.add(k);

        ExpandableListAdapter.Item l = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "일겜");
        l.invisibleChildren = new ArrayList<>();
        l.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "일반 게임의 준말이다."));
        data.add(l);

        ExpandableListAdapter.Item m = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "의지");
        m.invisibleChildren = new ArrayList<>();
        m.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "의사를 지켜라의 준말이다."));
        m.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "유저들끼리 하는 연합 커스텀 게임중의 하나이다."));
        data.add(m);


        ExpandableListAdapter.Item m2q = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "잠식");
        m2q.invisibleChildren = new ArrayList<>();
        m2q.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "생존자의 의자 게이지가 50% (절반) 이 넘은 것을 말한다."));
        m2q.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "잠식구출은 50% 넘기고 구출하는 것을 말한다."));
        data.add(m2q);


        ExpandableListAdapter.Item m2 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "지렁사");
        m2.invisibleChildren = new ArrayList<>();
        m2.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "생존자를 의자에 앉히지 않고 기절상태로 오래두어 죽는 걸 말한다.(말라죽음)"));
        m2.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "고의지렁사는 비매너 플레이로 불리며, 감시자가 생존자를 일부러 앉히지 않고 말려죽이는 것을 말한다."));
        data.add(m2);

        ExpandableListAdapter.Item m3 = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "칼향수");
        m3.invisibleChildren = new ArrayList<>();
        m3.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "향수아이템로 감시자의 공격에 빠르게 반응했다는 말이다."));
        m3.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "감시자에게 맞기전에  향수를 쓰고 맞은 후 향수를 다시 클릭해서 돌아오면 피가 다시 회복이 되는데, 이 반응이 빨랐다는 의미이다."));
        data.add(m3);


        ExpandableListAdapter.Item n = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "패작");
        n.invisibleChildren = new ArrayList<>();
        n.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "패작은 고의적으로 게임을 패배시키도록 하는 것이다."));
        n.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아오지 패작은 생존자 네 명이서 지하감옥(아오지)으로 가서 하는 패작이다."));
        data.add(n);

        ExpandableListAdapter.Item o = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "O할");
        o.invisibleChildren = new ArrayList<>();
        o.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "승률을 뜻하는데, 3할은 30퍼대 4할은 40퍼대 5할은 50퍼대를 말한다."));
        o.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "주로 전챗에서 볼 수 있으며, 랭크게임 팀원을 구할 때 자주 쓴다."));
        data.add(o);

        recyclerView.setAdapter(new ExpandableListAdapter(data));



        return rootView;
    }

}
