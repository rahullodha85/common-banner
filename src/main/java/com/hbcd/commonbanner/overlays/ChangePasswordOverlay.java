package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 3/22/2016.
 */
public interface ChangePasswordOverlay {
    public void ChangePwd(String oldPwd, String newPwd, String confPwd) throws Exception;

    public void ClickCancel() throws Exception;

    public void ClickSubmit() throws Exception;

    public void IsChangePwdOverlay(String text) throws Exception;

    public void VerifyOldPasswordError(String text) throws Exception;

    public void VerifyNewPasswordError(String text) throws Exception;

    public void VerifyConfPasswordError(String text) throws Exception;
}
