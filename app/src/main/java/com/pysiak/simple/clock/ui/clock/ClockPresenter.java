package com.pysiak.simple.clock.ui.clock;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.pysiak.simple.clock.ui.clock.TimezonedbApi;

/**
 * Presenter for clock tab.
 *
 * @author Yaroslav P.
 */
public class ClockPresenter {

    private ClockView clockView;
    private static final String BASE_URL = "http://api.timezonedb.com";
    private Retrofit retrofit;
    private TimezonedbApi timezonedbApi;

    private Context context;

    ClockPresenter(Context context) {
        this.context = context;
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        timezonedbApi = retrofit.create(TimezonedbApi.class);
    }

    /**
     * Attach instance of {@link ClockView} to presenter
     *
     * @param clockView instance of {@link ClockView}
     */
    public void attachView(ClockView clockView) {
        this.clockView = clockView;

    }

    public TimezonedbApi getApi() {
        return timezonedbApi;
    }
}
