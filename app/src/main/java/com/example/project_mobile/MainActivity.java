package com.example.project_mobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button ProfileBTN;
    Button Cart;
    ImageButton product1;
    ImageButton product2;
    ImageButton product3;

    ImageView Image1;
    ImageView Image2;
    ImageView Image3;


    FirebaseAuth auth;
//    Button btnLogout;
    FirebaseUser user;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
//        btnLogout = findViewById(R.id.btnLogout);
        user = auth.getCurrentUser();

        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }

//        btnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseAuth.getInstance().signOut();
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LaundryMain), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        product1 = (ImageButton) findViewById(R.id.prod1);
        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd1 = new Intent(MainActivity.this, Laundry1.class);
                startActivity(GoToProd1);
            }
        });

        product2 = (ImageButton) findViewById(R.id.prod2);
        product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd2 = new Intent(MainActivity.this, Laundry2.class);
                startActivity(GoToProd2);
            }
        });

        product3 = (ImageButton) findViewById(R.id.prod3);
        product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd3 = new Intent(MainActivity.this, Laundry3.class);
                startActivity(GoToProd3);
            }
        });

        Cart = (Button) findViewById(R.id.button_cart);
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToCart = new Intent(MainActivity.this, Cart.class);
                startActivity(GoToCart);
            }
        });

        ProfileBTN = (Button) findViewById(R.id.button_profile);
        ProfileBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProfile = new Intent(MainActivity.this, Profile.class);
                startActivity(GoToProfile);
            }
        });

        Image1 = (ImageView) findViewById(R.id.image_1);
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd1 = new Intent(MainActivity.this, Laundry1.class);
                startActivity(GoToProd1);
            }
        });

        Image2 = (ImageView) findViewById(R.id.image_2);
        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd2 = new Intent(MainActivity.this, Laundry2.class);
                startActivity(GoToProd2);
            }
        });

        Image3 = (ImageView) findViewById(R.id.image_3);
        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToProd3 = new Intent(MainActivity.this, Laundry3.class);
                startActivity(GoToProd3);
            }
        });

    }

}