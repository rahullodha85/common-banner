package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.RegistrationPage;
import com.hbcd.commonbanner.pages.SignInPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class SignInPageBase implements SignInPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.SignInPage;

    public SignInPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public SignInPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
         public void LoginWith(String uname, String passwd)
            throws Exception {

    }

    @Override
    public void LoginWithEmail(String email)
            throws Exception {

    }

    @Override
    public void LoginWithPassword(String password)
            throws Exception {
    }

    @Override
    public RegistrationPage Register(Object... args) throws Exception {
        return null;
    }

    @Override
    public void SignInWithIncorrectUserDetails(String uname, String passwd)
            throws Exception {

    }

    @Override
    public void ForgotPassword(String emailID) throws Exception {

    }

    @Override
    public void SignInRememberMe() throws Exception {

    }

    @Override
    public void RegisterUser() throws Exception {

    }

    @Override
    public void RegisterForAccount(String firstName, String lastName,
                                   String emailId, String verifyemailid, String password,
                                   String verifypassword, String language, String streetaddress,
                                   String streetaddress2, String city, String country,
                                   String province, String postalcode, String phonenumber1,
                                   String phonenumber2, String phonenumber3, String phoneextension)
            throws Exception {

    }

    @Override
    public void UserRegistration() throws Exception {

    }

    @Override
    public void LoginWithRegisteredUser(String uname, String passwd)
            throws Exception {

    }

    @Override
    public void ClickRegistration() throws Exception {

    }

    public void AddBuilding(String number) throws Exception {

    }

    @Override
    public void CheckConfirmation() throws Exception {

    }

    @Override
    public void ClickEdit() throws Exception {

    }

    @Override
    public void EditAddress(String streetaddress) throws Exception {

    }

    @Override
    public void ClickLeftNavAddressBook() throws Exception{

    }

    @Override
    public void ClickCreateAccountBtn() throws Exception {

    }

    @Override
    public void ClickForgotPwdLink() throws Exception {

    }

    @Override
    public void EnterEmailAddressMobile(String email) throws Exception {

    }

    @Override
    public void IsSignInPage() throws Exception {

    }

    @Override
    public void IsSignInSectionPresent() throws Exception {

    }

    @Override
    public void IsCreateAccountSectionPresent() throws Exception {

    }

    @Override
    public void IsErrorTextPresent(String text) throws Exception {

    }

    @Override
    public void IsEmailErrorTextPresent(String text) throws Exception {

    }

    @Override
    public void IsPwdErrorTextPresent(String text) throws Exception {

    }

    @Override
    public void IsCreateAccountBtnPresent() throws Exception {

    }

    @Override
    public void CheckOrderStatus(String orderNum, String zip) throws Exception {

    }

    @Override
    public void IsOrderNumErrorTextPresent(String text) throws Exception {

    }

    @Override
    public void IsBillingZipErrorTextPresent(String text) throws Exception {

    }

    @Override
    public void ClickSubmit() throws Exception {

    }
}
