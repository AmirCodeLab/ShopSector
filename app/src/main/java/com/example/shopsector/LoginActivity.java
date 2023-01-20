package com.example.shopsector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    ImageView iv_crossImage;
    Button btnLoginBuy, btnLoginCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        iv_crossImage = findViewById(R.id.iv_cross_image);
        iv_crossImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnLoginBuy = findViewById(R.id.btn_login_buy);
        btnLoginCart = findViewById(R.id.btn_login_cart);
        btnLoginBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "Your order is done. Wait for our Call...", Toast.LENGTH_LONG).show();
            }
        });
        btnLoginCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "Item is added to your Cart...", Toast.LENGTH_LONG).show();
            }
        });

    }
}