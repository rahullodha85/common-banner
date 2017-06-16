package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 4/5/2016.
 */
public interface AccountShippingAddressPage {
    public void IsShippingAddrPage() throws Exception;

    public void ClickEdit(int index) throws Exception;

    public void IsDefaultAddr(int index) throws Exception;
}
