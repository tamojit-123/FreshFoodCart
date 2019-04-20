package com.example.freshfoodcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        // Find the View that shows the numbers category
        TextView chicken = (TextView) findViewById(R.id.chicken);

        // Set a click listener on that View
        chicken.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(MeatActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView mutton = (TextView) findViewById(R.id.mutton);

        // Set a click listener on that View
        mutton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(MeatActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView turkey = (TextView) findViewById(R.id.turkey);

        // Set a click listener on that View
        turkey.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(MeatActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView redmeat = (TextView) findViewById(R.id.redmeat);

        // Set a click listener on that View
        redmeat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent orderIntent = new Intent(MeatActivity.this, OrderActivity.class);

                // Start the new activity
                startActivity(orderIntent);
            }
        });
    }
}
