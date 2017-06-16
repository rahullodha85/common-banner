package com.hbcd.commonbanner.pages;

public interface AddressBookPage {
    public void EditMyAddress(String firstName, String lastName,
                              String streetaddress, String streetaddress2, String city,
                              String country, String province, String postalCard,
                              String phonenumber1, String phonenumber2, String phonenumber3,
                              String phoneextension) throws Exception;

    public void CancelNewAddress() throws Exception;

    public void UpdateAddressBook() throws Exception;

    public void AddNewAddress() throws Exception;

    public void RemoveAddress() throws Exception;

    public void SelectAddress(String addressName) throws Exception;

    public void MakeBillingAddress() throws Exception;
}
