package com.hbcd.commonbanner.overlays;


public interface AddressOverlay {
    public void fillNewBillingAddress(String address, String city, String state, String zipcode) throws Exception;

    public void fillNewProfileBillingAddress(String nickname, String address, String city, String state, String zipcode) throws Exception;

    public void fillNewProfileShippingAddress(String nickname, String address, String city, String state, String zipcode) throws Exception;

    public void editShippingAddress(String address) throws Exception;

    public void editProfileAddress(String address) throws Exception;

    public void removeProfileAddress(String address) throws Exception;
    public void ClickExistingAddress() throws Exception;
    public void editBillingAddress(String address) throws Exception;
    public void editZipCode(String zipCode) throws Exception;
    public void ClickApply() throws Exception;
    public void ClickCancel(String address) throws Exception;
    public void ClickEnterNewAddress() throws Exception;
    public void fillNewShippingAddress(String address, String city, String state,
                                       String zipcode) throws Exception;
    public void ClickCancel() throws Exception;
    public void fillNewBillingAddress(String address, String city, String state, String zipcode, String country) throws Exception;
}
