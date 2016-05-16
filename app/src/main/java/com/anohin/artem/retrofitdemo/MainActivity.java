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
    TextView textView_match1_team1, textView_match1_team2, textView_match1_score,
            textView_match2_team1, textView_match2_team2, textView_match2_score,
            textView_match3_team1, textView_match3_team2, textView_match3_score,
            textView_match4_team1, textView_match4_team2, textView_match4_score,
            textView_match1_score2, textView_match2_score2, textView_match3_score2,
            textView_match4_score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_match1_team1 = (TextView) (findViewById(R.id.textView_match1_team1));
        textView_match2_team1 = (TextView) (findViewById(R.id.textView_match2_team1));
        textView_match3_team1 = (TextView) (findViewById(R.id.textView_match3_team1));
        textView_match4_team1 = (TextView) (findViewById(R.id.textView_match4_team1));
        textView_match1_team2 = (TextView) (findViewById(R.id.textView_match1_team2));
        textView_match2_team2 = (TextView) (findViewById(R.id.textView_match2_team2));
        textView_match3_team2 = (TextView) (findViewById(R.id.textView_match3_team2));
        textView_match4_team2 = (TextView) (findViewById(R.id.textView_match4_team2));
        textView_match1_score = (TextView) (findViewById(R.id.textView_match1_score));
        textView_match2_score = (TextView) (findViewById(R.id.textView_match2_score));
        textView_match3_score = (TextView) (findViewById(R.id.textView_match3_score));
        textView_match4_score = (TextView) (findViewById(R.id.textView_match4_score));
        textView_match1_score2 = (TextView) (findViewById(R.id.textView_match1_score2));
        textView_match2_score2 = (TextView) (findViewById(R.id.textView_match2_score2));
        textView_match3_score2 = (TextView) (findViewById(R.id.textView_match3_score2));
        textView_match4_score2 = (TextView) (findViewById(R.id.textView_match4_score2));


        getReport();
    }

    void getReport() {
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
                    String match1Team1 = response.body().getMatches().get(0).getTeam1().getTeamName();
                    String match1Team2 = response.body().getMatches().get(0).getTeam2().getTeamName();
                    String match1Score = response.body().getMatches().get(0).getTeam1().getScore();
                    String match1Score2 = response.body().getMatches().get(0).getTeam2().getScore();
                    String match2Team1 = response.body().getMatches().get(1).getTeam1().getTeamName();
                    String match2Team2 = response.body().getMatches().get(1).getTeam2().getTeamName();
                    String match2Score = response.body().getMatches().get(1).getTeam1().getScore();
                    String match2Score2 = response.body().getMatches().get(1).getTeam2().getScore();
                    String match3Team1 = response.body().getMatches().get(2).getTeam1().getTeamName();
                    String match3Team2 = response.body().getMatches().get(2).getTeam2().getTeamName();
                    String match3Score = response.body().getMatches().get(2).getTeam1().getScore();
                    String match3Score2 = response.body().getMatches().get(2).getTeam2().getScore();
                    String match4Team1 = response.body().getMatches().get(3).getTeam1().getTeamName();
                    String match4Team2 = response.body().getMatches().get(3).getTeam2().getTeamName();
                    String match4Score = response.body().getMatches().get(3).getTeam1().getScore();
                    String match4Score2 = response.body().getMatches().get(3).getTeam2().getScore();

                    textView_match1_team1.setText(match1Team1);
                    textView_match1_team2.setText(match1Team2);
                    textView_match1_score.setText(match1Score);
                    textView_match1_score2.setText(match1Score2);
                    textView_match2_team1.setText(match2Team1);
                    textView_match2_team2.setText(match2Team2);
                    textView_match2_score.setText(match2Score);
                    textView_match2_score2.setText(match2Score2);
                    textView_match3_team1.setText(match3Team1);
                    textView_match3_team2.setText(match3Team2);
                    textView_match3_score.setText(match3Score);
                    textView_match3_score2.setText(match3Score2);
                    textView_match4_team1.setText(match4Team1);
                    textView_match4_team2.setText(match4Team2);
                    textView_match4_score.setText(match4Score);
                    textView_match4_score2.setText(match4Score2);


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
