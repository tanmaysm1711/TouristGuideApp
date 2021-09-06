package com.example.android.aapkaeklautatouristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AfterLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        CardView exploreNearbyButton = (CardView) findViewById(R.id.explore_nearby);
        exploreNearbyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exploreNearbyIntent = new Intent(AfterLoginActivity.this,ListOfPlacesNearYouActivity.class);
                startActivity(exploreNearbyIntent);
            }
        });
    }

}

