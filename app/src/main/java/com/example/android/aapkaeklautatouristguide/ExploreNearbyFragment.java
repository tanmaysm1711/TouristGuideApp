package com.example.android.aapkaeklautatouristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class ExploreNearbyFragment extends Fragment {

    View rootView;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_explore_nearby, container, false);

        CardGridAdapter touristPlacesAdapter = new CardGridAdapter((MainActivity) getActivity(), touristPlaceNames, touristPlaceImages);
        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(touristPlacesAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText((MainActivity) getActivity(), "Taking you to " + touristPlaceNames[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent((MainActivity) getActivity(), DescriptionActivity.class);
                intent.putExtra("nameOfPlace", touristPlaceNames[position]);
                intent.putExtra("descriptionOfPlace", touristPlaceDescriptions[position]);
                intent.putExtra("locationOfPlace", touristPlaceLocation[position]);
                intent.putExtra("timingsOfPlace", touristPlaceTimings[position]);
                intent.putExtra("entryFeeOfPlace", touristPlaceEntryFee[position]);
                startActivity(intent);
            }
        });

        return rootView;
    }

    String[] touristPlaceNames = getResources().getStringArray(R.array.touristPlaceNames);
    String[] touristPlaceDescriptions = getResources().getStringArray(R.array.touristPlaceDescriptions);
    int[] touristPlaceImages = getResources().getIntArray(R.array.touristPlaceImages);
    String[] touristPlaceLocation = getResources().getStringArray(R.array.touristPlaceLocation);
    String[] touristPlaceTimings = getResources().getStringArray(R.array.touristPlaceTimings);
    String[] touristPlaceEntryFee = getResources().getStringArray(R.array.touristPlaceEntryFee);

}
