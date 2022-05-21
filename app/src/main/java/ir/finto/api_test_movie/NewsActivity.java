package ir.finto.api_test_movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ir.finto.api_test_movie.Adapter.NewsAdapter;
import ir.finto.api_test_movie.Api.ApiClient;
import ir.finto.api_test_movie.Api.NewApiInterface;
import ir.finto.api_test_movie.Model.BaseNews;
import ir.finto.api_test_movie.Model.News;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsActivity extends AppCompatActivity {

    RecyclerView rvNews;
    List<News> list = new ArrayList<>();
    NewsAdapter adapter;
    NewApiInterface requset;

    String url = "https://free-news.p.rapidapi.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        requset = ApiClient.GetApiClient(url).create(NewApiInterface.class);
        rvNews = findViewById(R.id.rv_News);
        rvNews.setLayoutManager(new GridLayoutManager(this,1));
        rvNews.setHasFixedSize(true);

        Call<BaseNews> call =requset.getNews("ns9Hk2t-x1fJH3gtp3BZAM0sHFM21wcSRM7O-futFqM","Iran","en","1","25");

        call.enqueue(new Callback<BaseNews>() {
            @Override
            public void onResponse(Call<BaseNews> call, Response<BaseNews> response) {
                list = response.body().getArticles();
                adapter = new NewsAdapter(getApplicationContext(),list);
                rvNews.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<BaseNews> call, Throwable t) {

            }
        });
    }
}