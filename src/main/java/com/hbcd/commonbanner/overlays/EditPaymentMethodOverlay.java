package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 4/11/2016.
 */
public interface EditPaymentMethodOverlay {
    public void IsEditPaymentOverlay() throws Exception;

    public void IsPaymentNamePresent() throws Exception;

    public void IsCardInfoPresent() throws Exception;

    public void ClickIsDefault() throws Exception;

    public void ClickSubmit() throws Exception;

    public void ClickCancel() throws Exception;

    public void ClickX() throws Exception;
}
