package com.json.itdaily.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.json.itdaily.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SwipeRefreshActivity extends AppCompatActivity {

    @Bind(R.id.swipe)
    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh);
        ButterKnife.bind(this);

        // 设置下拉进度的背景颜色，默认就是白色的
        swipe.setProgressBackgroundColorSchemeResource(android.R.color.white);
        // 设置下拉进度的主题颜色
        swipe.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(SwipeRefreshActivity.this, "swipe控件", Toast.LENGTH_SHORT).show();
                                    // 加载完数据设置为不刷新状态，将下拉进度收起来
                                    swipe.setRefreshing(false);
                                }
                            });
                        } catch (InterruptedException e) {
                        }
                    }
                }).start();
            }
        });
    }
}
