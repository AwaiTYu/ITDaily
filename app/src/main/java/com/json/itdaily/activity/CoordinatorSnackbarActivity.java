package com.json.itdaily.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.json.itdaily.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CoordinatorSnackbarActivity extends AppCompatActivity {

    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_snackbar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        Snackbar.make(fab, "FAB", Snackbar.LENGTH_LONG)
                .setAction("cancel", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //这里的单击事件代表点击消除Action后的响应事件
                        Toast.makeText(CoordinatorSnackbarActivity.this, "轻轻地我走了，正如我轻轻地来", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }
}
