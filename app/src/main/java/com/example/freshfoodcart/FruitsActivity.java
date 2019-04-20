package com.example.freshfoodcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        // Find the View that shows the numbers category
        TextView apple = (TextView) findViewById(R.id.apple);

        // Set a click listener on that View
        apple.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView banana = (TextView) findViewById(R.id.banana);

        // Set a click listener on that View
        banana.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView cherry = (TextView) findViewById(R.id.cherry);

        // Set a click listener on that View
        cherry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView strawberry = (TextView) findViewById(R.id.strawberry);

        // Set a click listener on that View
        strawberry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView oranges = (TextView) findViewById(R.id.oranges);

        // Set a click listener on that View
        oranges.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView grapes = (TextView) findViewById(R.id.grapes);

        // Set a click listener on that View
        grapes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView watermelon = (TextView) findViewById(R.id.watermelon);

        // Set a click listener on that View
        watermelon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(FruitsActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
    }
}
