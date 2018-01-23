package com.json.itdaily.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.json.itdaily.R;
import com.json.itdaily.entity.FootBean;
import com.json.itdaily.entity.HKBean;
import com.json.itdaily.modle.ApiService;
import com.json.itdaily.modle.BaseObserver;
import com.json.itdaily.modle.HttpMethods;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RxjavaActivity extends AppCompatActivity {

    @Bind(R.id.login)
    Button login;
    @Bind(R.id.pwd)
    EditText pwd;
    @Bind(R.id.hk)
    Button hk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxjava);
        ButterKnife.bind(this);

        hk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpMethods.getInstance().createService(ApiService.class).HK("62").
                        subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread()).subscribe(new BaseObserver<HKBean>(RxjavaActivity.this) {
                    @Override
                    public void onSubscribe(Disposable d) {
                        super.onSubscribe(d);
                    }

                    @Override
                    public void onNext(HKBean hkBean) {
                        super.onNext(hkBean);
                        Toast.makeText(RxjavaActivity.this, hkBean.getResult().get(0).getGoods_name(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }

                    @Override
                    public void onComplete() {
                        super.onComplete();
                    }
                });
            }
        });
    }

    @OnClick(R.id.login)
    public void onViewClicked() {
        HttpMethods.getInstance().createService(ApiService.class).foot("6b0f53b3d922e248c26e893a4ec120d214f4846", "0")
                .subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new BaseObserver<FootBean>(RxjavaActivity.this) {
            @Override
            public void onSubscribe(Disposable d) {
                super.onSubscribe(d);
            }

            @Override
            public void onNext(FootBean footBean) {
                super.onNext(footBean);
                Toast.makeText(RxjavaActivity.this, footBean.getResult().get(0).getShop_title().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onComplete() {
                super.onComplete();
            }
        });

    }

}
