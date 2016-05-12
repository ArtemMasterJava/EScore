package com.anohin.artem.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.anohin.artem.retrofitdemo.POJO.Model;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {
    String url = "http://dailydota2.com/match-api";
    TextView txt_team1, txt_league, txt_team2, txt_viewers, txt_scores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_league = (TextView)(findViewById(R.id.txt_league));
        txt_scores = (TextView)(findViewById(R.id.txt_scores));
        txt_team1 = (TextView)(findViewById(R.id.txt_team1));
        txt_team2 = (TextView)(findViewById(R.id.txt_team2));
        txt_viewers = (TextView)(findViewById(R.id.txt_viewers));

        getReport();
    }
    void getReport(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RestInterface service = retrofit.create(RestInterface.class);

        final Call<Model> call = service.getMatchReport();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Response<Model> response, Retrofit retrofit) {

                try {
                    String league = response.body().getLeague().getName();

                /*    String scores = response.body().seriesType.toString();

                    String viewers = response.body().viewers.getSelf();

                    String team1 = response.body().team1.getTeamName();

                    String team2 = response.body().team2.getTeamName();
                */
                    txt_league.setText("league  :  " + league);
                /*    txt_scores.setText("scores  :  " + scores);
                    txt_team1.setText("team1  : " + team1);
                    txt_team2.setText("team2  :  " + team2);
                    txt_viewers.setText("viewers  :  " + viewers);
                */
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
