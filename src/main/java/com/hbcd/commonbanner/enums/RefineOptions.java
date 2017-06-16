package com.hbcd.commonbanner.enums;

public enum RefineOptions {
    BRAND("filter_mfName_ntk_cs"),
    COLOR("filter_xf_ads_f9_ntk_cs"),
    SIZE("filter_ads_f7_ntk_cs"),
    MATERIAL("filter_ads_f9_ntk_cs"),
    STYLING("filter_xf_ads_f17_ntk_cs"),
    FEATURE("filter_xf_ads_f18_ntk_cs"),
    WASH("filter_xf_ads_f32_ntk_cs");

    private String elementName;

    private RefineOptions(String elementName) {
        this.elementName = elementName;
    }

    public String getName() {
        return elementName;
    }
}
