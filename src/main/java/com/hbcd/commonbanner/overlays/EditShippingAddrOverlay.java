package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 4/15/2016.
 */
public interface EditShippingAddrOverlay {
    public void IsShippingAddrOverlay() throws Exception;

    public void ClickSubmit() throws Exception;

    public void ClickCancel() throws Exception;

    public void ClickX() throws Exception;

    public void EditAddr(String country, String fName, String lName,
                         String comp, String addr1, String addr2,
                         String city, String State, String zip,
                         String phone, boolean isDefaultAddr) throws Exception;

    public void ClickIsDefault(Boolean isDefault) throws Exception;
}
