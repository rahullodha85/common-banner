package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.pages.SectionPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class SectionPageBase implements SectionPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.SectionPage;

    public SectionPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public SectionPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void ClickDresses() throws Exception {

    }

    @Override
    public void ClickDay() throws Exception {

    }

    @Override
    public void ClickJustKids() throws Exception {

    }

    @Override
    public void ClickSplendid() throws Exception {

    }

    @Override
    public void ClickFragnance() throws Exception {

    }

    @Override
    public void ClickForHer() throws Exception {

    }

    @Override
    public void ClickTops() throws Exception {

    }

    @Override
    public void ClickBlouses() throws Exception {

    }

    @Override
    public void ClickJacketsAndVests() throws Exception {

    }

    @Override
    public void ClickJackets() throws Exception {

    }

    @Override
    public void ClickBlazers() throws Exception {

    }

    @Override
    public void ClickVests() throws Exception {

    }

    @Override
    public void RefineBy(String refineType, String refineBy) throws Exception {

    }

    @Override
    public void SortByNewArrivals(String sortCriteria) throws Exception {

    }

    @Override
    public void ClickEvent(String event) throws Exception {

    }

    @Override
    public void ClickFallCollection() throws Exception {

    }

    @Override
    public void SelectShopByDesigner(String designer) throws Exception {

    }

    @Override
    public void ClickEventTitle() throws Exception {

    }

    @Override
    public void RefineByColor(String color) throws Exception {

    }

    @Override
    public void RefineBySize(String size) throws Exception {

    }

    @Override
    public void ClickWatches() throws Exception {

    }

    @Override
    public void ClickContemporary() throws Exception {

    }

    @Override
    public void ClickModern() throws Exception {

    }

    @Override
    public void ClickPremierDesigner() throws Exception {

    }

    @Override
    public void ClickSandals() throws Exception {

    }

    @Override
    public void ClickWomenShoes() throws Exception {

    }

    @Override
    public void ClickWomenHandbags() throws Exception {

    }

    @Override
    public void ClickVirtualGiftCard() throws Exception {

    }

    @Override
    public void ClickShopAll() throws Exception {

    }

    @Override
    public void ClickDesignerKids() throws Exception {

    }

    @Override
    public void ClickDesignerLink() throws Exception {

    }

}
