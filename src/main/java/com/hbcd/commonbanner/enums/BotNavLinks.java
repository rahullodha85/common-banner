package com.hbcd.commonbanner.enums;

import com.hbcd.scripting.enums.Links;

public enum BotNavLinks implements Links {
    //	EDITION("EDITION"),
//	TRENDCASTER("The Trendcaster"),
//	FALLFASHIONDESIGNERSERIES("Fall Fashion: A Designer Series"),
//	COLLECITONCONTEMPORARYSERIES("Collection: A Contemporary Series"),
    CATALOGS("Catalogs", "navCatalogValidation"),
    GIFTCARDS("Gift Cards", "navGiftCardValidation"),
    STORELOCATIONSEVENTS("Store Locations &amp; Events", "storeLocationsValidation"),
    //	BRIDALTRUNKSHOWS("Bridal Trunk Shows"),
//	ABOUTUS("About Us"),
//	CAREER("Careers"),
//	POLICIES("Policies"),
    DOMESTIC("Domestic", "domesticValidation"),
    INTERNATIONAL("International", "internationalValidation"),

    ORDERSTATUSTRACKING("OrderPage Status", "loginValidation"),
    SAKSFIRST("SaksFirst", "sfLeftNavValidation"),
    PAYBILLSMANAGE("Pay Bills &amp; Manage", "sfLeftNavValidation"),

    //	APPLY("Apply"),
//	UPGRADESAKSMASTER("Upgrade to the Saks MasterCard"),
    CUSTOMERSERVICE("Customer Service", "csValidation"),
    MYPROFILE("My Profile", "bottomNavLinks_RL");

    private final String link;
    private final String objectToValidate;

    private BotNavLinks(String s, String objectName) {
        this.link = s;
        this.objectToValidate = objectName;
    }

    public boolean equalsName(String otherLink) {
        return (otherLink == null) ? false : link.equals(otherLink);
    }

    public String toString() {
        return link;
    }

    public String getObjectName() {
        return objectToValidate;
    }
}
