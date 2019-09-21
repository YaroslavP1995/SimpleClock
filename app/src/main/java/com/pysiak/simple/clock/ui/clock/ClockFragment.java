package com.pysiak.simple.clock.ui.clock;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pysiak.simple.clock.ui.clock.TimezonedbApi;
import com.mapbox.api.geocoding.v5.models.CarmenFeature;
import com.mapbox.mapboxsdk.Mapbox;
import com.pysiak.simple.clock.R;
import com.mapbox.mapboxsdk.plugins.places.autocomplete.PlaceAutocomplete;
import com.mapbox.mapboxsdk.plugins.places.autocomplete.model.PlaceOptions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Fragment that implements {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockFragment extends Fragment implements ClockView {
    private static final int REQUEST_CODE_AUTOCOMPLETE = 1;
    private static final int LIMIT_PLACES = 5;
    private TextView textView;
    ClockPresenter clockPresenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.clock_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Mapbox.getInstance(getContext(), getString(R.string.map_box_key));
        clockPresenter = new ClockPresenter(getContext());
        clockPresenter.attachView(this);
        textView = view.findViewById(R.id.text_location_id);
        view.findViewById(R.id.fab_location_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaceAutocomplete.clearRecentHistory(getContext());
                Intent intent = new PlaceAutocomplete.IntentBuilder()
                        .accessToken(Mapbox.getAccessToken() != null ? Mapbox.getAccessToken() : getString(R.string.map_box_key))
                        .placeOptions(PlaceOptions.builder()
                                .backgroundColor(Color.parseColor("#EEEEEE"))
                                .limit(LIMIT_PLACES)
                                .build(PlaceOptions.MODE_CARDS))
                        .build(getActivity());
                startActivityForResult(intent, REQUEST_CODE_AUTOCOMPLETE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE_AUTOCOMPLETE && data != null) {
            CarmenFeature selectedCarmenFeature = PlaceAutocomplete.getPlace(data);
            double lat = selectedCarmenFeature.center().latitude();
            double lng = selectedCarmenFeature.center().longitude();
            textView.setText(selectedCarmenFeature.placeName());
            clockPresenter.getApi().getData(getString(R.string.key),lat,lng)
                    .enqueue(new Callback<Timezonedb>() {
                        @Override
                        public void onResponse(Call<Timezonedb> call, Response<Timezonedb> response) {
                            Timezonedb timezonedb = response.body();
                            if (timezonedb != null) {
                                textView.setText(timezonedb.getStatus());
                                textView.setText(timezonedb.getFormatted());
                            }
                        }

                        @Override
                        public void onFailure(Call<Timezonedb> call, Throwable t) {
                            textView.append("Error occurred while getting request!");
                            t.printStackTrace();
                        }
                    });
        }
    }
}