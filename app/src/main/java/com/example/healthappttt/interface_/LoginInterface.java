package com.example.healthappttt.interface_;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginInterface {
    String LOGIN_URL = "http://ec2-3-37-86-102.ap-northeast-2.compute.amazonaws.com/";

    @FormUrlEncoded
    @POST("retrofit_simplelogin.php")
    Call<String> getUserLogin(
            @Field("username") String username,
            @Field("password") String password
    );
}
