package com.hbcd.commonbanner.enums;

public enum ShippingReturnCountry {
    USA("saks.com/Shipping-Returns-Taxes");
    private String url;

    private ShippingReturnCountry(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
