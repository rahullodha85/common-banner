package com.hbcd.commonbanner.dataobjects;

public class NumericSize implements Comparable<NumericSize> {
    private Integer size;

    public NumericSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(NumericSize o) {
        return size.compareTo(o.size);
    }


}
