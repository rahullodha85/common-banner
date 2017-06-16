package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.overlays.*;

public interface BagPage {
    public void ApplyPromo(String promo) throws Exception;

    public void ApplyPromoExpectFail(String promo) throws Exception;

    public LoginOverlay ClickCheckout() throws Exception;

    public GiftOverlay MakeGift(String itemId) throws Exception;

    public QuickLookOverLay ClickEditFor(String upc) throws Exception;

    public double getSalesPrice() throws Exception;

    public void CheckOut() throws Exception;

    public void UpdateQuantity(String itemId, String quantity) throws Exception;

    public void UpdateQuantity(String quantity) throws Exception;

    public void Remove(String upc) throws Exception;

    public void Remove() throws Exception;

    public void selectShippingMethod(String shipmethod) throws Exception;

    public void MoveToBag(String upc) throws Exception;

    public void ClickSaveForLater(String upc) throws Exception;

    public void ClickCheckoutMobile() throws Exception;

    public void ClickPaypal() throws Exception;

    public void EnterZipCode(String zipCode) throws Exception;

    public void ClickCheckoutInternational() throws Exception;

    public void saveItem(String skuid) throws Exception;

    public void AddToWishList() throws Exception;

    public double GetEstimatedOrderTotal(String estimtOrdObj) throws Exception;

    void ApplyEstShippingCharge(String zipCode, String shippingMethod) throws Exception;

    public double GetEstimatedShippingAmount() throws Exception;

    public double GetEstimatedOrderTax() throws Exception;

    public QuickViewFromBagOverlay EditOptions(String editOptionsObjectName) throws Exception;

    public void ShoprunnerSignIn() throws Exception;

    public void ShoprunnerLearnMore() throws Exception;

    public FreeGiftOverLay ClickOnViewItems() throws Exception;

    public void ClickOnItemName(String itemName) throws Exception;

    public String GetItemTotalPrice(String itemName) throws Exception;

    public String GetItemTotalPrice() throws Exception;

    public String GetItemDiscount() throws Exception;

    public String GetItemDiscount(String itemName) throws Exception;

    public String GetItemPrice() throws Exception;

    public void AddItemToWishList(String itemName) throws Exception;

    public void Remove2() throws Exception;

    public void UpdateSizeColor(String size, String color) throws Exception;

    public LoginOverlay LoginOverlay() throws Exception;

    public void SelectGiftOptions() throws Exception;

    public void ClickSaveGiftMessage() throws Exception;

    public void EnterGiftMessage(String string) throws Exception;

    public void ClickEditGiftMessage() throws Exception;

    public void UnSelectGiftOptions() throws Exception;

    public QuickViewFromBagOverlay ClickEditOptions(String productName) throws Exception;
    public void editGifts() throws Exception;

    public void removeGift() throws Exception;

    public void ClickBagShopRunnerSignIn() throws Exception;

    public void clickShoprunnerExpressCheckOut() throws Exception;
    public void UpdateQuantity(String productName, int qty) throws Exception;

    public void ClickProductImage(String productName) throws Exception;

    public void ClickProductName(String productName) throws Exception;
    public void ClickGuestCheckout() throws Exception;
    public void RemoveCancel(String item) throws Exception;
    public void SelectBagItemQuantity(String upc, int quanity) throws Exception;
    public void ClickForgetPasswordBagMobile() throws Exception;
    public SmartSampleOverlay ClickSmartSample() throws Exception;

    /** entering checkout as logged in user and assuring that login overlay isn't displayed*/
    public void stickyCheckout() throws Exception;
}
