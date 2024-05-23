package com.example.project_mobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Laundry1 extends AppCompatActivity {

    ImageButton Back1;

    Button weekly,monthly,biweekly,seven,ten,fourteen, appointment;

    int time;
    String Shopname,period;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_laundry1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Laundry1LO), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Back1 = (ImageButton) findViewById(R.id.button_back1);
        Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoBackMain = new Intent(Laundry1.this, MainActivity.class);
                startActivity(GoBackMain);
            }
        });

        weekly = (Button) findViewById(R.id.weekly);
        weekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period = "Weekly";
                weekly.setTextColor(Color.WHITE);
                biweekly.setTextColor(Color.parseColor("#A9A9A9"));
                monthly.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        biweekly = (Button) findViewById(R.id.biweekly);
        biweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period = "Biweekly";
                weekly.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly.setTextColor(Color.WHITE);
                monthly.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        monthly = (Button) findViewById(R.id.Monthly);
        monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period = "Monthly";
                weekly.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly.setTextColor(Color.parseColor("#A9A9A9"));
                monthly.setTextColor(Color.WHITE);
            }
        });

        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 07;
                seven.setTextColor(Color.WHITE);
                ten.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });

        ten = (Button) findViewById(R.id.ten);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 10;
                seven.setTextColor(Color.parseColor("#A9A9A9"));
                ten.setTextColor(Color.WHITE);
                fourteen.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });


        fourteen = (Button) findViewById(R.id.fourteen);
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 14;
                seven.setTextColor(Color.parseColor("#A9A9A9"));
                ten.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen.setTextColor(Color.WHITE);

            }
        });


        appointment = (Button) findViewById(R.id.MakeAppointment);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shopname = "252 Laundry Shop";
                Intent GoToProfile = new Intent(Laundry1.this, Cart.class);
                startActivity(GoToProfile);
            }
        });

    }
}