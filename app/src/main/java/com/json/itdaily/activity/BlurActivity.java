package com.json.itdaily.activity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.json.itdaily.R;

public class BlurActivity extends AppCompatActivity {
    ImageView blurimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur);
        blurimg = (ImageView) findViewById(R.id.blurimg);
        findViewById(R.id.blurbut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final Bitmap bitmap = ((BitmapDrawable) blurimg.getDrawable()).getBitmap();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                blurimg.setImageDrawable(BlurImageview.BlurImages(bitmap, BlurActivity.this));
                            }
                        });
                    }
                }).start();


            }
        });
    }
}
