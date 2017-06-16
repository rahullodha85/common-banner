package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.AddPaymentOverlay;
import com.hbcd.commonbanner.overlays.AddressOverlay;
import com.hbcd.commonbanner.overlays.EditPaymentOverlay;
import com.hbcd.commonbanner.overlays.TrueFitProfileOverlay;
import com.hbcd.commonbanner.pages.*;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class YourAccountPageBase implements YourAccountPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.AccountPage;

    public YourAccountPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public YourAccountPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public ManageShippingPage ClickManageShipping() throws Exception {
        return null;
    }

    @Override
    public AddressOverlay ClickAddBilling() throws Exception {

        return null;
    }

    @Override
    public AddressOverlay ClickAddShipping() throws Exception {

        return null;
    }

    @Override
    public AddressOverlay ClickEditProfileAddress() throws Exception {

        return null;
    }

    @Override
    public AddPaymentOverlay ClickAddPayment() throws Exception {

        return null;
    }

    @Override
    public EditPaymentOverlay ClickEditPayment() throws Exception {

        return null;
    }

    @Override
    public YourAccountPage GoToMyAcccount() throws Exception {

        return null;
    }

    @Override
    public void ClickRemoveAddress() throws Exception {


    }

    @Override
    public void CancelMostRecentOrder() throws Exception {


    }

    @Override
    public void CancelOrder(String orderNumber, String zip) throws Exception {


    }

    @Override
    public void Go() throws Exception {


    }

    @Override
    public void Login(String email, String pwd) throws Exception {


    }

    @Override
    public void RemoveCreditCard() throws Exception {


    }

    @Override
    public void ClickPaymentInformation() throws Exception {


    }

    @Override
    public void VerifyBillingAddressBook(String address) throws Exception {


    }

    @Override
    public void VerifyShippingAddressBook(String address) throws Exception {


    }

    @Override
    public void ClickRemovePayment(String cardName) throws Exception {


    }

    @Override
    public void CreateAccount(String email) throws Exception {


    }

    @Override
    public void ChangePassword(String current, String password)
            throws Exception {


    }

    @Override
    public void Signout() throws Exception {


    }

    @Override
    public void AccessOrderStatus(String orderNumber, String zipCode)
            throws Exception {


    }

    @Override
    public void ClickShippingAddressBook() throws Exception {


    }

    @Override
    public void ClickBillingAddressBook() throws Exception {


    }

    @Override
    public void removeFromShippingAddressBook(String address) throws Exception {


    }

    @Override
    public void removeFromBillingAddressBook(String address) throws Exception {


    }

    @Override
    public void AddCreditCard(String string, String string2, String string3,
                              String string4, String string5) throws Exception {


    }

    @Override
    public void CreateRandomAccount(String string) throws Exception {


    }

    @Override
    public void clickSave() throws Exception {


    }

    @Override
    public void Login(String email) throws Exception {


    }

    @Override
    public WishList GoToMyWishList() throws Exception {

        return null;
    }

    @Override
    public WishList ViewFullWishList() throws Exception {

        return null;
    }

    @Override
    public TrueFitProfileOverlay EditTrueFitProfile() throws Exception {

        return null;
    }

    @Override
    public void CreateTrueFit() throws Exception {


    }

    @Override
    public void ClickViewDetails() throws Exception {


    }

    @Override
    public void UpdateMyProfile(String firstName, String lastName,
                                String password, String verifypassword, String streetaddress,
                                String streetaddress2, String city, String country,
                                String province, String postalCard, String phonenumber1,
                                String phonenumber2, String phonenumber3, String phoneextension,
                                String preferredlanguage) throws Exception {


    }

    @Override
    public OrderPage ClickMyOrders() throws Exception {

        return null;
    }

    @Override
    public NotificationPrefPage ClickNotificationPref() throws Exception {

        return null;
    }

    @Override
    public void ProductInformation(String itemName) throws Exception {


    }

    @Override
    public void ClickUpdateMyProfile() throws Exception {


    }
    @Override
    public void RemoveWishlList() throws Exception {

    }

    @Override
    public void ClickForgotPassword() throws Exception {

    }

    @Override
    public void ClickLinkFromSubLeftMenu(String linkName) throws Exception {

    }

    @Override
    public void ChangeFirstName(String name) throws Exception {

    }

    @Override
    public void clickSaksFifthLogo() throws Exception {

    }
    @Override
    public void ChangeSecondaryAddress(String secondardAddress) throws Exception {

    }

    @Override
    public void AddNewAddress(String firstName, String lastName,
                              String streetaddress,String streetaddress2,
                              String city, String country,
                              String province, String postalCard,
                              String phonenumber1,String phonenumber2,
                              String phonenumber3,String phoneextension) throws Exception {

    }

    @Override
    public void UpdateAddress(String firstName, String lastName, String streetaddress,
                              String streetaddress2, String city, String country, String province,
                              String postalCard, String phonenumber1, String phonenumber2,
                              String phonenumber3, String phoneextension) throws Exception {

    }
}
