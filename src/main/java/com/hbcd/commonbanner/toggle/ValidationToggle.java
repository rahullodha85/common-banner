package com.hbcd.commonbanner.toggle;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.utility.common.SystemToggleType;
import com.hbcd.utility.configurationsetting.ApplicationToggleLoad;

public class ValidationToggle {

    public static boolean get() {
        return true;
    }

    public static boolean get(PageName pageName) {
        try {
            return ApplicationToggleLoad.getModuleToggle(SystemToggleType.Validation.getvalue(), pageName.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
