package com.hbcd.commonbanner.overlays;

/*
 * Account Login
 */
public interface SignInOverlay {
    public void enterNewCustomerDetails() throws Exception;

    public SignInOverlay ClickNewMoreCustomer(String email) throws Exception;

    public void LoginWith(String username, String password) throws Exception;

    public void LoginRememberMe() throws Exception;

    public void ClickRegistration() throws Exception;

    public void RegisterForAccount(String... info) throws Exception;

    public void RegisterForAccount(String firstName, String lastName, String emailId,
                                   String verifyemailid, String password, String verifypassword,
                                   String language, String streetaddress, String streetaddress2,
                                   String city, String country, String province, String postalcode,
                                   String phonenumber1, String phonenumber2, String phonenumber3,
                                   String phoneextension) throws Exception;

    public void GuestCheckout() throws Exception;

    public void ContinueShopping() throws Exception;

    public void Close() throws Exception;

    public void textVerification(String textToBeverified, String textdisplayed)
            throws Exception;

    public void LoginWithRegisteredUser(String username, String password)
            throws Exception;

    public void ForgotPassword(String emailID) throws Exception;
}
