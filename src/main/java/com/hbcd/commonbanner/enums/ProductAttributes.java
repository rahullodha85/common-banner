package com.hbcd.commonbanner.enums;

/**
 * Created by 461967 on 9/8/2015.
 */
public enum ProductAttributes {
    Name("Name"),
    Quantity("Quantity"),
    Color("Color"),
    Size("Size"),
    Price("Price"),
    SalePrice("SalePrice"),
    SubTotal("SubTotal"),
    Brand("Brand"),
    Total("Total");

    private String key;

    private ProductAttributes(String Key){
        this.key = Key;
    }

    public String toString() { return key; }

    public String getKey() { return this.key; }
}
