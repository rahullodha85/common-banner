package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.enums.ShipMethod;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.QASOverlay;
import com.hbcd.commonbanner.pages.Page;
import com.hbcd.commonbanner.pages.ShippingPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class ShippingPageBase implements ShippingPage, Page {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.ShippingPage;

    public ShippingPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public ShippingPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public QASOverlay ClickCheckoutOptionalAddressConfirmation()
            throws Exception {
        return null;
    }

    @Override
    public AddressOverlay ClickEditShippingAddress() throws Exception {
        return null;
    }

    @Override
    public void ClickEditBillingAddress() throws Exception {

    }
    @Override
    public void ClickEditEditBillingAddress() throws Exception{

    }
    @Override
    public void ClickEditEditShippingAddress() throws Exception{

    }

    @Override
    public void SelectCountry(String country) throws Exception{

    }

    @Override
    public void AddInternationalShippingAddress(String address, String province, String city, String zip, boolean makeDefault) throws Exception{

    }

    @Override
    public void AddBillingAddress(String address, String state, String city,
                                  String zip, boolean makeDefault) throws Exception{

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault) throws Exception{

    }

    @Override
    public AddressOverlay EnterShippingAddress(String checkOutFlow)
            throws Exception {
        return null;
    }

    @Override
    public void ClickDomesticShpAddClose() throws Exception{

    }

    @Override
    public void ClickInternationalShipping() throws Exception{

    }

    @Override
    public void ClickCheckoutWithPaypal() throws Exception{

    }

    @Override
    public void SelectAddress(String addressName) throws Exception{

    }

    @Override
    public AddressOverlay ClickAddShippingAddress() throws Exception{
        return null;
    }

    @Override
    public void EditShippingAddress(String firstName, String lastName,
                                    String streetaddress, String streetaddress2, String city,
                                    String country, String province, String postalCard,
                                    String phonenumber1, String phonenumber2, String phonenumber3,
                                    String phoneextension) throws Exception{

    }

    @Override
    public void EnterShippingAddress(String firstName, String lastName,
                                     String streetaddress, String streetaddress2, String city,
                                     String country, String province, String postalCard,
                                     String phonenumber1, String phonenumber2, String phonenumber3,
                                     String phoneextension, String emailId, String firstname2,
                                     String lastname2, String streetaddress1, String street2address2,
                                     String city2, String province2, String postalcode2,
                                     String phone1_1, String phone2_2, String phone3_3, String phoneext2)
            throws Exception{

    }

    @Override
    public void FreeShippingForGreaterThan99() throws Exception{

    }

    @Override
    public void SelectShippingAddress(String address) throws Exception{

    }

    @Override
    public void GSTorHSTVerification() throws Exception{

    }

    @Override
    public void SelectGiftBoxItems() throws Exception{

    }

    @Override
    public void RemoveItem() throws Exception{

    }

    @Override
    public void ExpandGiftOptions() throws Exception{

    }

    @Override
    public void AddItemToWishList() throws Exception{

    }

    @Override
    public void ClickDoNotShowPrices() throws Exception{

    }

    @Override
    public void SelectShippingMethod(String shippingMethod) throws Exception{

    }

    @Override
    public void SelectShippingMethodFor(String upc, ShipMethod shippingMethod) throws Exception{

    }

    @Override
    public void AddGiftMessage(String Message) throws Exception{

    }

    @Override
    public void CreateShippingAddress(String firstName, String lastName,
                                      String streetaddress, String streetaddress2, String city,
                                      String province, String postalCard, String phonenumber1,
                                      String phonenumber2, String phonenumber3, String phoneextension) throws Exception{

    }

    @Override
    public void CreateBillingAddress(String firstName, String lastName,
                                     String streetaddress, String streetaddress2, String city,
                                     String country, String province, String postalCard,
                                     String phonenumber1, String phonenumber2, String phonenumber3,
                                     String phoneextension, String emailId) throws Exception{

    }

    @Override
    public void ClickMultiContinue() throws Exception{

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email) throws Exception{

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email, String phone) throws Exception{

    }

    @Override
    public void ValidateEmailErrorMsg(){

    }

    @Override
    public void ValidatePhoneErrorMsg(){

    }

    @Override
    public void ValidateEmailLabel(){

    }

    @Override
    public void ValidatePhoneLabel(){

    }

    @Override
    public void ClickEditItem() throws Exception{

    }

    @Override
    public void confirmAddress() throws Exception{

    }

    @Override
    public void SelectRequireSignatureFor(String upc) throws Exception{

    }

    @Override
    public void SelectShippingMethodFor(String upc, String shippingMethod) throws Exception{

    }

    @Override
    public void ClickContinueAfterMultiShip() throws Exception{

    }

    @Override
    public void editGifts() throws Exception{

    }

    @Override
    public void RemoveGift() throws Exception{

    }

    @Override
    public void SelectShippingMethodInternational(String shippingMethod) throws Exception{

    }

    @Override
    public void ClickMultipleAddress() throws Exception{

    }

    @Override
    public void ClickNewBillingAddress() throws Exception{

    }

    @Override
    public void ClickNewShippingAddress() throws Exception {

    }

    @Override
    public void EditShippingZipCode(String zipCode) throws Exception{

    }

    @Override
    public void EditBillingZipCode(String zipCode) throws Exception{

    }

    @Override
    public AddressOverlay s5a_AddressOverlay() throws Exception{
        return null;
    }

}
