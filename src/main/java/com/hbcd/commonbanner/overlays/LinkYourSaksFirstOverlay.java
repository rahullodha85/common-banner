package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 11/2/2016.
 */
public interface LinkYourSaksFirstOverlay {
    public void IsLinkYourSaksFirstOverlay() throws Exception;

    public void ClickCancel() throws Exception;

    public void ClickX() throws Exception;

    public void ClickSubmit() throws Exception;

    public void ClickSubmit(String fName, String lName, String zip, String accNum) throws Exception;

    public void IsFirstNameErrorPresent() throws Exception;

    public void IsLastNameErrorPresent() throws Exception;

    public void IsZipCodeErrorPresent() throws Exception;

    public void IsAccNumErrorPresent() throws Exception;
}
