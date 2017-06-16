package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.enums.PageName;
import com.hbcd.commonbanner.enums.ShipMethod;
import com.hbcd.commonbanner.overlays.BillingMethodOverlay;
import com.hbcd.commonbanner.overlays.GiftOverlay;
import com.hbcd.commonbanner.overlays.QuickLookOverLay;
import com.hbcd.commonbanner.overlays.ShippingMethodOverlay;
import com.hbcd.commonbanner.pages.Page;
import com.hbcd.commonbanner.pages.ReviewSubmitPage;
import com.hbcd.commonbanner.toggle.ValidationToggle;

public class ReviewSubmitPageBase implements ReviewSubmitPage, Page {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.ReviewSubmitPage;

    public ReviewSubmitPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public ReviewSubmitPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public void ClickPlaceOrder() throws Exception {

    }
    @Override
    public void SelectShippingMethodInternational(String shippingMethod) throws Exception{

    }
    @Override
    public void ApplyGiftCard(String CardNumber, String pinNumber)
            throws Exception {

    }

    @Override
    public void AddShippingAddress(String address, String city, String state,
                                   String zipcode, boolean makeDefaultAddress) throws Exception {

    }

    @Override
    public void EditShippingAddress(String address) throws Exception {

    }

    @Override
    public void EditBillingAddress(String address) throws Exception {

    }

    @Override
    public void ChangeShippingMethod(String shippingMethod) throws Exception {

    }

    @Override
    public ShippingMethodOverlay ClickChangeShippingMethod() throws Exception {
        return null;
    }

    @Override
    public void ToggleSignature(String sku) throws Exception {

    }

    @Override
    public void ChangePaymentType(int index) throws Exception {

    }

    @Override
    public GiftOverlay MakeGift(String sku) throws Exception {
        return null;
    }

    @Override
    public void ClickShipToMultipleAddresses() throws Exception {

    }

    @Override
    public void ChangeShippingAddress(String address) throws Exception {

    }

    @Override
    public void ChangeBillingAddress(String address) throws Exception {

    }

    @Override
    public void EnterNewShippingAddress(String upc, String address,
                                        String city, String state, String zipcode,
                                        boolean makeDefaultAddress) throws Exception {

    }

    @Override
    public void ClickContinueCheckOut() throws Exception {

    }

    @Override
    public void Remove(String upc) throws Exception {

    }

    @Override
    public void EditCreditCard(String name) throws Exception {

    }

    @Override
    public void ClickShippingAndBillingTab() throws Exception {

    }

    @Override
    public void RemoveGift(String sku) throws Exception {

    }

    @Override
    public void EditCreditCard(String name, String paymentType, String ccNumber)
            throws Exception {

    }

    @Override
    public String GetShippingCharge() throws Exception {
        return null;
    }

    @Override
    public void ClickEditCreditCard() throws Exception {

    }

    @Override
    public ShippingMethodOverlay ClickEditShippingMethod() throws Exception {
        return null;
    }

    @Override
    public void RemoveGiftCard() throws Exception {

    }

    @Override
    public void UpdateQuantity(String upc, String qty) throws Exception {

    }

    @Override
    public BillingMethodOverlay ClickEditBilling() throws Exception {
        return null;
    }

    @Override
    public void SelectCreditCard(String cardName) throws Exception {

    }

    @Override
    public QuickLookOverLay ClickEditItem(String sku) throws Exception {
        return null;
    }

    @Override
    public void AddShippingAddress(String address, String city, String state,
                                   String zipcode, String country, boolean makeDefaultAddress)
            throws Exception {

    }

    @Override
    public void ClickPaypal() throws Exception {

    }

    @Override
    public void AddBillingAddress(String address, String city, String state,
                                  String zipcode, String cntry, boolean makeDefaultAddress)
            throws Exception {

    }

    @Override
    public void EditShippingAddress(boolean sameasbillinAddress,
                                    String firstname2, String lastname2, String streetaddress1,
                                    String street2address2, String city2, String province2,
                                    String postalcode2, String phone1_1, String phone2_2,
                                    String phone3_3, String phoneext2) throws Exception {

    }

    @Override
    public void VerifyOrderTotal() throws Exception {

    }

    @Override
    public void VerifyShippingCost() throws Exception {

    }

    @Override
    public void VerifyTax() throws Exception {

    }

    @Override
    public void GoToPDP(String itemName) throws Exception {

    }

    @Override
    public void ChangePaymentType() throws Exception {

    }

    @Override
    public void EditOptions(String editOptionsObjectName) throws Exception {

    }

    @Override
    public void EditBillingAddress(String firstName, String lastName,
                                   String streetaddress, String streetaddress2, String city,
                                   String province, String postalCard, String phonenumber1,
                                   String phonenumber2, String phonenumber3, String phoneextension,
                                   String emailId) throws Exception {

    }

    @Override
    public void GSTorHSTVerification() throws Exception {

    }

    @Override
    public void ClickShippingAndPayment() throws Exception {

    }

    @Override
    public void ValidateShpFrmStoreMsg2() throws Exception {

    }

    @Override
    public void VerifyConfirmation() throws Exception {

    }

    public void VerifyShippingMethod(String shpMethod) throws Exception {

    }

    @Override
    public void ChangeItemLevelShippingAddress(String upc, String address, String state, String city, String zipcode, Boolean makeDefaultAddress) throws Exception {
    }

    @Override
    public void ChangeItemLevelShippingMethod(String upc, String shipMethod, Boolean signReqd)
            throws Exception {

    }

    public void ClickSignatureRequiredDelivery(String upc) throws Exception {
    }

    @Override
    public void ClickEditShippingMethod(String upc, ShipMethod shipMethod) throws Exception {
    }

    public void ClickCloseShippingMethodOverlay() throws Exception {
    }

    @Override
    public void ClearAllItemsInBag() throws Exception {
    }

    @Override
    public void ClickEditShippingMethod(ShipMethod shipMethod) throws Exception {

    }

    public void ClickShippingMethodToolTip(String itemNumber) throws Exception {
    }

    @Override
    public void ClickNextOnMobile() throws Exception {

    }

    @Override
    public void ClickEditOnMobile() throws Exception {

    }

    @Override
    public void ClickEditShippingAddressOnMobile() throws Exception {

    }

    @Override
    public void ClickEditBillingAddressOnMobile() throws Exception {

    }

    @Override
    public void ClickEditPaymentOnMobile() throws Exception {

    }

    @Override
    public void EnterShippingAddress(String firstName, String lastName, String address, String city, String zipCode, String state, String phoneNumber) throws Exception {

    }

    @Override
    public void ChangeShippingAddressOnMobile(String address) throws Exception {

    }

    @Override
    public void IsReviewSubmitPage() throws Exception {

    }

    @Override
    public void ClickEditBillingAddress() throws Exception {

    }

    @Override
    public void ClickEnterNewCCRadioButton() throws Exception {

    }
}

