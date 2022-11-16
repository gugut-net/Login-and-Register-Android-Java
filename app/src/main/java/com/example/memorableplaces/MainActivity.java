package com.example.memorableplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ImageButton google;
    ImageButton linkedin;
    ImageButton facebook;
    TextView password;
    TextView username;
    MaterialButton loginButton;
    MaterialButton signUpButton;
    Button forgetPassword;


    public void clickSignIn(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
    public void clickReset(View rest) {
        Intent intent = new Intent(this, Password.class);
        startActivity(intent);
    }

    public void clickRegister(View map) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        forgetPassword = (Button) findViewById(R.id.forgotPassword);
        google = (ImageButton) findViewById(R.id.google);
        linkedin = (ImageButton) findViewById(R.id.linkedin);
        facebook = (ImageButton) findViewById(R.id.facebook);

        signUpButton = (MaterialButton) findViewById(R.id.signUpButton);
        loginButton = (MaterialButton) findViewById(R.id.loginButton);

    }
}

