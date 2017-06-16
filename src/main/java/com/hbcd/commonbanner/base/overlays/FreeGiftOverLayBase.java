package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class FreeGiftOverLayBase {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.FreeGiftOverlay;

    public FreeGiftOverLayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public FreeGiftOverLayBase(boolean isVal) {
        isValidate = isVal;
    }
}
