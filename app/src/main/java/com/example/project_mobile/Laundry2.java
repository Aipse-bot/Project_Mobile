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

public class Laundry2 extends AppCompatActivity {
    ImageButton Back2;

    Button weekly2,monthly2,biweekly2,seven2,ten2,fourteen2, appointment2;

    int time2;
    String Shopname2,period2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_laundry2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Laundry2LO), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Back2 = (ImageButton) findViewById(R.id.button_back2);
        Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoBackMain = new Intent(Laundry2.this, MainActivity.class);
                startActivity(GoBackMain);
            }
        });


        weekly2 = (Button) findViewById(R.id.weekly);
        weekly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period2 = "Weekly";
                weekly2.setTextColor(Color.WHITE);
                biweekly2.setTextColor(Color.parseColor("#A9A9A9"));
                monthly2.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        biweekly2 = (Button) findViewById(R.id.biweekly);
        biweekly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period2 = "Biweekly";
                weekly2.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly2.setTextColor(Color.WHITE);
                monthly2.setTextColor(Color.parseColor("#A9A9A9"));
            }
        });

        monthly2 = (Button) findViewById(R.id.Monthly);
        monthly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                period2 = "Monthly";
                weekly2.setTextColor(Color.parseColor("#A9A9A9"));
                biweekly2.setTextColor(Color.parseColor("#A9A9A9"));
                monthly2.setTextColor(Color.WHITE);
            }
        });

        seven2 = (Button) findViewById(R.id.seven2);
        seven2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time2 = 07;
                seven2.setTextColor(Color.WHITE);
                ten2.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen2.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });

        ten2 = (Button) findViewById(R.id.ten2);
        ten2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time2 = 10;
                seven2.setTextColor(Color.parseColor("#A9A9A9"));
                ten2.setTextColor(Color.WHITE);
                fourteen2.setTextColor(Color.parseColor("#A9A9A9"));

            }
        });


        fourteen2 = (Button) findViewById(R.id.fourteen3);
        fourteen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time2 = 14;
                seven2.setTextColor(Color.parseColor("#A9A9A9"));
                ten2.setTextColor(Color.parseColor("#A9A9A9"));
                fourteen2.setTextColor(Color.WHITE);

            }
        });


        appointment2 = (Button) findViewById(R.id.MakeAppointment3);
        appointment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shopname2 = "Wash n Go Laundry Shop";
                Intent GoToProfile = new Intent(Laundry2.this, Cart.class);
                startActivity(GoToProfile);
            }
        });
    }
}