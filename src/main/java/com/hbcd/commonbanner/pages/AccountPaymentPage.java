package com.hbcd.commonbanner.pages;

/**
 * Created by 461967 on 3/31/2016.
 */
public interface AccountPaymentPage {
    public void IsAccountsPaymentPage() throws Exception;

    public void PaymentNamePresent(int index) throws Exception;

    public void IsDefaultPayment(int index) throws Exception;

    public void EditButtonPresent(int index) throws Exception;

    public void DeleteButtonPresent(int index) throws Exception;

    public void ClickEdit(int index) throws Exception;
}
