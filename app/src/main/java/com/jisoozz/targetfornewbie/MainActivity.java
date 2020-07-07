package com.jisoozz.targetfornewbie;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Fragment1CF1 fragment1cf1;
    Fragment1CF2 fragment1cf2;
    Fragment1CF3 fragment1cf3;
    Fragment2CF1 fragment2cf1; //vp
    Fragment2CF2 fragment2cf2;
    Fragment2CF3 fragment2cf3;
    Fragment3CF1 fragment3cf1;
    BaroFragment barofragment;



    MapAdapter mapAdapter;
    SponAdapter sponAdapter;
    GameAdapter gameAdapter;

    Intent intent;

    mapList maplist;
    mapList maplist2;
    mapList maplist3;
    mapList maplist4;
    mapList maplist5;
    mapList maplist6;
    mapList maplist7;
    mapList maplist8;
    mapList maplist9;


    sponList sponlist;
    sponList sponlist2;
    sponList sponlist3;
    sponList sponlist4;
    sponList sponlist5;
    sponList sponlist6;
    sponList sponlist7;
    sponList sponlist8;
    sponList sponlist9;


    gameList gamelist;
    gameList gamelist2;
    gameList gamelist3;
    gameList gamelist4;
    gameList gamelist5;



    Toolbar toolbar;
    DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("제5인격 지식백과");


        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragment1cf1 = new Fragment1CF1();
        fragment1cf2 = new Fragment1CF2();
        fragment1cf3 = new Fragment1CF3();
        fragment2cf1 = new Fragment2CF1();
        fragment2cf2 = new Fragment2CF2();
        fragment2cf3 = new Fragment2CF3();
        fragment3cf1 = new Fragment3CF1();
        barofragment = new BaroFragment();



        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,fragment1cf1);
        transaction.addToBackStack(null);
        transaction.commit();

      //  getSupportFragmentManager().beginTransaction().add(R.id.container, fragment3cf3).commit();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });


        createPager();
        createPager2();
        createPager3();


    }



    public void createPager(){
        fragment2cf1 = new Fragment2CF1();
        mapAdapter = new MapAdapter(getSupportFragmentManager());

        setMopList(1,maplist);
        setMopList(2,maplist2);
        setMopList(3,maplist3);
        setMopList(4,maplist4);
        setMopList(5,maplist5);
        setMopList(6,maplist6);
        setMopList(7,maplist7);
        setMopList(8,maplist8);
        setMopList(9,maplist9);

        //프래그먼트 페이저에 어뎁터 전달
        fragment2cf1.setPager(mapAdapter);
    }


    public void createPager2(){
        fragment2cf2 = new Fragment2CF2();
        sponAdapter = new SponAdapter(getSupportFragmentManager());


        setSponList(1,sponlist);
        setSponList(2,sponlist2);
        setSponList(3,sponlist3);
        setSponList(4,sponlist4);
        setSponList(5,sponlist5);
        setSponList(6,sponlist6);
        setSponList(7,sponlist7);
        setSponList(8,sponlist8);
        setSponList(9,sponlist9);

        fragment2cf2.setPager2(sponAdapter);
    }

    public void createPager3(){
        fragment3cf1 = new Fragment3CF1();
        gameAdapter = new GameAdapter(getSupportFragmentManager());


        setGameList(1,gamelist);
        setGameList(2,gamelist2);
        setGameList(3,gamelist3);
        setGameList(4,gamelist4);
        setGameList(5,gamelist5);


        fragment3cf1.setPager3(gameAdapter);
    }





    public void setMopList(int num,mapList maplist){
        maplist = new mapList();

        if(num == 1){
            Bundle map1 = newMapList("군수공장",R.drawable.gunsu1,R.drawable.gunsu2,R.drawable.gunsu3,R.drawable.nulll,R.drawable.nulll);
            maplist.setArguments(map1);


        }
        else if(num == 2){
            Bundle map2 = newMapList("붉은성당",R.drawable.burk1,R.drawable.burk2,R.drawable.burk3,R.drawable.nulll,R.drawable.nulll);
            maplist.setArguments(map2);

        }
        else if(num == 3){
            Bundle map3 = newMapList("성심병원",R.drawable.seongsim1,R.drawable.seongsim2,R.drawable.seongsim3,R.drawable.nulll,R.drawable.nulll);
            maplist.setArguments(map3);

        }
        else if(num ==4){
            Bundle map4 = newMapList("에버슬리핑 타운",R.drawable.ever1,R.drawable.ever22,R.drawable.ever3,R.drawable.nulll,R.drawable.nulll);
            maplist.setArguments(map4);

        }
        else if(num == 5){
            Bundle map5 = newMapList("황금 석굴",R.drawable.gul1,R.drawable.gul2,R.drawable.gul3,R.drawable.nulll,R.drawable.nulll);
            maplist.setArguments(map5);

        }
        else if(num ==6){
            Bundle map6 = newMapList("호수마을",R.drawable.hosu1,R.drawable.hosu2,R.drawable.hosu3,R.drawable.hosu4,R.drawable.hosu5);
            maplist.setArguments(map6);

        }
        else if(num ==7){
            Bundle map7 = newMapList("달빛강공원",R.drawable.dal1,R.drawable.dal2,R.drawable.dal3,R.drawable.dal4,R.drawable.dal5);
            maplist.setArguments(map7);

        }
        else if(num == 8){
            Bundle map8 = newMapList("레오의 기억",R.drawable.reo1,R.drawable.reo2,R.drawable.reo3,R.drawable.reo4,R.drawable.reo5);
            maplist.setArguments(map8);

        }

        else if(num ==9){
            Bundle map9 = newMapList("화이트샌드가 정신병원",R.drawable.white1,R.drawable.white2,R.drawable.white3,R.drawable.white4,R.drawable.white5);
            maplist.setArguments(map9);

        }


        mapAdapter.addItem(maplist);
    }


    public void setSponList(int num2,sponList sponlist){
        sponlist = new sponList();

        if(num2 == 1){
            Bundle spon1 = newSponList("군수공장",R.drawable.sgm);
            sponlist.setArguments(spon1);


        }
        else if(num2 == 2){
            Bundle spon2 = newSponList("붉은성당",R.drawable.sbm);
            sponlist.setArguments(spon2);

        }
        else if(num2 == 3){
            Bundle spon3 = newSponList("성심병원",R.drawable.ssm);
            sponlist.setArguments(spon3);

        }
        else if(num2 ==4){
            Bundle spon4 = newSponList("에버슬리핑 타운",R.drawable.sem);
            sponlist.setArguments(spon4);

        }
        else if(num2 == 5){
            Bundle spon5 = newSponList("황금 석굴",R.drawable.shmm);
            sponlist.setArguments(spon5);

        }
        else if(num2 ==6){
            Bundle spon6 = newSponList("호수마을",R.drawable.shom);
            sponlist.setArguments(spon6);

        }else if(num2 ==7){
            Bundle spon7 = newSponList("달빛강공원",R.drawable.sdm);
            sponlist.setArguments(spon7);

        }else if(num2 ==8){
            Bundle spon8 = newSponList("레오의 기억",R.drawable.srm);
            sponlist.setArguments(spon8);

        }else if(num2 ==9){
            Bundle spon9 = newSponList("화이트샌드가 정신병원",R.drawable.shm);
            sponlist.setArguments(spon9);

        }


        sponAdapter.addItem(sponlist);
    }


    public void setGameList(int num3,gameList gamelist){
        gamelist = new gameList();

        if(num3 == 1){
            Bundle game1 = newGameList(R.drawable.dmlwl1);
            gamelist.setArguments(game1);


        }
        else if(num3 == 2){
            Bundle game2 = newGameList(R.drawable.shmm);
            gamelist.setArguments(game2);

        }
        else if(num3 == 3){
            Bundle game3 = newGameList(R.drawable.shmm);
            gamelist.setArguments(game3);

        }
        else if(num3 ==4){
            Bundle game4 = newGameList(R.drawable.shmm);
            gamelist.setArguments(game4);

        }
        else if(num3 == 5){
            Bundle game5 = newGameList(R.drawable.shmm);
            gamelist.setArguments(game5);

        }


        gameAdapter.addItem(gamelist);
    }




    public Bundle newMapList(String tv1,int image1,int image2,int image3, int image4, int image5){
        Bundle map = new Bundle();
        map.putString("tv1",tv1);
        map.putInt("image1",image1);
        map.putInt("image2",image2);
        map.putInt("image3",image3);
        map.putInt("image4",image4);
        map.putInt("image5",image5);



        return map;
    }


    public Bundle newSponList(String tv,int img1){
        Bundle spon = new Bundle();
        spon.putString("tv",tv);
        spon.putInt("img1",img1);



        return spon;
    }


    public Bundle newGameList(int ima){
        Bundle game = new Bundle();

        game.putInt("ima",ima);


        return game;
    }





    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu1) {

            onFragmentSelected(0, null);
        } else if (id == R.id.menu2) {

            onFragmentSelected(1, null);
        } else if (id == R.id.menu3) {

            onFragmentSelected(2, null);
        } else if (id == R.id.menu4) {

        onFragmentSelected(3, null);
        } else if (id == R.id.menu5) {

            onFragmentSelected(4, null);
        } else if (id == R.id.menu6) {

            onFragmentSelected(5, null);
        } else if (id == R.id.menu7) {

            onFragmentSelected(6, null);

        } else if (id == R.id.menu8) {

            onFragmentSelected(7, null);

        }



        drawer.closeDrawer(GravityCompat.START);

        return true;
    }


    public void onFragmentSelected(int position, Bundle bundle) {
        Fragment curFragment = null;

        if (position == 0) {
            curFragment = fragment1cf1;
            toolbar.setTitle("생존자");
        } else if (position == 1) {
            curFragment = fragment1cf2;
            toolbar.setTitle("인격");
        }
        else if (position == 2) {
            curFragment = fragment1cf3;
            toolbar.setTitle("용어");

        }else if (position == 3) {
            curFragment = fragment2cf1;
            createPager();
            toolbar.setTitle("지하통로");
        }else if (position == 4) {
            curFragment = fragment2cf2;
            createPager2();
            toolbar.setTitle("스폰위치");
        }else if (position == 5) {
            curFragment = fragment2cf3;
            toolbar.setTitle("매크로");
        }else if (position == 6) {
            curFragment = fragment3cf1;
            createPager3();
            toolbar.setTitle("커스텀 게임");

        }else if (position == 7) {
            curFragment = barofragment;
            toolbar.setTitle("바로가기");

        }

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,curFragment);
        transaction.addToBackStack(null);
        transaction.commit();

//        getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
    }



}