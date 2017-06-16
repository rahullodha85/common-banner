package com.hbcd.commonbanner.base.pages;

import com.hbcd.commonbanner.drawer.Drawer;
import com.hbcd.commonbanner.enums.*;
import com.hbcd.commonbanner.overlays.SignInOverlay;
import com.hbcd.commonbanner.pages.*;
import com.hbcd.commonbanner.toggle.ValidationToggle;
import com.hbcd.scripting.core.BrowserAction;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.core.Report;
import com.hbcd.scripting.enums.impl.Check;
import com.hbcd.scripting.reporting.StepLogger;

public class NavigationPageBase implements Navigation, Page {

    protected boolean isValidate = false;
    protected PageName pageName = PageName.NavigationPage;

    public NavigationPageBase() {
        isValidate = ValidationToggle.get(pageName);
    }

    public NavigationPageBase(boolean isVal) {
        isValidate = isVal;
    }

    @Override
    public SignInOverlay ClickYourAccount() throws Exception {
        return null;
    }
    @Override
    public void SelectCountry(String country) throws Exception{

    }
    @Override
    public Drawer ClickWomen() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickShoesHandbag() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickJewelryAccessories() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickMen() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickKids() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickHome() throws Exception {
        return null;
    }

    @Override
    public Drawer ClickClearance() throws Exception {
        return null;
    }

    @Override
    public YourAccountPage GoToAddressBook() throws Exception {
        return null;
    }

    @Override
    public Drawer HoverNavLinks(TopNavLinks linkText) throws Exception {
        return null;
    }

    @Override
    public void ClickSaksYourAccount() throws Exception {

    }

    @Override
    public void SelectDesigner(String designer) throws Exception {

    }

    @Override
    public void SelectFirstDesigner() throws Exception {

    }

    @Override
    public void ClickSavedItems() throws Exception {

    }

    @Override
    public StoreLocatorPage ClickStoreLocator() throws Exception {
        StepLogger.validate(Check.ObjectPresent, "StoreLocatorLink");
        if (Find.Object("StoreLocatorLink").isPresentDisplayedEnabled()) {

            Find.Object("StoreLocatorLink").click();
            Report.pass("STORE LOCATOR link is found on Header",
                    BrowserAction.screenshot());

        } else {
            Report.fail("STORE LOCATOR link is not found on Header",
                    BrowserAction.screenshot());
        }
        return new StoreLocatorPageBase();
    }

    @Override
    public void ClickDesigners() throws Exception {

    }

    @Override
    public void ClickMainHomePage() throws Exception {

    }

    @Override
    public void EnterPrp(Object... args) throws Exception {

    }

    @Override
    public void ClickStores() throws Exception {

    }

    @Override
    public void ChangeCountry(String country) throws Exception {

    }

    @Override
    public void ClickLeftNavLink(String link) throws Exception {

    }

    @Override
    public void ClickBottomNavLink(BotNavLinks link) throws Exception {

    }

    @Override
    public void ClickLeftNavLink(NavLinks link) throws Exception {

    }

    @Override
    public void ClickNavigationLinks(TopNavLinks linkName) throws Exception {

    }

    @Override
    public void ClickShopAll() throws Exception {

    }

    @Override
    public void ClickShipTo() throws Exception {

    }

    @Override
    public void GoToAccountProfile() throws Exception {

    }

    @Override
    public void GoToOrderHistory() throws Exception {

    }

    @Override
    public void isPresentLink(NavLinks link) throws Exception {

    }

    @Override
    public void EnterBag() throws Exception {
    }

    @Override
    public void goToPage(String linkText) throws Exception {

    }

    @Override
    public void Logout() throws Exception {

    }

    @Override
    public void Shoprunner(String emailAddress, String password)
            throws Exception {

    }

    @Override
    public GiftCardsPage ClickGiftCard() throws Exception {
        return null;
    }

    @Override
    public GiftRegistryPage ClickGiftRegistry() throws Exception {
        return null;
    }

    @Override
    public void ClickCheckoutFromNav() throws Exception {

    }
    @Override
    public void ClickBackToUSSite() throws Exception{

    }

    @Override
    public void ClickSignUpBtn() throws Exception {
        StepLogger.validate(Check.ObjectPresent, "SignUpNowBtn");
        if (Find.Object("SignUpNowBtn").isPresentDisplayedEnabled()) {
            Report.pass("SignUp button displayed on footer",
                    BrowserAction.screenshot());
            Find.Object("SignUpNowBtn").click();
        } else {
            Report.fail("SignUp button not displayed on footer",
                    BrowserAction.screenshot());
        }
    }

    @Override
    public void ClickHeaderSignUpBtn() throws Exception {

    }

    @Override
    public void BorderFreeOrder(String CountryName) throws Exception {

    }

    @Override
    public BrandsListPage ClickBrand() throws Exception {
        return null;
    }

    @Override
    public void ClickBrandsDrawer() throws Exception {

    }

    @Override
    public SignInOverlay ClickSignIn() throws Exception {
        return null;
    }


    @Override
    public void ClickUserAccount() throws Exception {

    }


    @Override
    public void ClickRightNavLink(RightNavLinks link) throws Exception {

    }

    @Override
    public void ClickEditMyProfile() throws Exception {

    }

    @Override
    public void ClickMyAddressBook() throws Exception {

    }

    @Override
    public void ClickMyProfile() throws Exception {

    }

    @Override
    public void ClickDrawer(String menuitem, String submenuitem)
            throws Exception {

    }

    @Override
    public void ClickTopNavLink(String link) throws Exception {


    }

    @Override
    public void ClickBottomNavLink(String sLinkName) throws Exception {

    }

    @Override
    public void LoginWith(String emailID, String loginPassword)
            throws Exception {

    }

    @Override
    public void ClickGuestCheckout() throws Exception {

    }

    @Override
    public void SearchFor(String string) throws Exception {

    }

    @Override
    public void ClickStoreLocator2() throws Exception {

    }

    @Override
    public void GoToSignIn() throws Exception {

    }

    @Override
    public void HoverTopNav(String link) throws Exception {

    }

    @Override
    public void ClickLogo() throws Exception {

    }

    @Override
    public void SignMeUp(String email,String zip) throws Exception {

    }

    @Override
    public void ClickWishList() throws Exception {

    }

    @Override
    public void ClickShoppingBagLink() throws Exception{

    }
    
    @Override
    public void ClickItemOnMiniBag(String itemName) throws Exception{

    }

    @Override
    public void ClickOnShoppingBagLink() throws Exception {

    }

    @Override
    public void HoverOverTopNav(String category) throws Exception {

    }

    @Override
    public void ClickSubNavLeft(String link) throws Exception {

    }



    @Override
    public void ClickWalletsCases() throws Exception {

    }

    @Override
    public void ClickOnShoes() throws Exception {

    }

    @Override
    public void ClickBabyGirlsL2() throws Exception {

    }

    @Override
    public void ClickDressShoes() throws Exception {

    }

    @Override
    public void ClickBoots() throws Exception {

    }

    @Override
    public void ClickShopNewArrival() throws Exception {

    }



    @Override
    public void ClickSignOut() throws Exception{}

    @Override
    public void CloseMinicart() throws Exception {

    }

    @Override
    public Drawer HoverOverSignIn() throws Exception {
        return null;
    }

    @Override
    public void CloseHomePagePopup() throws Exception {

    }

    @Override
    public void ClickSignInLink() throws Exception {

    }

    @Override
    public void ClickSearchCategories() throws Exception {

    }

    @Override
    public void clickNavMenu() throws Exception {

    }

    @Override
    public void closeMiniBag() throws Exception {

    }

    @Override
    public void clickMinibag() throws Exception {

    }
}
