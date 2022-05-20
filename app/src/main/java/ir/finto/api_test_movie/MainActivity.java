package ir.finto.api_test_movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ir.finto.api_test_movie.Adapter.MovieAdapter;
import ir.finto.api_test_movie.Api.ApiClient;
import ir.finto.api_test_movie.Api.ApiInterface;
import ir.finto.api_test_movie.Model.BaseModel;
import ir.finto.api_test_movie.Model.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvInfo;
    List<Result> list = new ArrayList<>();
    MovieAdapter adapter;
    ApiInterface request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request = ApiClient.GetApiClient().create(ApiInterface.class);
        rvInfo = findViewById(R.id.rv_Info);
        rvInfo.setLayoutManager(new GridLayoutManager(this,2));
        rvInfo.setHasFixedSize(true);

        Call<BaseModel> call = request.getMovies("4a2a2604b86c68029752971e4fdb66fe");

        call.enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {

                list = response.body().getResult();
                adapter = new MovieAdapter(getApplicationContext(),list);
                rvInfo.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {

            }
        });
    }
}