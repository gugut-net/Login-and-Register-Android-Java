package com.example.memorableplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Password extends AppCompatActivity {

    Button forgotPassword;

    public void clickConfirmRest(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Email sent!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        forgotPassword = (Button) findViewById(R.id.forgotPassword);




    }
}