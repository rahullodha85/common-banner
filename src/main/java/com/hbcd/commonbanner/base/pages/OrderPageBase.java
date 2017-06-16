package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.OrderPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class OrderPageBase implements OrderPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.OrderPage;

    public OrderPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public OrderPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void ViewFullShoppingBag() throws Exception {

    }

    @Override
    public void ClickOnItem(String ItemName) throws Exception {

    }

    @Override
    public void ClickCheckOut() throws Exception {

    }
}
