package com.json.itdaily.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.json.itdaily.R;
import com.json.itdaily.utils.DataCleanManager;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CacheActivity extends AppCompatActivity {

    @Bind(R.id.get)
    Button get;
    @Bind(R.id.clear)
    Button clear;
    @Bind(R.id.json)
    TextView json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.get, R.id.clear})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.get:
                String absolutePath = getApplicationContext().getCacheDir().getAbsolutePath();
                try {
                    String formatSize = DataCleanManager.getFormatSize(DataCleanManager.getFolderSize(getApplicationContext().getCacheDir()));
                    json.setText(absolutePath + "大小" + formatSize);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.clear:
                break;
        }
    }


}
