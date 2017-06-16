package com.hbcd.commonbanner.enums;

public enum SortOptions {
    NEWARRIVALS("Newest"),
    BESTSELLERS("Best Sellers"),
    TOPRATED("Top Rated"),
    PRICE_LOWTOHIGH("Price: Low to High"),
    PRICE_HIGHTOLOW("Price: High to Low"),
    DESIGNERS_ATOZ("Designers: A to Z"),
    BRANDS_ATOZ("Brands: A to Z"),
    CATEGORY("Category"),
    SALE_SHOWFIRST("Sale First");

    private String optionText;

    private SortOptions(String optionText) {
        this.optionText = optionText;
    }

    public String toString() {
        return optionText;
    }
}
