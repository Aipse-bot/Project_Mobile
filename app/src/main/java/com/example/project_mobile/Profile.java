package com.example.project_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {
    Button Home;
    Button Cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ProfileMain), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Home = (Button) findViewById(R.id.button_home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoHome = new Intent(Profile.this, MainActivity.class);
                startActivity(GoHome);
            }
        });

        Cart = (Button) findViewById(R.id.button_cart);
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToCart = new Intent(Profile.this, Cart.class);
                startActivity(GoToCart);
            }
        });
    }
}