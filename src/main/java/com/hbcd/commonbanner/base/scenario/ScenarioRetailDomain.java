package com.hbcd.commonbanner.base.scenario;

import com.hbcd.commonbanner.overlays.*;
import com.hbcd.commonbanner.pages.*;
import com.hbcd.scripting.base.ScenarioBase;
import com.hbcd.scripting.core.ScriptData;
import com.hbcd.utility.testscriptdata.CheckoutDataRow;
import com.hbcd.utility.testscriptdata.JsonParser;


public class ScenarioRetailDomain extends ScenarioBase {
    public PdpPage pdp;
    public BagPage bag;
    public ShippingPage shp;
    public PaymentPage pap;
    public YourAccountPage yap;
    public ReviewSubmitPage rsp;
    public ContactCenterPage ccp;
    public LoginOverlay lno;
    public PayPalInformationPage papl;
    public FedExAPI fdxRqst;
    public Navigation nav;
    public SectionPage sec;
    public LoginOverlay lgn;
    public ConfirmationPage cop;
    public QuickLookOverLay qlo;
    public BagOverlay bol;
    public FindInStore fis;
    public ConfirmationPage conf;
    public ScriptData itemData;
    public ProductArrayPage prp;
    public InternationalCheckout icp;
    public StoreLocatorPage slp;
    public ShopRunnerSigninOverlay shr;
    public CheckoutDataRow dataObject;
    public ShopRunnerExpressChekoutOverlay sre;
    public SignInPage sip;
    public CreateAccountPage cap;
    public ForgotPasswordPage fpp;
    public AccountSummaryPage accSum;
    public AccountSettingsPage accSet;
    public ChangePasswordOverlay chngPwd;
    public EditProfileOverlay editPro;
    public OrderHistoryPage ordHis;
    public AccountPaymentPage accPay;
    public AccountShippingAddressPage accShp;
    public AccountBillingAddressPage accBill;
    public OrderDetailsPage ordDet;
    public EditPaymentMethodOverlay editPay;
    public EditShippingAddrOverlay editShp;
    public EditEmailPrefOverlay emailPref;
    public GiftCardsPage gcp;
    public SmartSampleOverlay sso;
    public LinkYourSaksFirstOverlay saksFirst;
    public MiniBagOverlay miniBagOverlay;

    @Override
    public void ini(long requestId, String... args) throws Exception {
        _requestId = requestId;
        _testScriptDescription = args[1];
        if ((args.length > 0) && (args[0] != null) && (args[0].length() > 0))
        {
            dataObject = (CheckoutDataRow) JsonParser.parseJson("com.hbcd.utility.testscriptdata.CheckoutDataRow", args[0]);
        }
    }

    public void beforeExecuteScript() throws Exception {
        //TestscriptData.saveEmcGiftCardList();
       // TestscriptData.saveGiftCardList();
        super.beforeExecuteScript();
    }
}
