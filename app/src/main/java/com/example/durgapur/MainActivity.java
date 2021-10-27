package com.example.durgapur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the resturants view
        TextView resturants = (TextView) findViewById(R.id.resturants);

        // Set a onClickListener on that resturants view
        resturants.setOnClickListener(new View.OnClickListener() {
            @Override
            //After clicking the view following code will run
            public void onClick(View v) {
                Intent resturantsIntent = new Intent(MainActivity.this, ResturantsActivity.class);
                startActivity(resturantsIntent);
            }
        });


        // Find the hotels view
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set onClickListener on hotel view
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        // Find the hospitals view
        TextView hospitals = (TextView) findViewById(R.id.hospitals);

        // Set onClickListener on hospitals view
        hospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hospitalsIntent = new Intent(MainActivity.this, HospitalsActivity.class);
                startActivity(hospitalsIntent);
            }
        });

        // Find the attractions view
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Set onClickListener on hospitals view
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        // Find the attractions view
        TextView cafe = (TextView) findViewById(R.id.coffee);

        // Set onClickListener on hospitals view
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cafeIntent = new Intent(MainActivity.this, CafeActivity.class);
                startActivity(cafeIntent);
            }
        });

    }
}