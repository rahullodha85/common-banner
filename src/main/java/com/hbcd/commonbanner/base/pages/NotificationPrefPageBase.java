package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.NotificationPrefPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class NotificationPrefPageBase implements NotificationPrefPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.NotificationPage;

    public NotificationPrefPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public NotificationPrefPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void SetNotificationPref() throws Exception {

    }

}
