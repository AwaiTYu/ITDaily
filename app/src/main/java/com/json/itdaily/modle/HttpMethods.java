package com.json.itdaily.modle;


import android.util.Log;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.json.itdaily.contact.Url;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Json on 2017/8/26.
 */

public class HttpMethods {
    //retrofit对象
    private Retrofit retrofit;
    private OkHttpClient.Builder client;
    private OkHttpClient okHttpClient;
    private Response data;

    public <T> T createService(Class<T> serviceClass) {
        client = new OkHttpClient.Builder();
        client.connectTimeout(100, TimeUnit.SECONDS);
        retrofit = new Retrofit.Builder()
                .client(getClient().build())
                .addConverterFactory(CustomGsonConverterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(Url.BASEURL)
                .build();
        return retrofit.create(serviceClass);
    }

    //在访问httpmethods的时候创建单列
    private static class SingletonHolder {
        private static final HttpMethods INSTANCE = new HttpMethods();
    }

    //获取单例
    public static HttpMethods getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public OkHttpClient.Builder getClient() {
        client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder builder1 = request.newBuilder();
                        return chain.proceed(builder1.build());
                    }
                }).retryOnConnectionFailure(true);
        client.connectTimeout(100, TimeUnit.SECONDS);
        return client;
    }

}


