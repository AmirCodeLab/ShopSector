package com.example.shopsector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemsDetailsActivity extends AppCompatActivity {

    TextView detailAbout;
    TextView detailPrice;
    ImageView detailImage;

    public static final String IMAGE_RESOURCE_ID = "IMAGE_RESOURCE_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_details);

        // -----> Tool Bar <-----
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(getIntent().getStringExtra("about"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // -----> Get Data form Intent <-----
        detailAbout = findViewById(R.id.tv_detail_about);
        detailPrice = findViewById(R.id.tv_Detail_price);
        detailImage = findViewById(R.id.iv_detail_image);

        detailAbout.setText(getIntent().getStringExtra("about"));
        detailPrice.setText(getIntent().getStringExtra("price"));
        detailImage.setImageResource(getIntent().getExtras().getInt("image"));
        
        // -----> Button for Buy <-----
        Button btnBuy = findViewById(R.id.btn_buyNow);
        Button btnCart = findViewById(R.id.btn_addToCart);
        
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsDetailsActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        
        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsDetailsActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}