package com.hbcd.commonbanner.overlays;

/**
 * Created by 461967 on 8/17/2016.
 */
public interface SmartSampleOverlay {
    public void IsSmartSampleOverlay() throws Exception;

    public void SelectSample(int index) throws Exception;

    public void ClickApply() throws Exception;

    public void ValidateDisabledItemSelection() throws Exception;

    public void UnselectSample() throws Exception;
}
