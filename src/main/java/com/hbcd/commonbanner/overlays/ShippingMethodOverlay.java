package com.hbcd.commonbanner.overlays;

public interface ShippingMethodOverlay {

    public void SwitchTo(String method) throws Exception;

    public void UpdateShippingMethod(String shippingMethod, Boolean signReqd) throws Exception;
}
