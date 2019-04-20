package com.example.freshfoodcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        // Find the View that shows the numbers category
        TextView tuna = (TextView) findViewById(R.id.tuna);

        // Set a click listener on that View
        tuna.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView catla = (TextView) findViewById(R.id.catla);

        // Set a click listener on that View
        catla.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView pomfret = (TextView) findViewById(R.id.pomfret);

        // Set a click listener on that View
        pomfret.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView crab = (TextView) findViewById(R.id.crab);

        // Set a click listener on that View
        crab.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView prawn = (TextView) findViewById(R.id.prawn);

        // Set a click listener on that View
        prawn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView salmon = (TextView) findViewById(R.id.salmon);

        // Set a click listener on that View
        salmon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView shushi = (TextView) findViewById(R.id.shushi);

        // Set a click listener on that View
        shushi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FishActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
    }
}
