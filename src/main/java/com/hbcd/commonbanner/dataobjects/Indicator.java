package com.hbcd.commonbanner.dataobjects;

public enum Indicator {

    SIZENA("sizeNA"), COLORNA("colorNA"), MULTIPLESIZE("multipleSizes"), MULTIPLECOLOR("multipleColor");

    private final String status;

    private Indicator(String s) {
        status = s;
    }

}
