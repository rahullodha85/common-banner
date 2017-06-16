package com.hbcd.commonbanner.overlays;

public interface GiftOverlay {
    public void With(String name, String message) throws Exception;

    public void With(String name, String message, String wrap) throws Exception;

    public void With(String message) throws Exception;
}
