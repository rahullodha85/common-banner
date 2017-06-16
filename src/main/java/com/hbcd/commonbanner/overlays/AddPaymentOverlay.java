package com.hbcd.commonbanner.overlays;

public interface AddPaymentOverlay {
    public void With(int cardType, String name, String cardNumber) throws Exception;

    public void With(String nickname, int cardType, String name, String cardNumber) throws Exception;

}
