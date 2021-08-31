package com.example.android.aapkaeklautatouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SideBarUserProfile extends AppCompatActivity {
    DatabaseHelper abc;
    Button btnupdate;
    EditText name,email,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_user_profile);
        abc = new DatabaseHelper(this);
        name = (EditText) findViewById((R.id.name));
        email = (EditText) findViewById((R.id.email));
        number = (EditText) findViewById((R.id.number));
        btnupdate = (Button) findViewById(R.id.update);
        AddData();

    }

    public void AddData() {
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = abc.insertData(name.getText().toString(), email.getText().toString(), number.getText().toString());
                if (isInserted = true)
                    Toast.makeText(SideBarUserProfile.this, "Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SideBarUserProfile.this, "Try again", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
