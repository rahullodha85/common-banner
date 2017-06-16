package com.hbcd.commonbanner.overlays;

public interface FreeGiftOverLay {
    public void CloseOverlay() throws Exception;
    public void ClickNoThanks() throws Exception;
    public void ClickAddToBag() throws Exception;
    public void SelectGift(Integer giftNumber) throws Exception;
}
