package com.anohin.artem.retrofitdemo;

import com.anohin.artem.retrofitdemo.Model.League;
import com.anohin.artem.retrofitdemo.Model.Match;
import com.anohin.artem.retrofitdemo.Model.Model;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Artem on 06.05.2016.
 */
public interface RestInterface {
    @GET("/match-api")
    Call<Match> getMatchReport();
}

