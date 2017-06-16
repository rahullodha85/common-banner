package com.hbcd.commonbanner.enums;

public enum CurrencyType {
    DEFAULT("$"),
    SGD("SGD $"),
    AUD("AUD $"),
    HK("HKD $"),
    UK("GBP "),
    EURO("EUR "),
    NIL("INR");

    private String symbolValidation;

    private CurrencyType(String symbol) {
        this.symbolValidation = symbol;
    }

    public String toString() {
        return symbolValidation;
    }
}
