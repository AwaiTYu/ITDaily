package com.json.itdaily.modle;

import com.json.itdaily.entity.FootBean;
import com.json.itdaily.entity.HKBean;
import com.json.itdaily.entity.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/11/14.
 */

public interface ApiService {
    /**
     * 登录
     */
    @FormUrlEncoded
    @POST("index/Login/login")
    Observable<LoginBean> login(@Field("mobile") String user_name,
                                @Field("password") String Password);

    /**
     * 足迹
     */
    @FormUrlEncoded
    @POST("index/V1.User/footprint")
    Observable<FootBean> foot(@Field("token") String token,
                              @Field("page") String page);


    @FormUrlEncoded
    @POST("index/V1.Index/getCategoryGoods")
    Observable<HKBean> HK(@Field("category_id") String category_id);

}
