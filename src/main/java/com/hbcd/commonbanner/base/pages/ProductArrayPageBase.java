package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.drawer.DrawerRefine;
import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.enums.RefineOptions;
import com.hbcd.commonbanner.enums.SortOptions;
import com.hbcd.commonbanner.overlays.QuickLookOverLay;
import com.hbcd.commonbanner.pages.ProductArrayPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.BrowserAction;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.core.Report;

public class ProductArrayPageBase implements ProductArrayPage {

    protected boolean isValidate = true;
    protected PageName pageName = PageName.ProductArrayPage;

    public ProductArrayPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public ProductArrayPageBase(boolean isVal) {
        isValidate = isVal;
    }

    public String GetFirstItemName() throws Exception{
        return null;
    }
    @Override
    public void ClickAerosoles() throws Exception {

    }

    public DrawerRefine ClickRefineDrpDwn() throws Exception {
        return null;
    }


    public QuickLookOverLay ClickQuickView(String upc) throws Exception {
        return null;
    }

    @Override
    public void clickItem(int index) throws Exception {
        
    }


    public void AddClearanceItem() throws Exception {

    }

    public void SelectSortBy(String sortMethod) throws Exception {

    }

    public void RefineByType(String type) throws Exception {

    }

    public void RefineByStyle(String style) throws Exception {

    }

    public void RefineByDesigner(String designer) throws Exception {

    }

    public void RefineBySize(String size) throws Exception {

    }

    public void RefineByColor(String color) throws Exception {

    }

    public void RefineByPrice(String price) throws Exception {

    }

    public void RefineByLifeStyle(String lifeStyle) throws Exception {

    }

    public void ClickPagination() throws Exception {

    }

    public void ClickNavigation(int page) throws Exception {

    }

    public void RemoveFilter(String filterName) throws Exception {

    }

    public void RemoveAllFilters() throws Exception {

    }


    public void Refines() throws Exception {

    }


    public void Sorts(String sortBy) throws Exception {

    }

    public void ClickBreadcrum(String breadcrumName) throws Exception {

    }

    public void hoverFirstItem() throws Exception {

    }

    public void SortBy(SortOptions option) throws Exception {

    }

    public void clickFirstItem() throws Exception {
            if(Find.Object("prpSelectFirstItem_AAF").isPresent()) {
                Report.pass("First item displayed and clicked", BrowserAction.screenshot());
                Find.Object("prpSelectFirstItem_AAF").click();
                Thread.sleep(3000);
            }else{
                Report.fail("Product array page is empty", BrowserAction.screenshot());
            }
        }

    public void ClickFirstQuickLook() throws Exception {

    }

    public void CloseQuickLook() throws Exception {

    }

    public void RefineByBrand(String[] brandList) throws Exception {

    }

    public void MoveNextPage() throws Exception {

    }

    public void MovePreivousPage() throws Exception {


    }


    public void SelectPage(int page) throws Exception {


    }


    public void HoverOnItem(String id) throws Exception {


    }


    public void SelectItem(String Id) throws Exception {


    }


    public void ShopByBrand(String brandName) throws Exception {


    }


    public void ShopByCategory(String itemList) throws Exception {


    }


    public void ClickClearance() throws Exception {


    }


    public void ClickSale() throws Exception {


    }


    public void ClickGiftCards() throws Exception {


    }


    public void clickVegc() throws Exception {


    }


    public void RemoveFilter(RefineOptions options, String filterName)
            throws Exception {


    }


    public void SelectFirstItem() throws Exception {


    }


    public void ClickQLIconOnImage() throws Exception {


    }

    public void RefineBy(String refineType, String refineBy) throws Exception {


    }

    public void RefineBy(RefineOptions refOptions, String refineValue)
            throws Exception {


    }


    public void ClickShopAll() throws Exception {


    }


    public void ClickPromoSlider() throws Exception {


    }

    public void ClickLogo() throws Exception {


    }


    public void FilterByDesigner(String option) throws Exception {

    }


    public void ClickFirstItem() throws Exception {

    }


    public void ClickContemporaryShop(String type) throws Exception {

    }


    public void ClickLeftNav(String option) throws Exception {


    }
    @Override
    public void ClickFirstCategoryInCoachProductArray() throws Exception{}

    @Override
    public void RefineBy(String refineType) throws Exception{}

    public void ShopByBrand(int index) throws Exception{}

    @Override
    public void ClickFirstFromTrendsEvents() throws Exception {}
}
