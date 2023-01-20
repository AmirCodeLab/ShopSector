package com.example.shopsector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ParentModelClass> parentModelClassArrayList;

    ArrayList<ChildModelClass> list1;
    ArrayList<ChildModelClass> list2;
    ArrayList<ChildModelClass> list3;
    ArrayList<ChildModelClass> list4;
    ArrayList<ChildModelClass> list5;
    ArrayList<ChildModelClass> list6;

    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // -----> Tool Bar <-----
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Shop Sector");
        }
        ImageView ivSearch = findViewById(R.id.iv_search);
        ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Searching is in Progress...", Toast.LENGTH_SHORT).show();
            }
        });

        // Recycler View
        recyclerView = findViewById(R.id.rv_parent);
        parentModelClassArrayList = new ArrayList<>();
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();

        list1.add(new ChildModelClass(R.drawable.casual_shirt_blue, "Casual Blue Shirt", "Rs. 1399/-", "Order Now"));
        list1.add(new ChildModelClass(R.drawable.casual_shirt_brownish, "Casual Gray Shirt", "Rs. 1299/-", "Order Now"));
        list1.add(new ChildModelClass(R.drawable.casual_shirt_darkesh, "Casual Black Shirt", "Rs. 1599/-", "Order Now"));
        list1.add(new ChildModelClass(R.drawable.casual_shirt_redish, "Casual Dark Shirt", "Rs. 1099/-", "Order Now"));
        list1.add(new ChildModelClass(R.drawable.casual_shirt_white, "Casual White Shirt", "Rs. 1250/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("Casual Shirts", list1));

        list2.add(new ChildModelClass(R.drawable.t_shirt_black, "T-shirt black", "Rs. 750/-", "Order Now"));
        list2.add(new ChildModelClass(R.drawable.t_shirt_casual, "T-shirt casual", "Rs. 899/-", "Order Now"));
        list2.add(new ChildModelClass(R.drawable.t_shirt_dark_casual, "T-shirt outfit", "Rs. 850/-", "Order Now"));
        list2.add(new ChildModelClass(R.drawable.t_shirt_darkesh, "T-shirt 2pi", "Rs. 1199/-", "Order Now"));
        list2.add(new ChildModelClass(R.drawable.t_shirt_black_casual, "T-shirt 1lof", "1099/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("T-Shirts for Men", list2));

        list3.add(new ChildModelClass(R.drawable.perfume_villain_black, "Villain Black", "Rs. 2570/-", "Order Now"));
        list3.add(new ChildModelClass(R.drawable.perfume_eternal_roya, "Eternal Royal", "Rs. 2799/-", "Order Now"));
        list3.add(new ChildModelClass(R.drawable.perfume_polo_black, "Polo Black", "Rs. 1999/-", "Order Now"));
        list3.add(new ChildModelClass(R.drawable.perfume_royal_black, "Royal Black", "Rs. 2390/-", "Order Now"));
        list3.add(new ChildModelClass(R.drawable.perfume_royal_blue, "Royal Blue", "Rs. 2250/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("Fragrance Sector", list3));

        list4.add(new ChildModelClass(R.drawable.watch_apple, "Smart Watch", "Rs. 7099/-", "Order Now"));
        list4.add(new ChildModelClass(R.drawable.watch_oppo, "Oppo Watch", "Rs. 3099/-", "Order Now"));
        list4.add(new ChildModelClass(R.drawable.watch_brown, "Brown Watch", "Rs. 2300/-", "Order Now"));
        list4.add(new ChildModelClass(R.drawable.watch_galaxy, "Galaxy Watch", "Rs. 75099/-", "Order Now"));
        list4.add(new ChildModelClass(R.drawable.watch_digital, "Digital Watch", "Rs. 1500/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("Stylish Watch", list4));

        list5.add(new ChildModelClass(R.drawable.adidas_stan_smith_sneakers, "Adidas Smith", "Rs. 3399/-", "Order Now"));
        list5.add(new ChildModelClass(R.drawable.saucony_jazz_court_sneakers, "Saucony curt", "Rs. 3500/-", "Order Now"));
        list5.add(new ChildModelClass(R.drawable.nike_air_force_sneakers, "Nike Force", "Rs. 2300/-", "Order Now"));
        list5.add(new ChildModelClass(R.drawable.nike_blazer_vintage_sneakers, "Nike Vintage", "Rs. 2799/-", "Order Now"));
        list5.add(new ChildModelClass(R.drawable.nike_killshot_sneakers, "Nike KillShot", "Rs. 2150/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("Sneakers", list5));

        list6.add(new ChildModelClass(R.drawable.wedding_loafer_shoes, "Black Loafer", "Rs. 1700/-", "Order Now"));
        list6.add(new ChildModelClass(R.drawable.white_loafers_shoes, "1lof OffWhite", "Rs. 1550/-", "Order Now"));
        list6.add(new ChildModelClass(R.drawable.white_up_loafer_shoes, "5lof OffWhite", "Rs. 1400/-", "Order Now"));
        list6.add(new ChildModelClass(R.drawable.darkesh_loagers_shoes, "Darkish Loafer", "Rs. 1199/-", "Order Now"));
        list6.add(new ChildModelClass(R.drawable.suede_loafers_shoes, "Suede Loafer", "Rs. 1099/-", "Order Now"));

        parentModelClassArrayList.add(new ParentModelClass("Loafers for Men", list6));

        parentAdapter = new ParentAdapter(parentModelClassArrayList, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();

    }

    // -----> Option Menu <-----
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opt_signIn){
            Toast.makeText(this, "Sign In", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.opt_wallet){
            Toast.makeText(this, "Wallet", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.opt_cart){
            Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.opt_setting){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
        else {  // id is ---> android.R.id.home
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}