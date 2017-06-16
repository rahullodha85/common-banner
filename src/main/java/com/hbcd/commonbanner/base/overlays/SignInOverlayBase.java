package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.SignInOverlay;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.enums.impl.Check;
import com.hbcd.scripting.reporting.StepLogger;

public class SignInOverlayBase implements SignInOverlay {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.SignInOverlay;

    public SignInOverlayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public SignInOverlayBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void enterNewCustomerDetails() throws Exception {

    }

    public SignInOverlay ClickNewMoreCustomer(String email) throws Exception {
        return null;
    }

    @Override
    public void LoginWith(String username, String password) throws Exception {
        Find.Object("ccUserNameTxt").input(username);
        Find.Object("ccPasswordTxt").input(password);
        StepLogger.validate(Check.ObjectPresent, "ccLoginBtn");
        Find.Object("ccLoginBtn").click();
    }

    public void LoginRememberMe() throws Exception {

    }

    @Override
    public void RegisterForAccount(String... info) throws Exception {

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
    public void ClickRegistration() throws Exception {

    }

    @Override
    public void GuestCheckout() throws Exception {

    }

    @Override
    public void ContinueShopping() throws Exception {

    }

    @Override
    public void Close() throws Exception {

    }

    @Override
    public void textVerification(String textToBeverified, String textdisplayed)
            throws Exception {

    }

    @Override
    public void LoginWithRegisteredUser(String username, String password)
            throws Exception {

    }

    @Override
    public void ForgotPassword(String emailID) throws Exception {

    }

}
