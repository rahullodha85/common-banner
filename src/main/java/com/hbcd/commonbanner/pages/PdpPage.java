package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.overlays.AddToWaitListOverLay;
import com.hbcd.commonbanner.overlays.TrueFitProfileOverlay;

public interface PdpPage {
    public void AddToBag(int quantity) throws Exception;

    public void AddToBag() throws Exception;

    void AddToBag(int quantity, int colorSwatchIndex, int sizeSwatchIndex) throws Exception;

    public void ClickSizeGuide() throws Exception;

    public void AddToBag(String option, int quantity) throws Exception;

    public void AddToBag(String optionSize, int quantity, int optionColor) throws Exception;

    public void AddToBag(String dropdownOption, String swatchOption, int quantity) throws Exception;

    public void AddToBag(String dropdownOption) throws Exception;

    public void EnterBag() throws Exception;

    public void PersonalizeAddToBag(int option, String text) throws Exception;

    public void PersonalizeAddToBag(int option, int quantity) throws Exception;

    public AddToWaitListOverLay clickAddToWaitList() throws Exception;

    public String GetProductCode() throws Exception;

    public String GetPrice() throws Exception;

    public String GetSalePrice() throws Exception;

    public void PersonalizeAddToBag(int quantity) throws Exception;

    public void AddToBag(String optionSize, int quantity, String optionColor) throws Exception;

    public void ClickInStore() throws Exception;

    public void ClickShippingAccordian() throws Exception;

    public void ClickShippingAndReturns() throws Exception;

    public void UpdateSTLQuantity(int qty) throws Exception;

    public void EnterQuantity(int qty) throws Exception;

    public void ClickSeeAllQnA() throws Exception;

    public void CloseAccordian() throws Exception;

    public void ClickShippingRestrictionLink() throws Exception;

    public void ClickShippingTimeLine() throws Exception;

    public void SelectItemFromRecentlyViewed(String string) throws Exception;

    public void ClickDetails() throws Exception;

    public void ClickDetails(String DetailLinkTxt) throws Exception;

    public void ClickAddToBagForVegc() throws Exception;

    public void ClickColorSwatch(String colorName) throws Exception;

    public void ClickAskAQuestionLink() throws Exception;

    public void ClickSizeSwatch(String string) throws Exception;

    public void ClickChatOnline() throws Exception;

    public void WriteReview(String reviewheadline, String comment, String nickname, String yourlocation) throws Exception;

    public void ShowMore() throws Exception;

    public void CustomerCareOrNeedHelp(String CustomerCareOrNeedHelpTxt) throws Exception;

    public TrueFitProfileOverlay TrueFitSuggestion() throws Exception;

    public String GetStockStatus() throws Exception;

    public void AddToWishList() throws Exception;

    public void AddToBagFromWishList() throws Exception;

    public String GetItemID() throws Exception;

    public void HoverOnScreenImage() throws Exception;

    public void ShippingInfo(String ProductShippingInfoTxt) throws Exception;

    public void SelectScreenImage(int imageNumber) throws Exception;

    public void SelectSize(String size) throws Exception;

    public void SelectColor(String color) throws Exception;

    public void SizingInfo() throws Exception;

    public void Hide() throws Exception;

    public void selectSizeSwatch(String size) throws Exception;

    public void EditReview(String reviewheadline, int ratings, String comment,
                           String nickname, String yourlocation) throws Exception;

    public void ReadReview() throws Exception;

    public void SubmitReview() throws Exception;

    public void CheckBrandInTitle() throws Exception;

    public void ClickFBButton() throws Exception;

    public void ClickTwitterButton() throws Exception;

    public void ClickGPlusButton() throws Exception;

    public void ClickShopRunnerSignin() throws Exception;

    public void ClickShoprunnerSignoutFromPdp() throws Exception;

    public void ClickShoprunnerLearnMore() throws Exception;

    public void AddToWaitList(String email) throws Exception;
    public void ClickReviews() throws Exception;
    public void ContinueShipping() throws Exception;
    public void JoinWaitListEmail(String email, String mobilePhoneNumber) throws Exception;

    public void ClickQtyIncrement() throws Exception;

    public  void ClickRecentlyViewed()throws Exception;

    public void ClickEmailIcon() throws Exception;

    public void ValidatePDPPresent() throws Exception;
}
