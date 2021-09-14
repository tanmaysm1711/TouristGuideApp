package com.example.android.aapkaeklautatouristguide;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            addExploreNearbyFragment();
        }

        LinearLayout exploreNearbyLayout = (LinearLayout) findViewById(R.id.explore_nearby_layout);
        exploreNearbyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addExploreNearbyFragment();
            }
        });

        LinearLayout catagoryViewLayout = (LinearLayout) findViewById(R.id.catagory_view_layout);
        catagoryViewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCategoryFragment();
            }
        });
//

//        LinearLayout exploreIndiaLayout = (LinearLayout) findViewById(R.id.explore_india_layout);
//        exploreIndiaLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


    }

    private void addExploreNearbyFragment() {
        ExploreNearbyFragment fragment = new ExploreNearbyFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        Log.i(TAG, "replace_ExploreNearbyFragment: ");
        fragmentTransaction.commit();
    }

    private void addCategoryFragment() {
        CategoryFragment fragment = new CategoryFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        Log.i(TAG, "replace_CategoryFragment: ");
        fragmentTransaction.commit();
    }
}
