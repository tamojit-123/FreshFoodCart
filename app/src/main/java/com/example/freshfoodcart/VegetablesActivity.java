package com.example.freshfoodcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        // Find the View that shows the numbers category
        TextView potato = (TextView) findViewById(R.id.potato);

        // Set a click listener on that View
        potato.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView onion = (TextView) findViewById(R.id.onion);

        // Set a click listener on that View
        onion.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView carrot = (TextView) findViewById(R.id.carrot);

        // Set a click listener on that View
        carrot.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView brocolli = (TextView) findViewById(R.id.broccoli);

        // Set a click listener on that View
        brocolli.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView brinjal = (TextView) findViewById(R.id.brinjal);

        // Set a click listener on that View
        brinjal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView lettuce = (TextView) findViewById(R.id.lettuce);

        // Set a click listener on that View
        lettuce.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView pumpkin = (TextView) findViewById(R.id.pumpkin);

        // Set a click listener on that View
        pumpkin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(VegetablesActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
    }
}
