package com.hbcd.commonbanner.dataobjects;

public class AddressLinkPropertiesHelper {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressLinkPropertiesHelper(String title, String state,
                                       String country) {
        super();
        this.title = title;
        this.state = state;
        this.country = country;
    }

    private String title;
    private String state;
    private String country;
}
