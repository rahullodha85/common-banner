package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.QuickViewFromBagOverlay;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class QuickViewFromBagOverlayBase implements QuickViewFromBagOverlay {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.QuickViewOverlay;

    public QuickViewFromBagOverlayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public QuickViewFromBagOverlayBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public void GoToPIPFromQVFB() throws Exception {

    }

    public void CloseQVFB() throws Exception {

    }

    public void ChangeSize(String size) throws Exception {

    }

    @Override
    public void ClickApply() throws Exception {

    }

    @Override
    public void ChangeQuantity(int quantity) throws Exception {

    }

    @Override
    public void ChangeColor(String color) throws Exception {

    }

}
