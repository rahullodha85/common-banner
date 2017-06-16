package com.hbcd.commonbanner.overlays;

public interface MiniCartOverlay {

    public void MiniCartCheckOut() throws Exception;

    public void MiniCartClose() throws Exception;

    public void ClickOnViewFullShoppingBag() throws Exception;

    public void ViewProductInformation() throws Exception;

    public void ValidateEmptyMiniCartText() throws Exception;

    public void GoToShoppingBagFromMiniCartWithLink() throws Exception;

    public void ClickAwayToMakeMiniBagDisappear() throws Exception;

    public void ClickAway() throws Exception;

}