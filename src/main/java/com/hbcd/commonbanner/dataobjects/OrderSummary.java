package com.hbcd.commonbanner.dataobjects;

import com.hbcd.scripting.core.Find;


public class OrderSummary {
    private double itemTotal;
    private double giftWrapTotal;
    private double shippingCost;
    private double beforeTax;
    private double grandTotal;

    public OrderSummary() throws NumberFormatException, Exception {
        setItemTotal();
        setGiftWrapTotal();
        setShippingTotal();
        setBeforeTaxTotal();
        setGrandTotal();
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal() throws NumberFormatException, Exception {
        this.itemTotal = toDouble("bagPojoItemTotalTxt_wk");
    }

    public double getGiftWrapTotal() {
        return giftWrapTotal;
    }

    public void setGiftWrapTotal() throws NumberFormatException, Exception {
        this.giftWrapTotal = toDouble("bagPojoGiftWrapPriceTxt_wk");
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingTotal() throws NumberFormatException, Exception {
        this.shippingCost = toDouble("bagPojoShippingTxt_wk");
    }

    public double getBeforeTaxTotal() {
        return beforeTax;
    }

    public void setBeforeTaxTotal() throws NumberFormatException, Exception {
        this.beforeTax = toDouble("bagPojoTotalBeforeTaxTxt_wk");
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal() throws NumberFormatException, Exception {
        this.grandTotal = toDouble("bagPojoGrandTotalTxt_wk");
    }

    public String toString() {
        return "Item Total: " + itemTotal +
                ",\rGift Wrap Total: " + giftWrapTotal +
                ",\rShipping Cost: " + shippingCost +
                ",\rBefore Tax: " + beforeTax +
                ",\rGrand Total: " + grandTotal;
    }

    public double toDouble(String objectName) throws NumberFormatException, Exception {
        return Double.parseDouble(Find.Object(objectName).getText().value().substring(1));
    }
}
