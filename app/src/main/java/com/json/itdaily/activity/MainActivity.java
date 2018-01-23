package com.json.itdaily.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.json.itdaily.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_navigation)
    NavigationView mainNavigation;
    @Bind(R.id.main_deawer)
    DrawerLayout mainDeawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //默认是显示图片黑灰色，这个让他吧变成原始的颜色
        mainNavigation.setItemIconTintList(null);

        //头部点击事件
        View headview = mainNavigation.getHeaderView(0);
        headview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "最是人间留不住，朱颜辞镜花辞树", Toast.LENGTH_SHORT).show();
            }
        });
        //2.item点击事件
        mainNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    Toast.makeText(MainActivity.this, "主页", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}
