package com.hbcd.commonbanner.pages;

public interface GiftRegistryPage {

    public GiftRegistryPage NavToGiftRegistry() throws Exception;

    public void CreateRegistry(String eventtype, String month, String Day,
                               String Year, String password, String provincehome,
                               String storename, String guestnumber, String salutation,
                               String fname, String lname, String address1, String address2,
                               String city, String country, String province, String postalcode,
                               String phonenumber, String emailID) throws Exception;

}
