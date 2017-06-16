package com.hbcd.commonbanner.enums;

import com.hbcd.utility.common.ApplicationSetup;
import com.hbcd.utility.common.Setting;
import com.hbcd.utility.configurationsetting.ConfigurationLoader;
import com.hbcd.utility.configurationsetting.ConfigurationLoader;

public enum ToggleType {
    PDP("PDP_TOGGLE", "com.hbcd.banner.s5a.pages.aemPdp.AemProductDetailPage", "com.hbcd.banner.s5a.pages.s5a_ProductDetailPage"),
    CHECKOUT_BAG("CHECKOUT_ENHANCEMENT_BAG", "com.hbcd.banner.s5a.pages.redesign.BagPage", "com.hbcd.banner.s5a.pages.s5a_BagPage"),
    CHECKOUT_SHIPPINGBILLING("CHECKOUT_ENHANCEMENT_SHIPPINGBILLING", "com.hbcd.banner.s5a.pages.redesign.ShippingPage", "com.hbcd.banner.s5a.pages.s5a_ShippingPage"),
    CHECKOUT_PAYMENT("CHECKOUT_ENHANCEMENT_PAYMENT", "com.hbcd.banner.s5a.pages.redesign.PaymentPage", "com.hbcd.banner.s5a.pages.s5a_PaymentPage"),
    CHECKOUT_CONFIRMATION("CHECKOUT_ENHANCEMENT_CONFIRMATION", "com.hbcd.banner.s5a.pages.redesign.ConfirmationPage", "com.hbcd.banner.s5a.pages.s5a_ConfirmationPage"),
    CHECKOUT_MOBILE_LOGIN("CHECKOUT_ENHANCEMENT_MOBILE_LOGIN", "com.hbcd.banner.mobile.s5a.pages.redesign.mRedesignLogin", "com.hbcd.banner.mobile.saks.pages.mLogin"),
    CHECKOUT_MOBILE_SHIPPINGBILLING("CHECKOUT_ENHANCEMENT_MOBILE_SHIPPINGBILLING", "com.hbcd.banner.mobile.s5a.pages.redesign.mRedesignShippingPage", "com.hbcd.banner.mobile.saks.pages.mShippingPage"),
    CHECKOUT_MOBILE_CONFIRMATION("CHECKOUT_ENHANCEMENT_MOBILE_CONFIRMATION", "com.hbcd.banner.mobile.s5a.pages.redesign.mRedesignConfirmationPage", "com.hbcd.banner.mobile.saks.pages.mConfirmationPage"),
    CHECKOUT_MOBILE_PDP("CHECKOUT_MOBILE_PDP", "com.hbcd.banner.mobile.s5a.pages.redesign.ProductDetailPage", "com.hbcd.banner.mobile.saks.pages.mProductDetailPage"),
    CHECKOUT_MOBILE_BAG("CHECKOUT_MOBILE_BAG", "com.hbcd.banner.mobile.s5a.pages.redesign.mRedesignBagPage", "com.hbcd.banner.mobile.saks.pages.mBagPage"),
    PRODUCT_ARRAY("PRODUCT_ARRAY", "com.hbcd.banner.s5a.pages.redesign.ProductArray", "com.hbcd.banner.s5a.pages.s5a_ProductArray"),
    CHECKOUT_REVIEWSUBMIT("CHECKOUT_ENHANCEMENT_REVIEWSUBMIT", "com.hbcd.banner.s5a.pages.redesign.ReviewSubmit", "com.hbcd.banner.s5a.pages.s5a_ReviewSubmitPage"),
    PDP_SHOPRUNNER("PDP_SHOPRUNNER_TOGGLE","com.hbcd.banner.s5a.pages.redesign.ProductDetailPage_ShopRunner", "com.hbcd.banner.s5a.pages.redesign.ProductDetailPage"),;

    private String status = "New";
    private String type;
    private String newPageClass;
    private String oldPageClass;


    private ToggleType(String type, String newPageClass, String oldPageClass) {
        try {
            this.type = type;
            this.status = ConfigurationLoader.getValue(ApplicationSetup.get(Setting.SITE) + "." + type);
            this.newPageClass = newPageClass;
            this.oldPageClass = oldPageClass;
        } catch (Exception e) {
            System.out.println("ToggleType: configuration not loaded properly");
            e.printStackTrace();
        }
    }

    public String getPageClass() {
        if (status.equalsIgnoreCase("new"))
            return newPageClass;
        else return oldPageClass;
    }

    public String toString() {
        return type;
    }
}
