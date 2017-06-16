package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 3/23/2016.
 */
public interface EditProfileOverlay {
    public void EditProfile(String fName, String lName, String email) throws Exception;

    public void ClickCancel() throws Exception;

    public void ClickX() throws Exception;

    public void IsEditProfile(String text) throws Exception;
}
