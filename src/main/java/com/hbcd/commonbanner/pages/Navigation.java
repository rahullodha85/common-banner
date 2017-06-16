package com.hbcd.commonbanner.pages;


import com.hbcd.commonbanner.drawer.Drawer;
import com.hbcd.commonbanner.enums.BotNavLinks;
import com.hbcd.commonbanner.enums.NavLinks;
import com.hbcd.commonbanner.enums.RightNavLinks;
import com.hbcd.commonbanner.enums.TopNavLinks;
import com.hbcd.commonbanner.overlays.SignInOverlay;

public interface Navigation {
    public SignInOverlay ClickYourAccount() throws Exception;

    public Drawer ClickWomen() throws Exception;

    public Drawer ClickShoesHandbag() throws Exception;

    public Drawer ClickJewelryAccessories() throws Exception;

    public Drawer ClickMen() throws Exception;

    public Drawer ClickKids() throws Exception;

    public Drawer ClickHome() throws Exception;

    public SignInOverlay ClickSignIn() throws Exception;

    public Drawer ClickClearance() throws Exception;

    public YourAccountPage GoToAddressBook() throws Exception;

    public Drawer HoverNavLinks(TopNavLinks linkText) throws Exception;

    public void ClickSaksYourAccount() throws Exception;

    public void SelectDesigner(String designer) throws Exception;

    public void SelectFirstDesigner() throws Exception;

    public void ClickSavedItems() throws Exception;

    public StoreLocatorPage ClickStoreLocator() throws Exception;

    public void ClickDesigners() throws Exception;

    public void ClickMainHomePage() throws Exception;

    public void EnterPrp(Object... args) throws Exception;

    public void ClickStores() throws Exception;

    public void ChangeCountry(String country) throws Exception;

    public void ClickLeftNavLink(String link) throws Exception;

    public void ClickBottomNavLink(BotNavLinks link) throws Exception;

    public void ClickLeftNavLink(NavLinks link) throws Exception;

    public void ClickRightNavLink(RightNavLinks link) throws Exception;

    public void ClickNavigationLinks(TopNavLinks linkName) throws Exception;

    public void ClickShopAll() throws Exception;

    public void ClickShipTo() throws Exception;

    public void GoToAccountProfile() throws Exception; //Click MyAccount

    public void GoToOrderHistory() throws Exception;

    public void isPresentLink(NavLinks link) throws Exception;

    public void EnterBag() throws Exception;

    public void goToPage(String linkText) throws Exception;

    public void Logout() throws Exception;

    public void Shoprunner(String emailAddress, String password) throws Exception;

    public GiftCardsPage ClickGiftCard() throws Exception;

    public void ClickCheckoutFromNav() throws Exception;

    public void ClickSignUpBtn() throws Exception;

    public void BorderFreeOrder(String CountryName) throws Exception;

    public BrandsListPage ClickBrand() throws Exception;

    public void ClickBrandsDrawer() throws Exception;

    public GiftRegistryPage ClickGiftRegistry() throws Exception;

    public void ClickUserAccount() throws Exception;

    public void ClickHeaderSignUpBtn() throws Exception;

    public void ClickEditMyProfile() throws Exception;

    public void ClickMyAddressBook() throws Exception;

    public void ClickMyProfile() throws Exception;

    public void ClickDrawer(String menuitem, String submenuitem) throws Exception;

    public void ClickTopNavLink(String link) throws Exception;

    public void ClickBottomNavLink(String sLinkName) throws Exception;

    public void LoginWith(String emailID, String loginPassword) throws Exception;

    public void ClickGuestCheckout() throws Exception;

    public void SearchFor(String string) throws Exception;

    public void ClickStoreLocator2() throws Exception;

    public void GoToSignIn() throws Exception;

    public void HoverTopNav(String category) throws Exception;
// Added new methods for homepage
    public void ClickLogo() throws Exception;
    public void SignMeUp(String email,String zip) throws Exception;
    public void ClickWishList() throws Exception;

    public void ClickShoppingBagLink() throws Exception;

    public void ClickItemOnMiniBag(String itemName) throws Exception;
    public void ClickOnShoppingBagLink() throws Exception;
    public void HoverOverTopNav(String category)throws Exception;
    public void ClickSubNavLeft(String link) throws Exception;
    public void ClickWalletsCases() throws Exception;
    public void ClickOnShoes() throws Exception;
    public void ClickBabyGirlsL2() throws Exception;
    public void ClickDressShoes() throws Exception;
    public void ClickBoots() throws Exception;
    public void ClickShopNewArrival() throws Exception;
    public void SelectCountry(String country) throws Exception;

    public void ClickSignOut() throws Exception;
    public void ClickBackToUSSite() throws Exception;
    public void CloseMinicart() throws Exception;

    public Drawer HoverOverSignIn() throws Exception;

    public void CloseHomePagePopup() throws Exception;

    public void ClickSignInLink() throws Exception;

    public void ClickSearchCategories() throws Exception;

    public void clickNavMenu() throws Exception;

    public void closeMiniBag() throws Exception;

    public void clickMinibag() throws Exception;
}
