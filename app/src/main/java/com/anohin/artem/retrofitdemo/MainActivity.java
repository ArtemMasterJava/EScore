package com.anohin.artem.retrofitdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anohin.artem.retrofitdemo.POJO.Model;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {
    String url = "http://dailydota2.com/match-api";
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)(findViewById(R.id.listView));


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
                    String[] matches  = response.body().getMatches();
                    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, matches);
                    listView.setAdapter(adapter);

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
