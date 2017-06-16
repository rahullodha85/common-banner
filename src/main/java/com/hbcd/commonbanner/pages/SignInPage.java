package com.hbcd.commonbanner.pages;

import cucumber.api.java.gl.E;

public interface SignInPage {

    public void LoginWith(String uname, String passwd)
            throws Exception;

    public void LoginWithEmail(String email)
            throws Exception;

    public void LoginWithPassword(String password)
            throws Exception;

    public RegistrationPage Register(Object... args) throws Exception;

    public void SignInWithIncorrectUserDetails(String uname, String passwd)
            throws Exception;

    public void ForgotPassword(String emailID) throws Exception;

    public void SignInRememberMe() throws Exception;

    public void RegisterUser() throws Exception;

    public void RegisterForAccount(String firstName, String lastName,
                                   String emailId, String verifyemailid, String password,
                                   String verifypassword, String language, String streetaddress,
                                   String streetaddress2, String city, String country,
                                   String province, String postalcode, String phonenumber1,
                                   String phonenumber2, String phonenumber3, String phoneextension)
            throws Exception;

    public void UserRegistration() throws Exception;

    public void LoginWithRegisteredUser(String uname, String passwd) throws Exception;

    public void ClickRegistration() throws Exception;

    public void AddBuilding(String number) throws Exception;

    public void CheckConfirmation() throws Exception;

    public void ClickEdit() throws Exception;

    public void EditAddress(String streetaddress) throws Exception;

    public void ClickLeftNavAddressBook() throws Exception;

    public void ClickCreateAccountBtn() throws Exception;

    public void ClickForgotPwdLink() throws Exception;

    public void EnterEmailAddressMobile(String email) throws Exception;

    public void IsSignInPage() throws Exception;

    public void IsSignInSectionPresent() throws Exception;

    public void IsCreateAccountSectionPresent() throws Exception;

    public void IsErrorTextPresent(String text) throws Exception;

    public void IsEmailErrorTextPresent(String text) throws Exception;

    public void IsPwdErrorTextPresent(String text) throws Exception;

    public void IsCreateAccountBtnPresent() throws Exception;

    public void CheckOrderStatus(String orderNum, String zip) throws Exception;

    public void IsOrderNumErrorTextPresent(String text) throws Exception;

    public void IsBillingZipErrorTextPresent(String text) throws Exception;

    public void ClickSubmit() throws Exception;
}
