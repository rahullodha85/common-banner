package com.hbcd.commonbanner.overlays;

/**
 * Created by yalipova on 12/12/2016.
 */
public interface MiniBagOverlay {
    void isMiniBagOpen() throws Exception;

    void closeMiniBag() throws Exception;

    void clickOnItem() throws Exception;

    void clickCheckout() throws Exception;

    void clickMiniBag() throws Exception;

    void clickSaveForLater() throws Exception;

    void checkSaveForLater() throws Exception;

    void numberOfItems() throws Exception;

    void errorMessage() throws Exception;

    public void isMiniBagOverlay() throws Exception;
}
