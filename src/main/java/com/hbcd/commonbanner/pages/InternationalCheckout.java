package com.hbcd.commonbanner.pages;

public interface InternationalCheckout {

    public void AddShippingAddress(String address, String city, String state,
                                   String zipcode, String email) throws Exception;

    public void AddCreditCard(String... creditCard) throws Exception;

    public void ClickPlaceOrder() throws Exception;
}
