package com.json.itdaily.activity;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.json.itdaily.R;
import com.json.itdaily.bean.FileBean;
import com.json.itdaily.utils.FileManager;
import com.json.itdaily.utils.FileUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Json on 2017/12/27.
 */

public class GetMusic extends Activity {
    public static final String TAG = "GetMusic";
    @Bind(R.id.dialog)
    ProgressBar dialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getmusic);
        ButterKnife.bind(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        dialog.setVisibility(View.VISIBLE);
        MediaScannerConnection.scanFile(this, new String[]{Environment
                .getExternalStorageDirectory().getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() {
            @Override
            public void onScanCompleted(String path, Uri uri) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        dialog.setVisibility(View.GONE);
                        List<FileBean> filesByType = FileManager.getInstance(GetMusic.this).getFilesByType(FileUtils.TYPE_DOC);
                        Log.e(TAG, filesByType.toString());
                        Log.e(TAG, filesByType.size() + "数量");
                        for (FileBean bean : filesByType) {
                            Log.e(TAG, bean.path+"路径");

                        }
//                        List<Music> musics = FileManager.getInstance(GetMusic.this).getMusics();
//                        for (Music s : musics) {
//                            Log.e(TAG, s.getName());
//                        }
                    }
                });

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
