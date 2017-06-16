package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.TrueFitProfileOverlay;
import com.hbcd.commonbanner.toggle.ValidationToggle;


public class TrueFitProfileOverlayBase implements TrueFitProfileOverlay {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.TrueFitProfileOverlay;

    public TrueFitProfileOverlayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public TrueFitProfileOverlayBase(boolean isVal) {
        isValidate = isVal;
    }
}
