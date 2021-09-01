package com.example.android.aapkaeklautatouristguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    public String [] subCategoryName ={" Beach","Mountain","Monument","Temple","Waterfall","Market",
    "Gardens","Amusement Parks","Wildlife","Malls","snow"};
    public int [] subCategoryImage ={};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ListView subCategory = (ListView) findViewById(R.id.sub_category);
        ListView featuredLocList = (ListView) findViewById(R.id.featured_loc_list);
        ListView yourFavouritePlaceList = (ListView) findViewById(R.id.your_favourite_place_list);
        ListView recentlyViewedList = (ListView) findViewById(R.id.recently_viewed_list);



    }
}
