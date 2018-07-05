package com.androidcoban.flicks.Api;

import com.androidcoban.flicks.Models.PlayNowMovies;
import com.androidcoban.flicks.Models.TrailerList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiSources {
    final String Api_key = "2bf1ced1c474b78e3d78d68f0de8752d";
    final String Base_URL = "http://api.myservice.com/";

    @GET("/3/movie/now-playing")
    Call<PlayNowMovies> getmovie(@Path("now-playing") String page, @Query("api_key") String value);
    @GET("/3/movie/{id}/trailers")
    Call<TrailerList> getTrailer(@Path("id") int id,@Path("trailers")String trailers,@Query("api_key")String value);
}