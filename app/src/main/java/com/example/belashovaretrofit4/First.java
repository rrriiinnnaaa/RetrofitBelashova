package com.example.belashovaretrofit4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.firstlayout);
    }

    public void onClick1(View view) {
        GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);
        final Call<List<Contributor>> call =
                gitHubService.repoContributors("square", "picasso");

        call.enqueue(new Callback<List<Contributor>>() {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                final TextView textView = (TextView) findViewById(R.id.textView);
                String[] res = response.body().toString().split(",");
                String[] res2 = response.body().toString().split(";");

                StringBuilder build2 = new StringBuilder();
                for(int i=0;  i < res2.length; i++)
                {
                    build2.append(res2[i]);
                    build2.append("\n");
                }
                StringBuilder build = new StringBuilder();
                for(int i = 0; i < res.length; i++)
                {
                    build.append(res[i]);
                    build.append("\n");
                }
                textView.setText(build2.toString());
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable throwable) {
                final TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Что-то пошло не так: " + throwable.getMessage());
            }
        });
    }
}
