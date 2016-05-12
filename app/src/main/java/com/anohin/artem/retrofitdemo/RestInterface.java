package com.anohin.artem.retrofitdemo;

import com.anohin.artem.retrofitdemo.POJO.Match;
import com.anohin.artem.retrofitdemo.POJO.Model;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Artem on 06.05.2016.
 */
public interface RestInterface {
    @GET("/match-api")
    Call<Model> getMatchReport();
}

