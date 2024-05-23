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

public class Laundry3 extends AppCompatActivity {

    ImageButton Back3;

    Button weekly3,monthly3,biweekly3,seven3,ten3,fourteen3, appointment3;

    int time3;
    String Shopname3,period3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_laundry3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Laundry3LO), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Back3 = (ImageButton) findViewById(R.id.button_back3);
        Back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoBackMain = new Intent(Laundry3.this, MainActivity.class);
                startActivity(GoBackMain);
            }
        });

        weekly3 = (Button) findViewById(R.id.weekly3);
        weekly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period3 = "Weekly";
                weekly3.setTextColor(Color.WHITE);
                biweekly3.setTextColor(Color.parseColor("#A9A9A9"));
                monthly3.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        biweekly3 = (Button) findViewById(R.id.biweekly3);
        biweekly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period3 = "Biweekly";
                weekly3.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly3.setTextColor(Color.WHITE);
                monthly3.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        monthly3 = (Button) findViewById(R.id.Monthly3);
        monthly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period3 = "Monthly";
                weekly3.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly3.setTextColor(Color.parseColor("#A9A9A9"));
                monthly3.setTextColor(Color.WHITE);
            }
        });

        seven3 = (Button) findViewById(R.id.seven3);
        seven3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time3 = 07;
                seven3.setTextColor(Color.WHITE);
                ten3.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen3.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });

        ten3 = (Button) findViewById(R.id.ten2);
        ten3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time3 = 10;
                seven3.setTextColor(Color.parseColor("#A9A9A9"));
                ten3.setTextColor(Color.WHITE);
                fourteen3.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });


        fourteen3 = (Button) findViewById(R.id.fourteen3);
        fourteen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time3 = 14;
                seven3.setTextColor(Color.parseColor("#A9A9A9"));
                ten3.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen3.setTextColor(Color.WHITE);

            }
        });


        appointment3 = (Button) findViewById(R.id.MakeAppointment3);
        appointment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shopname3 = "Clean Laundry Shop";
                Intent GoToProfile = new Intent(Laundry3.this, Cart.class);
                startActivity(GoToProfile);
            }
        });
    }
}