package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.CardName;
import com.hbcd.commonbanner.pages.GiftCardsPage;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by 461967 on 5/20/2016.
 */
public class GiftCardsPageBase implements GiftCardsPage {

    @Override
    public void AddStandardGiftCards(CardName cardName, java.lang.String amount, java.lang.String cardQuantity) throws Exception {

    }

    @Override
    public void AddVirtualGiftCards(CardName cardName, java.lang.String amount, java.lang.String senderName, java.lang.String recipientname, java.lang.String recipientEmail) throws Exception {

    }

    @Override
    public void NavToCorporateGiftCard() throws Exception {

    }

    @Override
    public void VirtualGiftCardAddToBag(java.lang.String SendersName, java.lang.String RecipientsName, java.lang.String RecipientEmail, java.lang.String ConfirmRecipientsEmail, java.lang.String Message, java.lang.String DateOfDelivery) throws Exception {

    }

    @Override
    public void TGCAddToBag(java.lang.String GiftCardAmount, int Quantity) throws Exception {

    }

    @Override
    public void ClickVirtualGiftCard() throws Exception {

    }

    @Override
    public void ClickStandardGiftCard() throws Exception {

    }

    @Override
    public void NavToVirtualGiftCard() throws Exception {

    }

    @Override
    public void NavToStandartGiftCard() throws Exception {

    }

    @Override
    public void GetGiftCardBalance() throws Exception {

    }

    @Override
    public void GiftCardTerms() throws Exception {

    }

    @Override
    public void StandardGiftCardAddToBag(java.lang.String amount, java.lang.String qty) throws Exception {

    }

    @Override
    public void ClickAddToBag() throws Exception {

    }
}
