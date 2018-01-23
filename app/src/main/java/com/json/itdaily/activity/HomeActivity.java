package com.json.itdaily.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.json.itdaily.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Bind(R.id.design_drawerlayout)
    Button designDrawerlayout;
    @Bind(R.id.design_floatingactionbutton)
    Button designFloatingactionbutton;
    @Bind(R.id.design_swipe)
    Button designSwipe;
    @Bind(R.id.design_cf)
    Button designCf;
    @Bind(R.id.design_ca)
    Button designCa;
    @Bind(R.id.design_ac)
    Button designAc;
    @Bind(R.id.blur)
    Button blur;
    @Bind(R.id.mzbanner)
    Button mzbanner;
    @Bind(R.id.rxjava)
    Button rxjava;
    @Bind(R.id.cache)
    Button cache;
    @Bind(R.id.map_gaode)
    Button mapGaode;
    @Bind(R.id.getMusic)
    Button getMusic;
    @Bind(R.id.Realm)
    Button Realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Realm,R.id.getMusic, R.id.map_gaode, R.id.cache, R.id.design_drawerlayout, R.id.design_floatingactionbutton, R.id.design_swipe, R.id.design_cf, R.id.design_ca, R.id.design_ac, R.id.blur, R.id.mzbanner, R.id.rxjava})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Realm:
                startActivity(new Intent(this,RealmSql.class));
                break;
            case R.id.getMusic:
                startActivity(new Intent(this, GetMusic.class));
                break;
            case R.id.cache:
                startActivity(new Intent(this, CacheActivity.class));
                break;
            case R.id.design_drawerlayout:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.design_floatingactionbutton:
                startActivity(new Intent(this, FloatingActionButtonActivity.class));
                break;
            case R.id.design_swipe:
                startActivity(new Intent(this, SwipeRefreshActivity.class));
                break;
            case R.id.design_cf:
                startActivity(new Intent(this, CoordinatorSnackbarActivity.class));
                break;
            case R.id.design_ca:
                startActivity(new Intent(this, CoordinatorAppBarActivity.class));
                break;
            case R.id.design_ac:
                startActivity(new Intent(this, AppBarCollapsingToolbarActivity.class));
                break;
            case R.id.blur:
                startActivity(new Intent(this, BlurActivity.class));
                break;
            case R.id.mzbanner:
                startActivity(new Intent(this, MZbannerActivity.class));
                break;
            case R.id.rxjava:
                startActivity(new Intent(this, RxjavaActivity.class));
                break;
            case R.id.map_gaode:
                startActivity(new Intent(this, GaoDeMap.class));
                break;
        }
    }
}
