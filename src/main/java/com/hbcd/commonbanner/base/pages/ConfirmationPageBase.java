package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.ConfirmationPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class ConfirmationPageBase implements ConfirmationPage {
    protected boolean isValidate = false;
    protected PageName pageName = PageName.PDPPage;

    public ConfirmationPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public ConfirmationPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void CancelOrder() throws Exception {

    }

    public void CreateAccount() throws Exception {

    }

    @Override
    public void GoToYourAccount() throws Exception {

    }

    @Override
    public void EnterPassword(String createPwd, String verifyPwd)
            throws Exception {

    }

    @Override
    public void CheckConfirmation() throws Exception {

    }

    @Override
    public void ClickPrintReceipt() throws Exception {

    }
}
