package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.AddToWaitListOverLay;
import com.hbcd.commonbanner.overlays.TrueFitProfileOverlay;
import com.hbcd.commonbanner.pages.Page;
import com.hbcd.commonbanner.pages.PdpPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.core.Switch;

public class PDPPageBase implements PdpPage, Page {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.PDPPage;

    public PDPPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public PDPPageBase(boolean isVal) {
        isValidate = isVal;
    }


    @Override
    public void AddToBag(int quantity) throws Exception {

    }
    public void ClickSizeGuide() throws Exception{

    }
    @Override
    public void AddToBag() throws Exception {

    }

    @Override
    public void AddToBag(int quantity, int colorSwatchIndex, int sizeSwatchIndex) throws Exception {

    }


    @Override
    public void AddToBag(String option, int quantity) throws Exception {

    }

    @Override
    public void AddToBag(String optionSize, int quantity, int optionColor)
            throws Exception {

    }

    @Override
    public void AddToBag(String dropdownOption, String swatchOption,
                         int quantity) throws Exception {

    }

    @Override
    public void AddToBag(String dropdownOption) throws Exception {

    }

    @Override
    public void EnterBag() throws Exception {

    }

    @Override
    public void PersonalizeAddToBag(int option, String text) throws Exception {

    }

    @Override
    public void PersonalizeAddToBag(int option, int quantity) throws Exception {

    }

    @Override
    public AddToWaitListOverLay clickAddToWaitList() throws Exception {
        return null;
    }

    @Override
    public String GetProductCode() throws Exception {
        return null;
    }

    @Override
    public void PersonalizeAddToBag(int quantity) throws Exception {

    }

    @Override
    public void AddToBag(String optionSize, int quantity, String optionColor)
            throws Exception {

    }

    @Override
    public void ClickInStore() throws Exception {

    }

    @Override
    public void ClickShippingAccordian() throws Exception {

    }

    @Override
    public void ClickShippingAndReturns() throws Exception {

    }

    @Override
    public void UpdateSTLQuantity(int qty) throws Exception {

    }

    @Override
    public void EnterQuantity(int qty) throws Exception {

    }

    @Override
    public void ClickSeeAllQnA() throws Exception {

    }

    @Override
    public void CloseAccordian() throws Exception {

    }

    @Override
    public void ClickShippingRestrictionLink() throws Exception {

    }

    @Override
    public void ClickShippingTimeLine() throws Exception {

    }

    @Override
    public void SelectItemFromRecentlyViewed(String string) throws Exception {

    }

    @Override
    public void ClickDetails() throws Exception {

    }

    @Override
    public void ClickDetails(String DetailLinkTxt) throws Exception {

    }

    @Override
    public void ClickAddToBagForVegc() throws Exception {

    }

    @Override
    public void ClickColorSwatch(String colorName) throws Exception {

    }

    @Override
    public void ClickAskAQuestionLink() throws Exception {

    }

    @Override
    public void ClickSizeSwatch(String string) throws Exception {

    }

    @Override
    public void ClickChatOnline() throws Exception {

    }

    @Override
    public void WriteReview(String reviewheadline, String comment,
                            String nickname, String yourlocation) throws Exception {

    }

    @Override
    public void ShowMore() throws Exception {

    }

    @Override
    public void CustomerCareOrNeedHelp(String CustomerCareOrNeedHelpTxt)
            throws Exception {

    }

    @Override
    public TrueFitProfileOverlay TrueFitSuggestion() throws Exception {
        return null;
    }

    @Override
    public String GetStockStatus() throws Exception {
        return null;
    }

    @Override
    public void AddToWishList() throws Exception {

    }

    @Override
    public void AddToBagFromWishList() throws Exception {

    }

    @Override
    public String GetItemID() throws Exception {
        return null;
    }

    @Override
    public void HoverOnScreenImage() throws Exception {

    }

    @Override
    public void ShippingInfo(String ProductShippingInfoTxt) throws Exception {

    }

    @Override
    public void SelectScreenImage(int imageNumber) throws Exception {

    }

    @Override
    public void SelectSize(String size) throws Exception {

    }

    @Override
    public void SelectColor(String color) throws Exception {

    }

    @Override
    public void SizingInfo() throws Exception {

    }

    @Override
    public void Hide() throws Exception {

    }

    @Override
    public void selectSizeSwatch(String size) throws Exception {

    }

    @Override
    public String GetPrice() throws Exception {
        return null;
    }

    @Override
    public String GetSalePrice() throws Exception {
        return null;
    }

    @Override
    public void EditReview(String reviewheadline, int ratings, String comment,
                           String nickname, String yourlocation) throws Exception {

    }

    @Override
    public void ReadReview() throws Exception {

    }

    @Override
    public void SubmitReview() throws Exception {

    }

    public void CheckBrandInTitle() throws Exception {

    }

    @Override
    public void ClickFBButton() throws Exception {

        Switch.toFrame(4);
        Find.Object("pdpFBLink_WS").click();
        Switch.toDefaultContent();
    }

    @Override
    public void ClickTwitterButton() throws Exception {
        Switch.toFrame("twitter-widget-0");
        Find.Object("pdpTwitterLink_WS").click();
        Switch.toDefaultContent();
    }

    @Override
    public void ClickGPlusButton() throws Exception {
        Switch.toFrame("I0_1439843137195");
        Find.Object("pdpGPlusLink_WS").click();
        Switch.toDefaultContent();
    }

    @Override
    public void ClickShopRunnerSignin() throws Exception {
        Find.Object("shopRunnerSignin_AAF").click();
    }

    @Override
    public void ClickShoprunnerSignoutFromPdp() throws Exception {

    }

    @Override
    public void ClickShoprunnerLearnMore() throws Exception {

    }

    @Override
    public void AddToWaitList(String email) throws Exception{

    }
    @Override
    public void ClickReviews() throws Exception{

    }

    @Override
    public void ContinueShipping() throws Exception {

    }

    @Override
    public void JoinWaitListEmail(String email, String mobilePhoneNumber) throws Exception{

    }

    @Override
    public void ClickQtyIncrement() throws Exception {

    }

    @Override
    public void ClickRecentlyViewed() throws Exception {

    }

    @Override
    public void ClickEmailIcon() throws Exception {

    }

    @Override
    public void ValidatePDPPresent() throws Exception {

    }

}
