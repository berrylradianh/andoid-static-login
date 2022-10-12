package com.example.kuis1_berrylradianhamesha_pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.landingpage);

        EditText email = (EditText) findViewById(R.id.fieldEmail);
        EditText password = (EditText) findViewById(R.id.fieldPassword);
        TextView forgotPassword = (TextView) findViewById(R.id.forgotPassword);
        TextView register = (TextView) findViewById(R.id.register);
        Button login = (Button) findViewById(R.id.loginButton);

//      ================== LOGIN ONCLICK START ==================
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("berryl@gmail.com") && password.getText().toString().equals("password")){
                    Toast.makeText(getApplicationContext(), "Welcome to KPRI POLINEMA", Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(LandingPage.this, HomePage.class);
                    startActivity(home);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Email or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
//      ================== LOGIN ONCLICK END ==================

//      ================== FORGOT PASSWORD ONCLICK START ==================
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Forgot Password Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== FORGOT PASSWORD ONCLICK END ==================

//      ================== REGISTER ONCLICK START ==================
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Register Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== REGISTER PASSWORD ONCLICK END ==================

    }
}