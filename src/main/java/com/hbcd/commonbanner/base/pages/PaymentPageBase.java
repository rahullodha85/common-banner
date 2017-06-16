package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.AddPaymentOverlay;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.EditPaymentOverlay;
import com.hbcd.commonbanner.pages.PaymentPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class PaymentPageBase implements PaymentPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.PaymentPage;

    public PaymentPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public PaymentPageBase(boolean isVal) {
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
    public AddressOverlay ClickEditBillingAddressWithEditOption() throws Exception {
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
    public void EnterPromoCode(String promo) throws Exception {

    }

    @Override
    public void ClickOnItem(String itemName) throws Exception {

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
    public void EnterPassword() throws Exception {
    }

    @Override
    public void ClickPayCC() throws Exception {

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
    public void ClickContinueCheckout() throws Exception{


    }

    @Override
    public void ContinueCheckoutPaymentPage() throws Exception {

    }

    @Override
    public void EnterGuestPaymentInformation() throws Exception {

    }

    @Override
    public void EnterMobileGiftCardNumber(String cardNumber,String pinNumber) throws Exception {

    }

    @Override
    public void EnterPromotionalCode(String promoCode) throws Exception {

    }
    public void EnterCreditCardDetails(int cardType) throws Exception {}

    @Override
    public void ApplyPromo(String promoCode) throws Exception {

    }

    @Override
    public void RemoveFirstAppliedPromo() throws Exception {

    }

    @Override
    public void EnterPaymentDetails(String cardType, String cardNumber, String cardHolderName) throws Exception {

    }
}
