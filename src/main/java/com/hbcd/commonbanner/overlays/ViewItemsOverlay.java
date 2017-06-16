package com.hbcd.commonbanner.overlays;

public interface ViewItemsOverlay {

    public QuickLookOverLay SelectItems() throws Exception;

    public QuickLookOverLay NoThanks() throws Exception;

    public QuickLookOverLay AddToBag() throws Exception;

    public void CloseViewItems() throws Exception;

}
