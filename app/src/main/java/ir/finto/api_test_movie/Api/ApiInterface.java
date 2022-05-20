package ir.finto.api_test_movie.Api;

import ir.finto.api_test_movie.Model.BaseModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/popular")
    Call<BaseModel> getMovies(@Query("api_key") String api_key );
}
