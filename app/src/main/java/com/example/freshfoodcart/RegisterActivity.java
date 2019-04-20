package com.example.freshfoodcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.freshfoodcart.ui.login.LoginActivity;

public class RegisterActivity<forgotpasstxt> extends AppCompatActivity {

    DBHelper myDb;
    TextView forgotpass;
    EditText name, pass, email;
    Button insert, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myDb = new DBHelper(this);
        forgotpass = findViewById(R.id.txtForgotpPass);
        name = findViewById(R.id.edtName);
        pass = findViewById(R.id.edtPassword);
        email = findViewById(R.id.edtEmail);
        insert = findViewById(R.id.btnRegister);
        signup = findViewById(R.id.btnSignUP);
        addData();
        authenticateUser();
    }

    private void authenticateUser() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addData() {
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = myDb.insetData(name.getText().toString(), pass.getText().toString(), email.getText().toString());
                if (!isInserted) {
                    Toast.makeText(RegisterActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void goToForgot(View view) {
        Intent intent = new Intent (RegisterActivity.this, ForgetPassword.class);
        startActivity(intent);
    }
}
