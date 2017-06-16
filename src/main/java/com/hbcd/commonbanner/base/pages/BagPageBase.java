package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.*;
import com.hbcd.commonbanner.pages.BagPage;
import com.hbcd.commonbanner.pages.Page;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.BrowserAction;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.core.Report;

public class BagPageBase implements BagPage, Page {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.BagPage;

    public BagPageBase() {
        isValidate = isValidate = ValidationToggle.get(pageName);
    }

    public BagPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public void ApplyPromo(String promo) throws Exception {

    }

    @Override
    public void ApplyPromoExpectFail(String promo) throws Exception {

    }

    @Override
    public LoginOverlay ClickCheckout() throws Exception {
        return null;
    }

    @Override
    public GiftOverlay MakeGift(String itemId) throws Exception {
        return null;
    }

    @Override
    public QuickLookOverLay ClickEditFor(String upc) throws Exception {
        return null;
    }
    @Override
    public double getSalesPrice() throws Exception {
        return 0;
    }

    @Override
    public void CheckOut() throws Exception {

    }

    @Override
    public void UpdateQuantity(String itemId, String quantity) throws Exception {

    }

    @Override
    public void Remove(String upc) throws Exception {

    }

    @Override
    public void selectShippingMethod(String shipmethod) throws Exception {

    }

    public void MoveToBag(String upc) throws Exception {

    }

    public void ClickSaveForLater(String upc) throws Exception {

    }

    @Override
    public void ClickCheckoutMobile() throws Exception {

    }

    @Override
    public void ClickPaypal() throws Exception {

    }

    public void EnterZipCode(String zipCode) throws Exception {

    }

    @Override
    public void ClickCheckoutInternational() throws Exception {

    }

    public void saveItem(String skuid) throws Exception {

    }

    @Override
    public void AddToWishList() throws Exception {

    }

    @Override
    public double GetEstimatedOrderTotal(String estimtOrdObj) throws Exception {
        return 0;
    }

    @Override
    public String GetItemTotalPrice() throws Exception {
        return null;
    }

    @Override
    public String GetItemDiscount() throws Exception {
        return null;
    }

    @Override
    public String GetItemPrice() throws Exception {
        return null;
    }

    @Override
    public void ApplyEstShippingCharge(String zipCode, String shippingMethod)
            throws Exception {

    }

    @Override
    public void UpdateQuantity(String quantity) throws Exception {

    }

    @Override
    public void Remove() throws Exception {

    }

    @Override
    public double GetEstimatedShippingAmount() throws Exception {
        return 0;
    }

    @Override
    public double GetEstimatedOrderTax() throws Exception {
        return 0;
    }

    @Override
    public QuickViewFromBagOverlay EditOptions(String editOptionsObjectName)
            throws Exception {
        return null;
    }

    @Override
    public void ShoprunnerSignIn() throws Exception {

    }

    @Override
    public void ShoprunnerLearnMore() throws Exception {

    }

    @Override
    public FreeGiftOverLay ClickOnViewItems() throws Exception {
        if (Find.Object("ViewItemLink_AAF").isPresentDisplayedEnabled()) {
            Find.Object("ViewItemLink_AAF").click();
            Report.pass("The view item link is displayed",
                    BrowserAction.screenshot());
        } else {
            Report.fail("The view item link not found",
                    BrowserAction.screenshot());
        }
        return null;
    }

    @Override
    public void ClickOnItemName(String itemName) throws Exception {

    }

    @Override
    public String GetItemTotalPrice(String itemName) throws Exception {
        return null;
    }

    @Override
    public String GetItemDiscount(String itemName) throws Exception {
        return null;
    }

    @Override
    public void AddItemToWishList(String itemName) throws Exception {

    }

    @Override
    public void Remove2() throws Exception {

    }

    @Override
    public void UpdateSizeColor(String size, String color) throws Exception {

    }

    @Override
    public com.hbcd.commonbanner.overlays.LoginOverlay LoginOverlay()
            throws Exception {
        return null;
    }

    @Override
    public void SelectGiftOptions() throws Exception {

    }

    @Override
    public void ClickSaveGiftMessage() throws Exception {

    }

    @Override
    public void EnterGiftMessage(String string) throws Exception {

    }

    @Override
    public void ClickEditGiftMessage() throws Exception {

    }

    @Override
    public void UnSelectGiftOptions() throws Exception {

    }

    @Override
    public QuickViewFromBagOverlay ClickEditOptions(String productName) throws Exception {
        return null;
    }

    @Override
    public void editGifts() throws Exception {

    }

    @Override
    public void removeGift() throws Exception {

    }

    @Override
    public void ClickBagShopRunnerSignIn() throws Exception {

    }

    @Override
    public void clickShoprunnerExpressCheckOut() throws Exception {

    }
    @Override
    public void UpdateQuantity(String productName, int qty) throws Exception{}

    @Override
    public void ClickProductImage(String productName) throws Exception{}

    @Override
    public void ClickProductName(String productName) throws Exception{}

    @Override
    public void ClickGuestCheckout() throws Exception {

    }

    @Override
    public void RemoveCancel(String item) throws Exception {

    }

    @Override
    public void SelectBagItemQuantity(String upc, int quantity) throws Exception {

    }

    @Override
    public void ClickForgetPasswordBagMobile() throws Exception {

    }

    @Override
    public SmartSampleOverlay ClickSmartSample() throws Exception {
        return null;
    }

    @Override
    public void stickyCheckout() throws Exception{

    }
}
