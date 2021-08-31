package com.example.android.aapkaeklautatouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class SideBarActivity extends AppCompatActivity {

    Button profile,trip,rating,customer;
    ImageButton ib1,ib2,ib3,ib4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_sidebar);

        profile = (Button) findViewById(R.id.myprofile);
        trip = (Button) findViewById(R.id.trip);
        rating = (Button) findViewById(R.id.rating);
        customer = (Button) findViewById(R.id.customercare);
        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideBarActivity.this, SideBarUserProfile.class);
                startActivity(intent);

            }
        });

        trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SideBarActivity.this, PlanYourTripActivity.class);
                startActivity(intent1);

            }
        });


        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SideBarActivity.this, RatingActivity.class);
                startActivity(intent2);

            }
        });

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SideBarActivity.this, " CALL **** ****", Toast.LENGTH_SHORT).show();

            }
        });




    }

    public void ib1(View v) {
        switch (v.getId()) {
            case R.id.ib1:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.trivago.in/"));
                startActivity(intent);
                break;
        }

    }
    public void ib2(View v) {
        switch (v.getId()) {
            case R.id.ib2:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.zomato.com//india"));
                startActivity(intent);
                break;
        }

    }

    public void ib3(View v) {
        switch (v.getId()) {
            case R.id.ib3:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.olacabs.com/"));
                startActivity(intent);
                break;
        }

    }

    public void ib4(View v) {
        switch (v.getId()) {
            case R.id.ib4:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https:/www.savaari.com/mumbai/car-rental"));
                startActivity(intent);
                break;
        }
    }
}
