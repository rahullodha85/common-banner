package com.hbcd.commonbanner.overlays;

public interface QuickLookOverLay {
    public Overlay ClickViewSizeGuide() throws Exception;

    public void ClickViewFullDetails() throws Exception;
    public void AddToBag(String optionSize, int quantity, String optionColor) throws Exception;

    public void AddToBag(int quantity, String color, String size)  throws Exception;
    public void ClickReadReviews() throws Exception;

    public void AddToBag(String sizeOption) throws Exception;

    public void AddToBag(int quantity) throws Exception;

    public void UpdateQuantity(int quantity) throws Exception;

    public void OnlineChatFromQuickView() throws Exception;

    public void GoToPdp() throws Exception;

    public void CloseQuickView() throws Exception;

    public void Shoprunner(String emailAddress, String password) throws Exception;

    public void AddToWishList() throws Exception;

    public void ClickOnDifferentImage(int imageNumber) throws Exception;

    public void ClickWriteReview() throws Exception;

    public void WriteReview(String reviewheadline, String comment, String nickname, String yourlocation) throws Exception;

    public void EditReview(String reviewheadline, int ratings, String comment,
                           String nickname, String yourlocation) throws Exception;

    public void ReadReview() throws Exception;

    public void SubmitReview() throws Exception;
    public void ClickQVProductDescription() throws Exception;
    public void AddToBag() throws Exception;
}
