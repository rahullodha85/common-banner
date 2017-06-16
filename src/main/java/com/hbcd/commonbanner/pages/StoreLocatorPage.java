package com.hbcd.commonbanner.pages;

public interface StoreLocatorPage {

    public void SearchBy(String city, String state) throws Exception;

    public void SearchBy(String zip) throws Exception;

    public void StoreEvents() throws Exception;

    public void SearchForStore(String distance, String postalCode) throws Exception;

    public void SearchForStore() throws Exception;

}
