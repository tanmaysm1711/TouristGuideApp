package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
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

import static android.content.ContentValues.TAG;

public class NearbyFragment extends Fragment {
    View rootView;

    Context context;
    String[] touristPlaceNames;
    String[] touristPlaceDescriptions;
    TypedArray touristPlaceImages;
    String[] touristPlaceLocation;
    String[] touristPlaceTimings;
    String[] touristPlaceEntryFee;

    public NearbyFragment(Context context) {
        this.context = context;
        touristPlaceNames = context.getResources().getStringArray(R.array.touristPlaceNames);
        touristPlaceDescriptions = context.getResources().getStringArray(R.array.touristPlaceDescriptions);
        touristPlaceImages = context.getResources().obtainTypedArray(R.array.touristPlaceImages);
        touristPlaceLocation = context.getResources().getStringArray(R.array.touristPlaceLocation);
        touristPlaceTimings = context.getResources().getStringArray(R.array.touristPlaceTimings);
        touristPlaceEntryFee = context.getResources().getStringArray(R.array.touristPlaceEntryFee);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_explore_nearby, container, false);

        CardGridAdapter touristPlacesAdapter = new CardGridAdapter(getActivity(), touristPlaceNames, touristPlaceImages);
        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(touristPlacesAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Taking you to " + touristPlaceNames[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);
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
}
