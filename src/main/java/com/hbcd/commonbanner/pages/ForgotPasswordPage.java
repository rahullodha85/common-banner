package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 3/3/2016.
 */
public interface ForgotPasswordPage {
    public void ClickContinue(String email) throws Exception;

    public void ClickBackToSigIn() throws Exception;

    public void ClickContinueShopping() throws Exception;

    public void IsForgotPasswordPage() throws Exception;

    public void IsMessageTextPresent(String email) throws Exception;

    public void EnterEmail(String email) throws Exception;

    public void ErrorTextPresent(String text) throws Exception;
}
