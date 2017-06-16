package com.hbcd.commonbanner.pages;

public interface PayPalInformationPage {

    public void continueFromPaypal() throws Exception;

    public void AddNewInternationalShippingAddress(String country, String name, String address1, String city, String province, String zip) throws Exception;
}
