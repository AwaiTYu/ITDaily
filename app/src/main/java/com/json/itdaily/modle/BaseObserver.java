package com.json.itdaily.modle;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2017/11/14.
 */

public class BaseObserver<T> implements Observer<T> {
    protected Context mContext;

    public BaseObserver(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof HttpException) {
            // We had non-2XX http error
            Toast.makeText(mContext, "网络请求错误", Toast.LENGTH_SHORT).show();
        } else if (e instanceof IOException) {
            // A network or conversion error happened
            Toast.makeText(mContext, "IO流异常" + e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("tag", e.getMessage());
        } else if (e instanceof ApiException) {
            ApiException exception = (ApiException) e;
            Toast.makeText(mContext, exception.getMessage(), Toast.LENGTH_SHORT).show();
            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
            Toast.makeText(mContext, "真叫人头大", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onComplete() {

    }
}
