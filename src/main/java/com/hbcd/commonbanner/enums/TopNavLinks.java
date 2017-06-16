package com.hbcd.commonbanner.enums;

import com.hbcd.scripting.enums.Links;

public enum TopNavLinks implements Links {
    DESIGNERS("Designers", "navDesignerDrawerValidation"),
    WOMENSAPPAREL("Women", "navWomAppDrawerValidation"),
    SHOES("Shoes", "navShoesDrawerValidation"),
    HANDBAGS("Handbags", "navHandbagDrawerValidation"),
    JEWELRYACCESSORIES("Jewel", "navJewelryDrawerValidation"),
    BEAUTY("Beauty", "navBeautyDrawerValidation"),
    MEN("Men", "navMensDrawerValidation"),
    MENS("Men's", "navMensDrawerValidation"),
    KIDS("Kids", "navKidsDrawerValidation"),
    HOME("Home", "navHomedrawerValidation"),
    SALE("Sale", "navSaleDrawerValidation"),
    BRANDS("Brands", "navBrnadDrawerValidation"),
    MARQUES("Marques","navBrnadDrawerValidation"),                      //top nav Brands for labaie site
    HOMEANDTRAVEL("Home &amp; Travel", "navHomeAndTraveldrawerValidation"),
    WOMENSCLOTHING("Women's Clothing", "navWomensClothing_WS"),
    WOMENS("Women's", "navWomensClothing_WS"),
    HOMME("Homme","navMensDrawerValidation"),                           //top nav Men's drawer for labaie site
    SOLDES("SOLDES", "navSaleDrawerValidation"),                        //top nav Sale drawer for french/labaie site
    FEMME("Femme", "navWomensClothing_WS"),                             //top nav women's clothing for french/labaie site
    CHAUSSURES("Chaussures", "navShoes_WS");                            //top nav shoes for french/labaie site


    private final String link;
    private final String objectName;

    private TopNavLinks(String s, String objectName) {
        link = s;
        this.objectName = objectName;
    }

    public boolean equalsName(String otherLink) {
        return (otherLink == null) ? false : link.equals(otherLink);
    }

    public String toString() {
        return link;
    }

    public String getObjectToValidate() {
        return this.objectName;
    }
}
