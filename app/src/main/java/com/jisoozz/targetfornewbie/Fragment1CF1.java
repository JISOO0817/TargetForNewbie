package com.jisoozz.targetfornewbie;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment1CF1 extends Fragment {

    TextView textView;
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1cf1, container, false);


        String str = "캐릭터를 클릭하면 \n특성을 볼 수 있어요.";
        textView = (TextView)rootView.findViewById(R.id.tv);
        SpannableStringBuilder ssb = new SpannableStringBuilder(str);
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#A2C6F3")),9,13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ssb);



        recyclerView = rootView.findViewById(R.id.recyclerView);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);


        showCharacter();


        return rootView;
    }

    private void showCharacter() {
        final CharacterAdapter adapter = new CharacterAdapter();

        adapter.addItem(new Character(R.drawable.nurse1,"의사","에밀리 다이어",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.lower,"변호사","프레디 라일리",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.doduk,"도둑","크리처  피어슨",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.gard1,"정원사","엠마 우즈",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.masulsa,"마술사","세르베르 로이",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.mohumga,"모험가","커트 프랭크",R.drawable.hsang,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.yongbung,"용병","나이브 수베다르",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.gun,"공군","마타 베함필",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.shamon,"샤먼","피오나 길먼",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.mecha,"기계공","트레이시 레즈닉",R.drawable.hsang,R.drawable.aha));
        adapter.addItem(new Character(R.drawable.forward,"포워드","윌리엄 엘리스",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.blood,"맹인","헬레나 아담스",R.drawable.hsang,R.drawable.aha));
        adapter.addItem(new Character(R.drawable.perfumer,"조향사","베라 나이르",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.cowboy,"카우보이","케빈 아유소",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.dancer,"무희","마가레타 젤러",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.seer,"선지자","일라이 클락",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.nabgwan,"납관사","이솝 칼",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.tamsa,"탐사원","노튼 캠벨",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.jusulsa,"주술사","패티샤.도리발",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.yamanin,"야만인","무어로",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.kokyesa,"곡예사","마이크 모튼",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.hanghaesa,"항해사","호세 바덴",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.bartender,"바텐더","데미 버번",R.drawable.hjung,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.uabu,"우편배달부","빅터 글랜즈",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.myozigi,"묘지기","앤드루 크리스",R.drawable.hha,R.drawable.asang));
        adapter.addItem(new Character(R.drawable.jasu,"죄수","루카 바르세이",R.drawable.hsang,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.gonchung,"곤충학자","메릴 플리니",R.drawable.hjung,R.drawable.ajung));
        adapter.addItem(new Character(R.drawable.hwaga,"화가","아이거 월든",R.drawable.hjung,R.drawable.question));
        adapter.addItem(new Character(R.drawable.hanguna,"행운아","추리용 분신",R.drawable.hjung,R.drawable.ajung));



        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnCharacterItemClickListener() {
            @Override
            public void onItemClick(CharacterAdapter.ViewHolder holder, View view, int position) {

                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.custom_toast);
                ImageView iv = (ImageView) dialog.findViewById(R.id.iv);
                TextView tv = (TextView) dialog.findViewById(R.id.tv);

                ImageView close = (ImageView) dialog.findViewById(R.id.close);


                Character item = adapter.getItem(position);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                switch (position) {
                    case 0:


                        iv.setImageResource(R.drawable.nm1);

                        break;
                    case 1:

                        iv.setImageResource(R.drawable.nlayer1);

                        break;
                    case 2:

                        iv.setImageResource(R.drawable.ntheef);

                        break;

                    case 3:

                        iv.setImageResource(R.drawable.ngarder);

                        break;

                    case 4:

                        iv.setImageResource(R.drawable.nmagician);

                        break;

                    case 5:

                        iv.setImageResource(R.drawable.nmohum);

                        break;

                    case 6:

                        iv.setImageResource(R.drawable.nyong);

                        break;

                    case 7:

                        iv.setImageResource(R.drawable.ngun);

                        break;

                    case 8:

                        iv.setImageResource(R.drawable.nsha);

                        break;

                    case 9:

                        iv.setImageResource(R.drawable.nmecha);

                        break;

                    case 10:

                        iv.setImageResource(R.drawable.nforward);

                        break;

                    case 11:

                        iv.setImageResource(R.drawable.nblind);

                        break;

                    case 12:

                        iv.setImageResource(R.drawable.nperfumer);

                        break;

                    case 13:

                        iv.setImageResource(R.drawable.ncow);

                        break;

                    case 14:

                        iv.setImageResource(R.drawable.ndancer);

                        break;

                    case 15:

                        iv.setImageResource(R.drawable.nseer);

                        break;

                    case 16:

                        iv.setImageResource(R.drawable.nnab);

                        break;

                    case 17:

                        iv.setImageResource(R.drawable.ntam);

                        break;

                    case 18:

                        iv.setImageResource(R.drawable.njusul);

                        break;

                    case 19:

                        iv.setImageResource(R.drawable.nyaman);

                        break;

                    case 20:

                        iv.setImageResource(R.drawable.ngok);

                        break;

                    case 21:

                        iv.setImageResource(R.drawable.nhang);

                        break;

                    case 22:

                        iv.setImageResource(R.drawable.nbartender);

                        break;

                    case 23:

                        iv.setImageResource(R.drawable.nbaedar);

                        break;

                    case 24:

                        iv.setImageResource(R.drawable.nmyo);

                        break;

                    case 25:

                        iv.setImageResource(R.drawable.njysu);

                        break;

                    case 26:

                        iv.setImageResource(R.drawable.ngoncung);


                        break;

                    case 27:

                        // iv.setImageResource(R.drawable.hlucky);


                        break;


                    case 28:

                        iv.setImageResource(R.drawable.hlucky);

                        break;

                }

                dialog.show();
            }
        });



    }

}
