package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.LoginOverlay;
import com.hbcd.commonbanner.overlays.Overlay;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class LoginOverlayBase implements LoginOverlay, Overlay {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.LoginOverlay;

    public LoginOverlayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public LoginOverlayBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public void LoginWith(String username, String password) throws Exception {

    }

    @Override
    public void LoginWith(String email) throws Exception {

    }

    @Override
    public void LoginThruCC(String email) throws Exception {

    }

    @Override
    public void forgotPassword(String email) throws Exception {

    }

    @Override
    public void IsInvalidEmail() throws Exception {

    }

    @Override
    public void IsInvalidPassword() throws Exception {

    }

    @Override
    public void LoginWithPassword(String password) throws Exception {

    }

    @Override
    public void LoginWithPaypal(String username, String password)
            throws Exception {

    }

    @Override
    public void LoginLock(String email, String password) throws Exception {

    }

    @Override
    public void ClickForgotPassword() throws Exception {

    }

    @Override
    public void ClickGuestCheckout() throws Exception {

    }

    @Override
    public void EnterCredentials(String email, String pwd) throws Exception {

    }

}
