package com.hbcd.commonbanner.dataobjects;

public class Address {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address(String firstName, String lastName, String addrss,
                   String city, String state, String zip, String phone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addrss = addrss;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Address createAddress(String firstName, String lastName, String addrss,
                                        String city, String state, String zip, String phone) {
        return new Address(firstName, lastName, addrss,
                city, state, zip, phone);
    }

    private String firstName;
    private String lastName;
    private String addrss;
    private String city;
    private String state;
    private String zip;
    private String phone;

}
