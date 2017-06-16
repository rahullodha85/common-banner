package com.hbcd.commonbanner.dataobjects;

public class ShoeSize implements Comparable<ShoeSize> {
    private String sizeString;

    public ShoeSize(String sizeString) {
        this.sizeString = sizeString;
    }

    @Override
    public int compareTo(ShoeSize o) {
        if (o.toString().contains(sizeString.substring(0, 1)) && !o.toString().equals(sizeString))
            return 1;
        return sizeString.compareTo(o.sizeString);
    }

    public String toString() {
        return sizeString;
    }

}
