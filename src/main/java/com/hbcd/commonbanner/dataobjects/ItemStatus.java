package com.hbcd.commonbanner.dataobjects;


public class ItemStatus {
    //variables will be updated by values inside the xml retrieved from oracle db
    Indicator multipleColors;
    Indicator multipleSizes;
    boolean waitlistable;
    boolean limitedQuanity;
    boolean soldout;
    boolean shippingrestrictions;
    String skuId;

    public ItemStatus(String skuid) {
        this.skuId = skuid;
    }

    public void setMultipleColorsStatus(Indicator multipleColors) {
        this.multipleColors = multipleColors;
    }

    public void setMultipleSizeStatus(Indicator multipleSizes) {
        this.multipleSizes = multipleSizes;
    }

    public void setWaitlistableStatus(boolean waitlistable) {
        this.waitlistable = waitlistable;
    }

    public void setLimitedQuantityStatus(boolean waitlistable) {
        this.waitlistable = waitlistable;
    }

    public void setSoldOutStatus(boolean soldout) {
        this.soldout = soldout;
    }

    public void setShippingRestrictionStatus(boolean shippingrestrictions) {
        this.shippingrestrictions = shippingrestrictions;
    }

    public Indicator isMultipleColors() {

        return multipleColors;
    }

    public Indicator isMultipleSizes() {
        return multipleSizes;
    }

    public boolean isWaitListable() {
        return waitlistable;
    }

    public boolean isLimitedQuantity() {
        return limitedQuanity;
    }

    public boolean isSoldOut() {
        return soldout;
    }

    public boolean hasShippingRestrictions() {
        return shippingrestrictions;
    }

    public void setItem(String skuid) {
        this.skuId = skuid;

    }
}
