package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.enums.CardName;

public interface GiftCardsPage {

    public void AddStandardGiftCards(CardName cardName, String amount,
                                     String cardQuantity) throws Exception;

    public void AddVirtualGiftCards(CardName cardName, String amount,
                                    String senderName, String recipientname, String recipientEmail)
            throws Exception;


    public void NavToCorporateGiftCard()// (int cardNumber, int pin)
            throws Exception;

    public void VirtualGiftCardAddToBag(String SendersName, String RecipientsName, String RecipientEmail,
                                        String ConfirmRecipientsEmail, String Message, String DateOfDelivery) throws Exception;

    public void TGCAddToBag(String GiftCardAmount, int Quantity)
            throws Exception;

    public void ClickVirtualGiftCard() throws Exception;

    public void ClickStandardGiftCard() throws Exception;

    public void NavToVirtualGiftCard() throws Exception;

    public void NavToStandartGiftCard() throws Exception;

    public void GetGiftCardBalance() throws Exception;

    public void GiftCardTerms() throws Exception;

    public void StandardGiftCardAddToBag(String amount,String qty) throws Exception;

    public void ClickAddToBag() throws Exception;
}
