package com.hbcd.commonbanner.overlays;

public interface QuickViewFromBagOverlay {
    public void GoToPIPFromQVFB() throws Exception;

    public void CloseQVFB() throws Exception;

    public void ChangeSize(String size) throws Exception;

    public void ClickApply() throws Exception;

    public void ChangeQuantity(int quantity) throws Exception;

    public void ChangeColor(String color) throws Exception;
}
