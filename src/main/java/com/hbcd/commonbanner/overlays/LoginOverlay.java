package com.hbcd.commonbanner.overlays;

/*
 * Login Overlay when checkout.
 */
public interface LoginOverlay {
    public void LoginWith(String username, String password) throws Exception;

    public void LoginWith(String email) throws Exception;

    public void LoginThruCC(String email) throws Exception;

    public void forgotPassword(String email) throws Exception;

    public void IsInvalidEmail() throws Exception;

    public void IsInvalidPassword() throws Exception;

    public void LoginWithPassword(String password) throws Exception;

    public void LoginWithPaypal(String username, String password) throws Exception;

    public void LoginLock(String email, String password) throws Exception;

    public void ClickForgotPassword() throws Exception;

    public void ClickGuestCheckout() throws Exception;
    public void EnterCredentials(String email,String pwd) throws  Exception;

}
