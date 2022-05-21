package ir.finto.api_test_movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ir.finto.api_test_movie.Adapter.FakeNewsAdapter;
import ir.finto.api_test_movie.Adapter.NewsAdapter;
import ir.finto.api_test_movie.Api.ApiClient;
import ir.finto.api_test_movie.Api.FakeNewsApiInterface;
import ir.finto.api_test_movie.Api.NewApiInterface;
import ir.finto.api_test_movie.Model.BaseFakeNews;
import ir.finto.api_test_movie.Model.BaseNews;
import ir.finto.api_test_movie.Model.FakeNews;
import ir.finto.api_test_movie.Model.News;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FakeNewsActivity extends AppCompatActivity {
    RecyclerView rvFakeNews;
    List<FakeNews> list = new ArrayList<>();
    FakeNewsAdapter adapter;
    FakeNewsApiInterface requset;

    String url = "https://newsapi.org/v2/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_news);

        requset = ApiClient.GetApiClient(url).create(FakeNewsApiInterface.class);
        rvFakeNews = findViewById(R.id.rv_FakeNews);
        rvFakeNews.setLayoutManager(new GridLayoutManager(this,1));
        rvFakeNews.setHasFixedSize(true);

        Call<BaseFakeNews> call =requset.getNews("f9e98e65a44640068baede0cd6980aa2","Tesla");

        call.enqueue(new Callback<BaseFakeNews>() {
            @Override
            public void onResponse(Call<BaseFakeNews> call, Response<BaseFakeNews> response) {

//                Toast.makeText(getApplicationContext(),"Step 1",Toast.LENGTH_SHORT).show();

                list = response.body().getArticles();
                adapter = new FakeNewsAdapter(getApplicationContext(),list);
                rvFakeNews.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<BaseFakeNews> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Error : " + t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}