package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.drawer.DrawerRefine;
import com.hbcd.commonbanner.enums.RefineOptions;
import com.hbcd.commonbanner.enums.SortOptions;
import com.hbcd.commonbanner.overlays.QuickLookOverLay;

public interface ProductArrayPage {

    void ClickAerosoles() throws Exception;
    DrawerRefine ClickRefineDrpDwn() throws Exception;

    QuickLookOverLay ClickQuickView(String upc) throws Exception;
    void clickItem(int index) throws Exception;
    void AddClearanceItem() throws Exception;

    void SelectSortBy(String sortMethod) throws Exception;

    void RefineByType(String type) throws Exception;

    void RefineByStyle(String style) throws Exception;

    void RefineByDesigner(String designer) throws Exception;

    void RefineBySize(String size) throws Exception;

    void RefineByColor(String color) throws Exception;

    void RefineByPrice(String price) throws Exception;

    void ClickQLIconOnImage() throws Exception;

    void RefineByLifeStyle(String lifeStyle) throws Exception;

    void ClickPagination() throws Exception;

    void ClickNavigation(int page) throws Exception;

    void RemoveFilter(String filterName) throws Exception;

    void RemoveAllFilters() throws Exception;

    void Refines() throws Exception;

    void Sorts(String sortBy) throws Exception;

    void ClickBreadcrum(String breadcrumName) throws Exception;

    void hoverFirstItem() throws Exception;

    void SortBy(SortOptions option) throws Exception;

    void clickFirstItem() throws Exception;

    void ClickFirstQuickLook() throws Exception;

    void CloseQuickLook() throws Exception;

    void RefineBy(String string, String refineValue) throws Exception;

    void RefineByBrand(String[] brandList) throws Exception;

    void MoveNextPage() throws Exception;

    void MovePreivousPage() throws Exception;

    void SelectPage(int page) throws Exception;

    void HoverOnItem(String id) throws Exception;

    void SelectItem(String Id) throws Exception;

    void ShopByBrand(String brandName) throws Exception;

    void ShopByCategory(String itemList) throws Exception;

    void ClickClearance() throws Exception;

    void ClickSale() throws Exception;

    void ClickGiftCards() throws Exception;

    void clickVegc() throws Exception;

    void RemoveFilter(RefineOptions options, String filterName)
            throws Exception;

    void SelectFirstItem() throws Exception;

    void ClickShopAll() throws Exception;

    void ClickPromoSlider() throws Exception;

    void ClickLogo() throws Exception;

    void FilterByDesigner(String option) throws Exception;

    void ClickFirstItem() throws Exception;
    void ClickContemporaryShop(String type) throws Exception;
    void ClickLeftNav(String option) throws Exception;
    public void ClickFirstCategoryInCoachProductArray() throws Exception;
    public String GetFirstItemName() throws Exception;
    public void RefineBy(String refineType) throws Exception;
    public void ShopByBrand(int index) throws Exception;
    public void ClickFirstFromTrendsEvents() throws Exception;
}
