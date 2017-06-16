package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 1/21/2016.
 */
public interface CreateAccountPage {
    public void AreYouCanadianSelection(String value) throws Exception;

    public void ClickCancel() throws Exception;

    public void CreateAccount(String firstName, String lastName, String email, String pwd, String confPwd) throws Exception;

    public void ClickCreateAccount() throws Exception;

    public void IsCreateAccountPage() throws Exception;

    public void IsFirstNamePresent() throws Exception;

    public void IsLastNamePresent() throws Exception;

    public void IsEmailPresent() throws Exception;

    public void IsPasswordPresent() throws Exception;

    public void IsConfPasswordPresent() throws Exception;

    public void IsPhonePresent() throws Exception;

    public void IsZipPresent() throws Exception;

    public void IsCanadianCustomerAgreementPresent() throws Exception;

    public void IsPrivacyPolicyPresent() throws Exception;

    public void IsCheckBoxPresent(String text) throws Exception;

    public void IsTermsCondPresent() throws Exception;

    public void IsFirstNameErrorTextPresent(String text) throws Exception;

    public void IsConfPwdErrorTextPresent(String text) throws Exception;

    public void IsPwdErrorTextPresent(String text) throws Exception;

    public void IsLastNameErrorTextPresent(String text) throws Exception;

    public void IsEmailErrorTextPresent(String text) throws Exception;

    public void PrivacyPolicyHasLink(String text) throws Exception;

    public void IsMoreNumMsgPresent(String text) throws Exception;
}
