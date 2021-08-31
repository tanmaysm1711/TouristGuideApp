package com.example.android.aapkaeklautatouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class DescriptionActivity extends AppCompatActivity {
    TextView locationName, locationDescription, locationTimings, locationEntryFees, locationArea;
    SliderView sliderView;
    int[] placeImages = {R.drawable.cst_1, R.drawable.cst_2, R.drawable.cst_3, R.drawable.cst_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_description);

        Intent intent = getIntent();
        String nameOfLocation = intent.getStringExtra("nameOfPlace");
        String descriptionOfLocation = intent.getStringExtra("descriptionOfPlace");
        String areaOfLocation = intent.getStringExtra("locationOfPlace");
        String timingOfLocation = intent.getStringExtra("timingsOfPlace");
        String entryFeesOfLocation = intent.getStringExtra("entryFeeOfPlace");

        sliderView = findViewById(R.id.image_slider);
        locationName = findViewById(R.id.locationName);

        locationDescription = findViewById(R.id.place_description);
        locationDescription.setMovementMethod(new ScrollingMovementMethod());

        locationTimings = findViewById(R.id.place_timings);
        locationEntryFees = findViewById(R.id.place_entry_fees);
        locationArea = findViewById(R.id.place_location);

        SliderAdapter sliderAdapter = new SliderAdapter(placeImages);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINDEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        locationName.setText(nameOfLocation);
        locationDescription.setText(descriptionOfLocation);
        locationArea.setText(areaOfLocation);
        locationTimings.setText(timingOfLocation);
        locationEntryFees.setText(entryFeesOfLocation);
    }
}