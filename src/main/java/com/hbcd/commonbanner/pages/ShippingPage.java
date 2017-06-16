package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.enums.ShipMethod;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.QASOverlay;

public interface ShippingPage {

    public QASOverlay ClickCheckoutOptionalAddressConfirmation()
            throws Exception;

    public void ClickDomesticShpAddClose() throws Exception;

    public void ClickInternationalShipping() throws Exception;

    public void ClickCheckoutWithPaypal() throws Exception;
    public AddressOverlay s5a_AddressOverlay() throws Exception;

    public void SelectAddress(String addressName) throws Exception;

    public void ClickEditBillingAddress() throws Exception;

    public void AddBillingAddress(String address, String state, String city,
                                  String zip, boolean makeDefault) throws Exception;

    public AddressOverlay ClickAddShippingAddress() throws Exception;

    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault)
            throws Exception;

    public AddressOverlay ClickEditShippingAddress() throws Exception;

    public void EditShippingAddress(String firstName, String lastName,
                                    String streetaddress, String streetaddress2, String city,
                                    String country, String province, String postalCard,
                                    String phonenumber1, String phonenumber2, String phonenumber3,
                                    String phoneextension) throws Exception;

    public AddressOverlay EnterShippingAddress(String checkOutFlow)
            throws Exception;

    public void EnterShippingAddress(String firstName, String lastName,
                                     String streetaddress, String streetaddress2, String city,
                                     String country, String province, String postalCard,
                                     String phonenumber1, String phonenumber2, String phonenumber3,
                                     String phoneextension, String emailId, String firstname2,
                                     String lastname2, String streetaddress1, String street2address2,
                                     String city2, String province2, String postalcode2,
                                     String phone1_1, String phone2_2, String phone3_3, String phoneext2)
            throws Exception;

    public void SelectShippingAddress(String address) throws Exception;

    public void FreeShippingForGreaterThan99() throws Exception;

    public void GSTorHSTVerification() throws Exception;

    public void SelectGiftBoxItems() throws Exception;

    public void RemoveItem() throws Exception;

    public void ExpandGiftOptions() throws Exception;

    public void AddItemToWishList() throws Exception;

    public void ClickDoNotShowPrices() throws Exception;

    public void SelectShippingMethod(String shippingMethod) throws Exception;

    public void AddGiftMessage(String Message) throws Exception;

    public void confirmAddress() throws Exception;

    public void CreateShippingAddress(String firstName, String lastName,
                                      String streetaddress, String streetaddress2, String city,
                                      String province, String postalCard, String phonenumber1,
                                      String phonenumber2, String phonenumber3, String phoneextension)
            throws Exception;

    public void CreateBillingAddress(String firstName, String lastName,
                                     String streetaddress, String streetaddress2, String city,
                                     String country, String province, String postalCard,
                                     String phonenumber1, String phonenumber2, String phonenumber3,
                                     String phoneextension, String emailId) throws Exception;

    void ClickMultiContinue() throws Exception;

    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email) throws Exception;

    /**
     * Method used only when Email or Phone Number needs to be entered through
     * script
     */
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email, String phone) throws Exception;

    public void ValidateEmailErrorMsg();

    public void ValidatePhoneErrorMsg();

    public void ValidateEmailLabel();

    public void ValidatePhoneLabel();

    public void ClickEditItem() throws Exception;

    public void SelectShippingMethodFor(String upc, ShipMethod shippingMethod)
            throws Exception;

    public void SelectRequireSignatureFor(String upc) throws Exception;

    public void SelectShippingMethodFor(String upc, String shippingMethod)
            throws Exception;

    public void ClickContinueAfterMultiShip() throws Exception;
    public void editGifts() throws Exception;
    public void RemoveGift() throws Exception;
    public void SelectShippingMethodInternational(String shippingMethod) throws Exception;
    public void ClickMultipleAddress() throws Exception;
    public void ClickNewBillingAddress() throws Exception;
    public void ClickNewShippingAddress() throws Exception;
    public void EditShippingZipCode(String zipCode) throws Exception;
    public void EditBillingZipCode(String zipCode) throws Exception;

    public void ClickEditEditBillingAddress() throws Exception;

    public void ClickEditEditShippingAddress() throws Exception;

    public void SelectCountry(String country) throws Exception;

    public void AddInternationalShippingAddress(String address, String province, String city, String zip, boolean makeDefault) throws Exception;
}
