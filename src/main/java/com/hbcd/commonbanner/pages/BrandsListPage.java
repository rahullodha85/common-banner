package com.hbcd.commonbanner.pages;

public interface BrandsListPage {

    public void SearchBrand(String brandName, String zipCode) throws Exception;

    public void DispalayBrandByProduct(String productName) throws Exception;

    public void ClickOnBrand(String brandName) throws Exception;

    public void FindBrand(String BrandName, String AddAddress,
                          String SelectLocationDistance) throws Exception;

    public void DisplayBrandsByCategory(String category) throws Exception;

    public void ClickFirstBrand() throws Exception;
}
