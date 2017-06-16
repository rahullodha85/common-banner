package com.hbcd.commonbanner.pages;

public interface ContactCenterPage {
    public void LoginWith(String username, String password) throws Exception;

    public void SearchOrder(String orderNumber) throws Exception;
}
