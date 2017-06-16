package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 3/22/2016.
 */
public interface AccountSettingsPage {
    public void ClickChangePwd() throws Exception;
    public void ClickEditProfile() throws Exception;
    public void IsAccountSettingsPage(String text) throws Exception;
    public void VerifEmail(String text) throws Exception;
    public void VerifyFullName(String text) throws Exception;
    public void ClickEditEmailPref() throws Exception;
}
