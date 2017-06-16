package com.hbcd.commonbanner.pages;

public interface ShippingPaymentPage extends ShippingPage, PaymentPage {

    public void GetSubTotal() throws Exception;

    public void ComparePrice() throws Exception;

    public void EnterShippingAddressBorderFree(String firstName,
                                               String lastName, String streetaddress, String streetaddress2,
                                               String streetaddress3, String city, String region,
                                               String postalCode, String country, String phonenumber1,
                                               String phonenumber2, String emailId, String cardNumber,
                                               String expMonth, String expYear, String secCode) throws Exception;

    public void ValidateShpFrmStoreMsg() throws Exception;


    public void ValidateShpMethodSelected(String string) throws Exception;

    void MakeGift(String option) throws Exception;
    public void SelectCreditCardType(String CardType) throws Exception;

    public void ResetCreditCardType() throws Exception;
}
