package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 3/7/2016.
 */
public interface AccountSummaryPage {
    public void ClickStartShopping() throws Exception;

    public void ClickExpandCollapse(int index) throws Exception;

    public void ClickViewAllOrders() throws Exception;

    public void ClickAccountSettings() throws Exception;

    public void ClickEditProfile() throws Exception;

    public void ClickAccountNav(String text) throws Exception;

    public void IsSummaryPage() throws Exception;

    public void IsYourRewardsPresent() throws Exception;

    public void IsMoreNumberPresent(String val) throws Exception;

    public void IsFirstOrderPresent() throws Exception;

    public void OrderRowPresent(int index) throws Exception;

    public void OrderHasOrderDate(int index) throws Exception;

    public void OrderHasOrderNumber(int index) throws Exception;

    public void OrderHasOrderItemCount(int index) throws Exception;

    public void OrderHasOrderTotal(int index) throws Exception;

    public void OrderHasOrderStatus(int index) throws Exception;

    public void HasMoreThanOneOrder() throws Exception;

    public void OrderDetailHasShippingSection(int index) throws Exception;

    public void OrderDetailHasPaymentMethod(int index) throws Exception;

    public void OrderDetailHasBillingAddress(int index) throws Exception;

    public void OrderDetailHasSummary(int index) throws Exception;

    public void OrderDetailHasShippingMethod(int index) throws Exception;

    public void OrderDetailHasShippingAddress(int index) throws Exception;

    public void IsFullNamePresent() throws Exception;

    public void IsEmailPresent() throws Exception;

    public void IsEmptyOrderHistory() throws Exception;

    public void IsStartShoppingLinkPresent() throws Exception;

    public void IsViewAllOrdersPresent() throws Exception;

    public void OrderDetailHasItemContent(int index) throws Exception;

    public void OrderDetailHasItemImage(int index) throws Exception;

    public void OrderDetailHasStatus(int index) throws Exception;

    public void OrderdetailHasCustomerServiceCopy(int index) throws Exception;

    public void IsSaksFirstSectionPresent(String text) throws Exception;

    public void IsLinkYourSaksFirstPresent() throws Exception;

    public void IsLinkYourSaksFirstPresent(String text) throws Exception;

    public void IsPrgmDetailLinkPresent() throws Exception;

    public void ClickPrgmDetailLink() throws Exception;

    public void ClickLinkYourSaksFirst() throws Exception;
}
