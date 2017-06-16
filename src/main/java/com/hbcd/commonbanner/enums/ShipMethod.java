package com.hbcd.commonbanner.enums;

public enum ShipMethod {
    RUSH(1, "Rush"),
    STANDARD(0, "Standard"),
    NEXTBUS(2, "Next Bus"),
    SR2DAYFREE(4,"ShopRunner 2 Day FREE"),
    SATURDAY(3,"Saturday");
    private int value;
    private String method;

    private ShipMethod(int value, String method) {
        this.value = value;
        this.method = method;
    }

    public int value() {
        return value;
    }

    public String toString() {
        return method;
    }
}
