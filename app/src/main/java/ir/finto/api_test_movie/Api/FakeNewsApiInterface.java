package ir.finto.api_test_movie.Api;

import ir.finto.api_test_movie.Model.BaseFakeNews;
import ir.finto.api_test_movie.Model.BaseNews;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface FakeNewsApiInterface {

    @GET("everything")
    Call<BaseFakeNews> getNews(@Query("apiKey") String apikey, @Query("q") String q);

}
