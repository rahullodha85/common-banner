package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.enums.ShipMethod;
import com.hbcd.commonbanner.overlays.AddPaymentOverlay;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.EditPaymentOverlay;
import com.hbcd.commonbanner.overlays.QASOverlay;
import com.hbcd.commonbanner.pages.ShippingPaymentPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class ShippingPaymentPageBase implements ShippingPaymentPage {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.ShippingPaymentPage;

    public ShippingPaymentPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public ShippingPaymentPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void ClickCheckout() throws Exception {

    }

    @Override
    public AddressOverlay ClickAddNewBillingAddress() throws Exception {
        return null;
    }

    @Override
    public AddressOverlay ClickEditBillingAddressWithEditOption()
            throws Exception {
        return null;
    }

    @Override
    public void EnterSecurityCode(String cvn) throws Exception {

    }

    @Override
    public void ClickCheckoutWithCvn(String cvn) throws Exception {

    }

    @Override
    public void AddBillingAddress(String address, String city, String state,
                                  String zipcode) throws Exception {

    }

    @Override
    public void AddNewCreditCard(int cardType) throws Exception {

    }

    @Override
    public AddPaymentOverlay AddNewCreditCardWithOverlay() throws Exception {
        return null;
    }

    @Override
    public void UpdateQuantity(String skuid, String qty) throws Exception {

    }

    @Override
    public void AddGiftcard(String string, String string2) throws Exception {

    }

    @Override
    public EditPaymentOverlay EditCreditCardOverlay() throws Exception {
        return null;
    }

    @Override
    public void ApplyGiftCard(String cardNumber, String pin) throws Exception {

    }

    @Override
    public void EnterEmailId(String emailId) throws Exception {

    }

    @Override
    public void RemoveGiftCard() throws Exception {

    }

    @Override
    public void ContinueWithPaypal() throws Exception {

    }

    @Override
    public void ApplyHouseCard(String CardType, String CardHolder_Name, String Card_Number) throws Exception {

    }

    @Override
    public void ApplyCreditCard(String CardType, String CardHolder_Name, String Card_Number,
                                String CVV, String Expiration_month, String Expiration_Year)
            throws Exception {

    }

    @Override
    public void ApplyGiftCard(String FirstGiftCardNumber,
                              String FirstGiftCardPin, String SecondGiftCardNumber,
                              String SecondGiftCardPin) throws Exception {

    }

    @Override
    public void ApplyAnotherGiftCard() throws Exception {

    }

    @Override
    public void PayByHouseCard(String CardType, String Card_Number)
            throws Exception {

    }

    @Override
    public void PayByPayPal() throws Exception {

    }

    @Override
    public void TaxVerification() throws Exception {

    }

    @Override
    public void LoginToPayPal(String PayPalEmail, String PayPalPassword)
            throws Exception {

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
    public void AddBillingAddress(String address, String state, String city,
                                  String zip, boolean makeDefault) throws Exception {

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault)
            throws Exception {

    }

    @Override
    public AddressOverlay EnterShippingAddress(String checkOutFlow)
            throws Exception {
        return null;
    }

    @Override
    public void ClickDomesticShpAddClose() throws Exception {

    }

    @Override
    public void ClickInternationalShipping() throws Exception {

    }

    @Override
    public void ClickCheckoutWithPaypal() throws Exception {

    }

    @Override
    public AddressOverlay s5a_AddressOverlay() throws Exception {
        return null;
    }

    @Override
    public void SelectAddress(String addressName) throws Exception {

    }

    @Override
    public AddressOverlay ClickAddShippingAddress() throws Exception {
        return null;
    }

    @Override
    public void EditShippingAddress(String firstName, String lastName,
                                    String streetaddress, String streetaddress2, String city,
                                    String country, String province, String postalCard,
                                    String phonenumber1, String phonenumber2, String phonenumber3,
                                    String phoneextension) throws Exception {

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
            throws Exception {

    }

    @Override
    public void FreeShippingForGreaterThan99() throws Exception {

    }

    @Override
    public void SelectShippingAddress(String address) throws Exception {

    }

    @Override
    public void GSTorHSTVerification() throws Exception {

    }

    @Override
    public void SelectGiftBoxItems() throws Exception {

    }

    @Override
    public void RemoveItem() throws Exception {

    }

    @Override
    public void ExpandGiftOptions() throws Exception {

    }

    @Override
    public void AddItemToWishList() throws Exception {

    }

    @Override
    public void ClickDoNotShowPrices() throws Exception {

    }

    @Override
    public void SelectShippingMethod(String shippingMethod) throws Exception {

    }

    @Override
    public void EnterPromoCode(String promo) throws Exception {

    }

    @Override
    public void ClickOnItem(String itemName) throws Exception {

    }

    @Override
    public void AddGiftMessage(String Message) throws Exception {

    }

    @Override
    public void EditBillingAddress(String firstName, String lastName,
                                   String streetaddress, String streetaddress2, String city,
                                   String country, String province, String postalCard,
                                   String phonenumber1, String phonenumber2, String phonenumber3,
                                   String phoneextension, String emailId) throws Exception {

    }

    @Override
    public void SelectBillingAddress(String AddressName) throws Exception {

    }

    @Override
    public void CreateShippingAddress(String firstName, String lastName,
                                      String streetaddress, String streetaddress2, String city,
                                      String province, String postalCard, String phonenumber1,
                                      String phonenumber2, String phonenumber3, String phoneextension)
            throws Exception {

    }

    @Override
    public void CreateBillingAddress(String firstName, String lastName,
                                     String streetaddress, String streetaddress2, String city,
                                     String country, String province, String postalCard,
                                     String phonenumber1, String phonenumber2, String phonenumber3,
                                     String phoneextension, String emailId) throws Exception {

    }

    @Override
    public void ClickMultiContinue() throws Exception {

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email) throws Exception {

    }

    @Override
    public void GetSubTotal() throws Exception {

    }

    @Override
    public void ComparePrice() throws Exception {

    }

    @Override
    public void EnterPassword() throws Exception {

    }

    public void ClickPayCC() throws Exception {

    }

    @Override
    public void AddShippingAddress(Boolean shipToMultiple, String address,
                                   String state, String city, String zip, boolean makeDefault,
                                   String email, String phone) throws Exception {

    }

    @Override
    public void ValidateEmailErrorMsg() {

    }

    @Override
    public void ValidatePhoneErrorMsg() {

    }

    @Override
    public void ValidateEmailLabel() {

    }

    @Override
    public void ValidatePhoneLabel() {

    }

    @Override
    public void EnterPassword(String password, String confPassword)
            throws Exception {

    }

    @Override
    public void enterNewEmail(String email) throws Exception {

    }

    @Override
    public void AddNewCreditCard(int cardType, String password,
                                 String confPassword) throws Exception {

    }

    @Override
    public void ClickContinueCheckout() throws Exception {

    }

    @Override
    public void ContinueCheckoutPaymentPage() throws Exception {

    }

    @Override
    public void EnterGuestPaymentInformation() throws Exception {

    }

    @Override
    public void EnterMobileGiftCardNumber(String cardNumber, String pinNumber) throws Exception {

    }

    @Override
    public void EnterPromotionalCode(String promoCode) throws Exception {

    }

    @Override
    public void EnterCreditCardDetails(int cardType) throws Exception {

    }

    @Override
    public void ApplyPromo(String promoCode) throws Exception {

    }

    @Override
    public void RemoveFirstAppliedPromo() throws Exception {

    }

    @Override
    public void EnterPaymentDetails(String cardType, String cardNumber, String cardHolderName) throws Exception {

    }

    @Override
    public void EnterShippingAddressBorderFree(String firstName,
                                               String lastName, String streetaddress, String streetaddress2,
                                               String streetaddress3, String city, String region,
                                               String postalCode, String country, String phonenumber1,
                                               String phonenumber2, String emailId, String cardNumber,
                                               String expMonth, String expYear, String secCode) throws Exception {

    }

    @Override
    public void ClickEditItem() throws Exception {

    }

    public void ValidateShpFrmStoreMsg() throws Exception {

    }

    @Override
    public void confirmAddress() throws Exception {

    }

    @Override
    public void ValidateShpMethodSelected(String string) throws Exception {

    }

    @Override
    public void MakeGift(String option) throws Exception {

    }

    @Override
    public void SelectCreditCardType(String CardType) throws Exception {

    }

    @Override
    public void ResetCreditCardType() throws Exception {

    }

    @Override
    public void SelectShippingMethodFor(String upc, String shippingMethod)
            throws Exception {

    }

    @Override
    public void SelectShippingMethodFor(String upc, ShipMethod shippingMethod)
            throws Exception {

    }

    @Override
    public void SelectRequireSignatureFor(String upc) throws Exception {

    }

    @Override
    public void ClickContinueAfterMultiShip() throws Exception {

    }

    @Override
    public void editGifts() throws Exception {

    }

    @Override
    public void RemoveGift() throws Exception {

    }

    @Override
    public void SelectShippingMethodInternational(String shippingMethod) throws Exception {

    }

    @Override
    public void ClickMultipleAddress() throws Exception {

    }

    @Override
    public void ClickNewBillingAddress() throws Exception {

    }

    @Override
    public void ClickNewShippingAddress() throws Exception {

    }

    @Override
    public void EditShippingZipCode(String zipCode) throws Exception {

    }

    @Override
    public void EditBillingZipCode(String zipCode) throws Exception {

    }

    @Override
    public void ClickEditEditBillingAddress() throws Exception {

    }

    @Override
    public void ClickEditEditShippingAddress() throws Exception {

    }

    @Override
    public void SelectCountry(String country) throws Exception {

    }

    @Override
    public void AddInternationalShippingAddress(String address, String province, String city, String zip, boolean makeDefault) throws Exception{

    }


}



	


