package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 3/24/2016.
 */
public interface OrderHistoryPage {
    public void ClickExpandCollapse(int index) throws Exception;

    public void ClickViewMoreOrders() throws Exception;

    public void ClickStartShopping() throws Exception;

    public void IsOrderHistoryPage() throws Exception;

    public void ViewMoreOrdersNotPresent() throws Exception;

    public void ViewMoreOrdersPresent() throws Exception;

    public void IsOrderExpanded(int index) throws Exception;

    public void IsOrderCollapsed(int index) throws Exception;

    public void VerifyMoreOrders() throws Exception;

    public void StartShoppingPresent() throws Exception;

    public void CheckOrderCount(int count) throws Exception;
}
