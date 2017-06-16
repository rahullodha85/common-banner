package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.StoreLocatorPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class StoreLocatorPageBase implements StoreLocatorPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.StoreLocatorPage;

    public StoreLocatorPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public StoreLocatorPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public void SearchBy(String city, String state) throws Exception {
    }

    @Override
    public void SearchBy(String zip) throws Exception {

    }

    @Override
    public void StoreEvents() throws Exception {

    }

    @Override
    public void SearchForStore(String distance, String postalCode)
            throws Exception {

    }

    @Override
    public void SearchForStore() throws Exception {

    }

}
