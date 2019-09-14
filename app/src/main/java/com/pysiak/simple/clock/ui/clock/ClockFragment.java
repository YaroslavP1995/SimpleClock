package com.pysiak.simple.clock.ui.clock;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.pysiak.simple.clock.R;

import java.util.Arrays;
import java.util.List;

/**
 * Fragment that implements {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockFragment extends Fragment implements ClockView {
    private PlacesClient placesClient;
    private TextView textView;
    private List<Place.Field> placeFields = Arrays.asList(Place.Field.ID,
    Place.Field.NAME,
    Place.Field.ADDRESS);
    private AutocompleteSupportFragment placesFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.google_place, container, false);
        Places.initialize(getContext(),getString(R.string.google_maps_key));
        placesClient = Places.createClient(getContext());
        textView = view.findViewById(R.id.text_search_id);

        setupPlaceAutocomplete();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ClockPresenter clockPresenter = new ClockPresenter();
        clockPresenter.attachView(this);
    }

    private void setupPlaceAutocomplete(){
        placesFragment = (AutocompleteSupportFragment)getChildFragmentManager().findFragmentById(R.id.autocomplete_fragment_id);
        assert placesFragment != null;
        placesFragment.setPlaceFields(placeFields);
        placesFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {
                textView.setText(place.getName());
            }

            @Override
            public void onError(@NonNull Status status) {
                Toast toast = Toast.makeText(getContext(), ""+status.getStatusMessage(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}