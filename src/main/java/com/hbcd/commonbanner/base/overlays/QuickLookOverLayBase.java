package com.hbcd.commonbanner.base.overlays;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.overlays.Overlay;
import com.hbcd.commonbanner.overlays.QuickLookOverLay;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.Find;

public class QuickLookOverLayBase implements QuickLookOverLay, Overlay {


    protected boolean isValidate = true;
    protected PageName pageName = PageName.QuickLookOverlay;

    public QuickLookOverLayBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public QuickLookOverLayBase(boolean isVal) {
        isValidate = isVal;
    }

    // Method for Clicking Size Guide
    @Override
    public Overlay ClickViewSizeGuide() throws Exception {
        return null;
    }
    @Override
    public void AddToBag(String optionSize, int quantity, String optionColor) throws Exception
    {

    }
    //Method for  Clicking View Full Details Link
    @Override
    public void ClickViewFullDetails() throws Exception {

    }

    //Method for Clicking Read Reviews
    @Override
    public void ClickReadReviews() throws Exception {

    }

    @Override
    public void AddToBag(String sizeOption) throws Exception {

    }

    @Override
    public void UpdateQuantity(int quantity) throws Exception {

    }



    @Override
    public void OnlineChatFromQuickView() throws Exception {

    }

    @Override
    public void GoToPdp() throws Exception {

    }

    @Override
    public void CloseQuickView() throws Exception {
        Find.Object("qlCloseShoprunner_AAF").click();

    }

    @Override
    public void Shoprunner(String emailAddress, String password)
            throws Exception {

    }

    @Override
    public void AddToWishList() throws Exception {

    }


    @Override
    public void ClickOnDifferentImage(int imageNumber) throws Exception {

    }

    @Override
    public void ClickWriteReview() throws Exception {

    }

    @Override
    public void WriteReview(String reviewheadline, String comment,
                            String nickname, String yourlocation) throws Exception {

    }

    @Override
    public void AddToBag(int quantity) throws Exception {

    }

    @Override
    public void EditReview(String reviewheadline, int ratings, String comment,
                           String nickname, String yourlocation) throws Exception {

    }

    @Override
    public void ReadReview() throws Exception {

    }
    @Override
    public void AddToBag(int quantity, String color, String size)
            throws Exception {

    }

    @Override
    public void SubmitReview() throws Exception {

    }

    @Override
    public void ClickQVProductDescription() throws Exception {

    }

    @Override
    public void AddToBag() throws Exception{}
}
