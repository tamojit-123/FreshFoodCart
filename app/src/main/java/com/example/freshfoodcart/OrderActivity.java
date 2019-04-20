package com.example.freshfoodcart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order items.
 */
public class OrderActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // Get user's name
        EditText itemField = (EditText) findViewById(R.id.item_field);
        Editable itemEditable = itemField.getText();
        String item = itemEditable.toString();

        // Figure out if the user wants COD topping
        CheckBox cashondeliveryCheckBox = (CheckBox) findViewById(R.id.cashondelivery);
        boolean hascod = cashondeliveryCheckBox.isChecked();

        // Figure out if the user wants Paynow topping
        CheckBox paynowCheckBox = (CheckBox) findViewById(R.id.paynow);
        boolean haspaynow = paynowCheckBox.isChecked();

        // Calculate the price
        int price = calculatePrice(hascod, haspaynow);

        // Display the order summary on the screen
        String message = createOrderSummary(item, price, hascod, haspaynow);

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject, item));
        intent.putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Calculates the price of the order.
     *
     * @param cashondelivery is whether or not we should include COD topping in the price
     * @param paynow         is whether or not we should include Paynow topping in the price
     * @return total price
     */
    private int calculatePrice(boolean cashondelivery, boolean paynow) {
        // First calculate the price of one cup of coffee
        int basePrice = 0;

        // If the user wants COD, add Rs.10 per item
        if (cashondelivery) {
            basePrice = basePrice + 10;
        }

        // If the user wants Paynow, add Rs.5 per item
        if (paynow) {
            basePrice = basePrice + 5;
        }

        // Calculate the total order price by multiplying by the quantity
        return quantity * basePrice;
    }

    /**
     * Create summary of the order.
     *
     * @param item           on the order
     * @param price          of the order
     * @param cashondelivery is whether or not to add COD to the item
     * @param paynow         is whether or not to add paynow to the item
     * @return text summary
     */
    private String createOrderSummary(String item, int price, boolean cashondelivery,
                                      boolean paynow) {
        String priceMessage = getString(R.string.order_summary_name, item);
        priceMessage += "\n" + getString(R.string.order_summary_delivery, cashondelivery);
        priceMessage += "\n" + getString(R.string.order_summary_paynow, paynow);
        priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
        priceMessage += "\n" + getString(R.string.order_summary_price,
                NumberFormat.getCurrencyInstance().format(price));
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfOrders) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfOrders);
    }
}
