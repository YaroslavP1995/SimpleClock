package com.pysiak.simple.clock.ui.clock;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TimezonedbApi {

    @GET("/v2.1/get-time-zone?format=json")
    Call<Timezonedb> getData(@Query("key")String key, @Query("lat") double lat, @Query("lng") double lng);

}
