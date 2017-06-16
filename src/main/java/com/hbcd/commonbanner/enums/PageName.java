package com.hbcd.commonbanner.enums;

public enum PageName {
    /* Regular Pages */
    HomePage("PAGE.HOME"),
    SignInPage("PAGE.SIGN_IN"),
    NavigationPage("PAGE.NAVIGATION"),
    ProductArrayPage("PAGE.PRODUCT_ARRAY"),
    SectionPage("PAGE.SECTION"),
    ShippingPage("PAGE.SHIPPING"),
    PaymentPage("PAGE.PAYMENT"),
    ShippingPaymentPage("PAGE.SHIPPING_PAYMENT"),
    StoreLocatorPage("PAGE.STORED_LOCATOR"),
    AccountPage("PAGE.ACCOUNT"),
    BagPage("PAGE.BAG"),
    PDPPage("PAGE.PDP"),
    ReviewSubmitPage("PAGE.REVIEW_SUBMIT"),
    NotificationPage("PAGE.NOTIFICATION"),
    GiftCardPage("PAGE.GIFT_CARD"),
    GiftRegisterPage("PAGE.GIFT_REGISTER"),
    RegistrationPage("PAGE.REGISTRATION"),
    OrderPage("PAGE.ORDER"),
    ReviewOrderPage("PAGE.REVIEW_ORDER"),
    WishListPage("PAGE.WISH_LIST"),
    AddressBookPage("PAGE.ADDRESS_BOOK"),
    BrandListPage("PAGE.BRAND_LIST"),


    /* OverLay Pages */
    FreeGiftOverlay("OVERLAY.FREE_GIFT"),
    LoginOverlay("OVERLAY.LOGIN"),
    QuickLookOverlay("OVERLAY.QUICK_LOOK"),
    QuickViewOverlay("OVERLAY.QUICK_VIEW"),
    SignInOverlay("OVERLAY.SIGN_IN"),
    TrueFitProfileOverlay("OVERLAY.TRUE_FIT_PROFILE"),
    MiniCartOverlay("OVERLAY.MINI_CART"),
    ViewItemsOverlay("OVERLAY.VIEW_ITEMS");


    PageName(final String v) {
        this.value = v;
    }

    public String getvalue() {
//		if (this.toString().contains("Page"))
//		{
//			
//		}
        return value;
    }

    private String value;
}
