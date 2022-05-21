package ir.finto.api_test_movie.Api;

import ir.finto.api_test_movie.Model.BaseModel;
import ir.finto.api_test_movie.Model.BaseNews;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface NewApiInterface {

    @GET("/v2/search")
    Call<BaseNews> getNews(@Query("x-api-key") String api_key, @Query("q") String q, @Query("lang") String lang, @Query("page") String page, @Query("page_size") String page_size);

}
