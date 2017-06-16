package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.enums.ShipMethod;
import com.hbcd.commonbanner.overlays.BillingMethodOverlay;
import com.hbcd.commonbanner.overlays.GiftOverlay;
import com.hbcd.commonbanner.overlays.QuickLookOverLay;
import com.hbcd.commonbanner.overlays.ShippingMethodOverlay;


public interface ReviewSubmitPage {
    public void ClickPlaceOrder() throws Exception;

    public void ApplyGiftCard(String CardNumber, String pinNumber) throws Exception;

    public void AddShippingAddress(String address, String city, String state,
                                   String zipcode, boolean makeDefaultAddress) throws Exception;

    public void EditShippingAddress(String address) throws Exception;

    public void EditBillingAddress(String address) throws Exception;

    public void ChangeShippingMethod(String shippingMethod) throws Exception;

    public ShippingMethodOverlay ClickChangeShippingMethod() throws Exception;

    public void ToggleSignature(String sku) throws Exception;

    public void ChangePaymentType(int index) throws Exception;

    public GiftOverlay MakeGift(String sku) throws Exception;

    public void ClickShipToMultipleAddresses() throws Exception;

    public void ChangeShippingAddress(String address) throws Exception;

    public void ChangeBillingAddress(String address) throws Exception;

    public void EnterNewShippingAddress(String upc, String address,
                                        String city, String state, String zipcode,
                                        boolean makeDefaultAddress) throws Exception;

    public void ClickContinueCheckOut() throws Exception;

    public void Remove(String upc) throws Exception;

    public void ClearAllItemsInBag() throws Exception;

    public void EditCreditCard(String name) throws Exception;

    public void ClickShippingAndBillingTab() throws Exception;

    public void RemoveGift(String sku) throws Exception;

    /**
     * InputOptions: Saks Fifth Avenue Store Card, Saks Fifth Avenue MasterCard, MasterCard, Visa, American Express, Discover, Japan Credit Bureau, China UnionPay Credit, Diners Club, PayPal
     */
    public void EditCreditCard(String name, String paymentType, String ccNumber) throws Exception;

    String GetShippingCharge() throws Exception;

    public void ClickEditCreditCard() throws Exception;

    public ShippingMethodOverlay ClickEditShippingMethod() throws Exception;

    public void RemoveGiftCard() throws Exception;

    public void UpdateQuantity(String upc, String qty) throws Exception;

    public BillingMethodOverlay ClickEditBilling() throws Exception;

    public void SelectCreditCard(String cardName) throws Exception;

    public QuickLookOverLay ClickEditItem(String sku) throws Exception;

    public void AddShippingAddress(String address, String city, String state, String zipcode, String country, boolean makeDefaultAddress) throws Exception;

    public void ClickPaypal() throws Exception;

    public void AddBillingAddress(String address, String city, String state, String zipcode, String cntry, boolean makeDefaultAddress) throws Exception;

    public void EditShippingAddress(boolean sameasbillinAddress, String firstname2,
                                    String lastname2, String streetaddress1, String street2address2,
                                    String city2, String province2, String postalcode2,
                                    String phone1_1, String phone2_2, String phone3_3, String phoneext2)
            throws Exception;

    void VerifyOrderTotal() throws Exception;

    void VerifyShippingCost() throws Exception;

    void VerifyTax() throws Exception;

    void GoToPDP(String itemName) throws Exception;

    void ChangePaymentType() throws Exception;

    void EditOptions(String editOptionsObjectName) throws Exception;

    public void EditBillingAddress(String firstName, String lastName,
                                   String streetaddress, String streetaddress2, String city,
                                   String province, String postalCard, String phonenumber1,
                                   String phonenumber2, String phonenumber3, String phoneextension,
                                   String emailId) throws Exception;

    public void GSTorHSTVerification() throws Exception;

    public void ClickShippingAndPayment() throws Exception;

    public void ValidateShpFrmStoreMsg2() throws Exception;

    public void VerifyConfirmation() throws Exception;

    public void VerifyShippingMethod(String string) throws Exception;

    public void ChangeItemLevelShippingAddress(String upc, String address, String state, String city, String zipcode, Boolean makeDefaultAddress) throws Exception;

    public void ChangeItemLevelShippingMethod(String upc, String shipMethod, Boolean signReqd) throws Exception;

    public void ClickSignatureRequiredDelivery(String upc) throws Exception;

    public void ClickEditShippingMethod(String upc, ShipMethod shipMethod) throws Exception;

    public void ClickCloseShippingMethodOverlay() throws Exception;

    public void ClickEditShippingMethod(ShipMethod shipMethod) throws Exception;

    public void ClickShippingMethodToolTip(String itemNumber) throws Exception;
    public void SelectShippingMethodInternational(String shippingMethod) throws Exception;

    public void ClickNextOnMobile() throws Exception;
    public void ClickEditOnMobile() throws Exception;
    public void ClickEditShippingAddressOnMobile() throws Exception;
    public void ClickEditBillingAddressOnMobile()throws Exception;
    public void ClickEditPaymentOnMobile() throws Exception;
    public void EnterShippingAddress(String firstName, String lastName, String address, String city, String zipCode, String state, String phoneNumber) throws Exception;
    public void ChangeShippingAddressOnMobile(String address) throws Exception;

    public void IsReviewSubmitPage() throws Exception;
    public void ClickEditBillingAddress() throws Exception;
    public void ClickEnterNewCCRadioButton() throws Exception;
}

