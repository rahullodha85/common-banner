package com.hbcd.commonbanner.pages;


import com.hbcd.commonbanner.overlays.AddPaymentOverlay;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.EditPaymentOverlay;

public interface PaymentPage {
    public void ClickCheckout() throws Exception;

    public AddressOverlay ClickAddNewBillingAddress() throws Exception;

    public AddressOverlay ClickEditBillingAddressWithEditOption() throws Exception;

    public void EnterSecurityCode(String cvn) throws Exception;

    public void ClickCheckoutWithCvn(String cvn) throws Exception;

    public void AddBillingAddress(String address, String city, String state, String zipcode) throws Exception;

    /**
     * Store card = 0, storeMaster = 1, master = 2, visa = 3
     */
    public void AddNewCreditCard(int cardType) throws Exception;

    public AddPaymentOverlay AddNewCreditCardWithOverlay() throws Exception;

    public void UpdateQuantity(String skuid, String qty) throws Exception;

    public void AddGiftcard(String string, String string2) throws Exception;

    public EditPaymentOverlay EditCreditCardOverlay() throws Exception;

    public void ApplyGiftCard(String cardNumber, String pin) throws Exception;

    public void EnterEmailId(String emailId) throws Exception;

    //public void SelectAddress(String addressName);
    public void RemoveGiftCard() throws Exception;

    public void ContinueWithPaypal() throws Exception;

    public void ApplyHouseCard(String CardType, String CardHolder_Name, String Card_Number) throws Exception;

    public void ApplyCreditCard(String CardType, String CardHolder_Name, String Card_Number, String CVV,
                                String Expiration_month, String Expiration_Year) throws Exception;

    public void ApplyGiftCard(String FirstGiftCardNumber, String FirstGiftCardPin,
                              String SecondGiftCardNumber, String SecondGiftCardPin)
            throws Exception;

    public void ApplyAnotherGiftCard() throws Exception;

    public void PayByHouseCard(String CardType, String Card_Number) throws Exception;

    public void PayByPayPal() throws Exception;

    public void TaxVerification() throws Exception;

    public void LoginToPayPal(String PayPalEmail, String PayPalPassword)
            throws Exception;

    public void EnterPromoCode(String promo) throws Exception;

    public void ClickOnItem(String itemName) throws Exception;

    public void EditBillingAddress(String firstName, String lastName,
                                   String streetaddress, String streetaddress2, String city,
                                   String country, String province, String postalCard,
                                   String phonenumber1, String phonenumber2, String phonenumber3,
                                   String phoneextension, String emailId) throws Exception;

    public void SelectBillingAddress(String AddressName) throws Exception;

    public void EnterPassword() throws Exception;

    public void ClickPayCC() throws Exception;

    public void EnterPassword(String password, String confPassword) throws Exception;

    public void enterNewEmail(String email) throws Exception;

    /**
     * Use it only when the account needs to be created on Payment Page
     */
    public void AddNewCreditCard(int cardType, String password, String confPassword)
            throws Exception;

    public void ClickContinueCheckout() throws Exception;

    public void ContinueCheckoutPaymentPage() throws Exception;

    public void EnterGuestPaymentInformation() throws Exception;

    public void EnterMobileGiftCardNumber(String cardNumber, String pinNumber) throws Exception;

    public void EnterPromotionalCode(String promoCode) throws Exception;
    public void EnterCreditCardDetails(int cardType) throws Exception ;
    public void ApplyPromo(String promoCode) throws Exception;
    public void RemoveFirstAppliedPromo() throws Exception;
    public void EnterPaymentDetails(String cardType, String cardNumber, String cardHolderName) throws Exception;
}
