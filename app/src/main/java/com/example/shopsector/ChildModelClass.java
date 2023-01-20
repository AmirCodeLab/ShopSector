package com.example.shopsector;

import android.widget.Button;

public class ChildModelClass {
    int image;
    String itemAbout, itemPrice, itemOrder;

    public ChildModelClass(int image, String itemAbout, String itemPrice, String itemOrder) {
        this.image = image;
        this.itemAbout = itemAbout;
        this.itemPrice = itemPrice;
        this.itemOrder = itemOrder;
    }
}
