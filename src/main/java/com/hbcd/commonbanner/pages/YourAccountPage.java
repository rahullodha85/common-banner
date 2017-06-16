package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.overlays.AddPaymentOverlay;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.EditPaymentOverlay;
import com.hbcd.commonbanner.overlays.TrueFitProfileOverlay;

public interface YourAccountPage {
    public ManageShippingPage ClickManageShipping() throws Exception;

    public AddressOverlay ClickAddBilling() throws Exception;

    public AddressOverlay ClickAddShipping() throws Exception;

    public AddressOverlay ClickEditProfileAddress() throws Exception;

    public AddPaymentOverlay ClickAddPayment() throws Exception;

    public EditPaymentOverlay ClickEditPayment() throws Exception;

    public YourAccountPage GoToMyAcccount() throws Exception;

    public void ClickRemoveAddress() throws Exception;

    public void CancelMostRecentOrder() throws Exception;

    public void CancelOrder(String orderNumber, String zip) throws Exception;

    public void Go() throws Exception;

    public void Login(String email, String pwd) throws Exception;

    public void RemoveCreditCard() throws Exception;

    //	public void VerifyCreditCard(String ccNumber);
    public void ClickPaymentInformation() throws Exception;

    public void VerifyBillingAddressBook(String address) throws Exception;

    public void VerifyShippingAddressBook(String address) throws Exception;

    public void ClickRemovePayment(String cardName) throws Exception;

    public void CreateAccount(String email) throws Exception;

    public void ChangePassword(String current, String password) throws Exception;

    public void Signout() throws Exception;

    public void AccessOrderStatus(String orderNumber, String zipCode) throws Exception;

    public void ClickShippingAddressBook() throws Exception;

    public void ClickBillingAddressBook() throws Exception;

    public void removeFromShippingAddressBook(String address) throws Exception;

    public void removeFromBillingAddressBook(String address) throws Exception;

    public void AddCreditCard(String string, String string2, String string3,
                              String string4, String string5) throws Exception;

    public void CreateRandomAccount(String string) throws Exception;

    public void clickSave() throws Exception;

    public void Login(String email) throws Exception;

    public WishList GoToMyWishList() throws Exception;

    public WishList ViewFullWishList() throws Exception;

    public TrueFitProfileOverlay EditTrueFitProfile() throws Exception;

    public void CreateTrueFit() throws Exception;

    public void ClickViewDetails() throws Exception;

    public void UpdateMyProfile(String firstName, String lastName, String password,
                                String verifypassword, String streetaddress, String streetaddress2,
                                String city, String country, String province, String postalCard,
                                String phonenumber1, String phonenumber2, String phonenumber3,
                                String phoneextension, String preferredlanguage) throws Exception;

    public NotificationPrefPage ClickNotificationPref() throws Exception;

    public OrderPage ClickMyOrders() throws Exception;

    public void ProductInformation(String itemName) throws Exception;

    public void ClickUpdateMyProfile() throws Exception;

    public void RemoveWishlList() throws Exception;

    public void ClickForgotPassword() throws Exception;

    public void ClickLinkFromSubLeftMenu(String linkName) throws Exception;
    public void ChangeFirstName(String name) throws Exception;
    public void clickSaksFifthLogo() throws Exception;
    public void ChangeSecondaryAddress(String secondardAddress) throws Exception;

    public void AddNewAddress(String firstName, String lastName,
                              String streetaddress,String streetaddress2,
                              String city, String country,
                              String province, String postalCard,
                              String phonenumber1,String phonenumber2,
                              String phonenumber3,String phoneextension) throws Exception;

    public void UpdateAddress(String firstName, String lastName,
                              String streetaddress,String streetaddress2,
                              String city, String country,
                              String province, String postalCard,
                              String phonenumber1,String phonenumber2,
                              String phonenumber3,String phoneextension) throws Exception;
}
