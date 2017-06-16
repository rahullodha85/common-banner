package com.hbcd.commonbanner.pages;

public interface ConfirmationPage {

    public void CancelOrder() throws Exception;

    public void CreateAccount() throws Exception;

    public void GoToYourAccount() throws Exception;

    public void EnterPassword(String createPwd, String verifyPwd) throws Exception;

    public void CheckConfirmation() throws Exception;

    public void ClickPrintReceipt() throws Exception;
}
