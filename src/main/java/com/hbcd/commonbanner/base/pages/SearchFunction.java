package com.hbcd.commonbanner.base.pages;

import com.hbcd.scripting.core.BrowserAction;
import com.hbcd.scripting.core.Find;
import com.hbcd.scripting.core.Report;
import com.hbcd.scripting.enums.impl.Check;
import com.hbcd.scripting.reporting.StepLogger;

public class SearchFunction {

    public static void SearchFor(String value) throws Exception {
        //Thread.sleep(2000);
        //StepLogger.validate(Check.ObjectPresent, "SearchItemFieldTxtBx");
        //closeOverlay();
        //Thread.sleep(2000);
        if (Find.Object("SearchItemFieldTxtBx").isPresent()){
            Report.pass("Searched TextBox is Displayed");
        }else{
            Report.fail("Search TextBox is NOT displayed");
        }
        Find.Object("SearchItemFieldTxtBx").clear();
        Find.Object("SearchItemFieldTxtBx").input(value);
        //Find.Object("SearchItemFieldTxtBx").enter();
        Report.pass("Search For " + value, BrowserAction.screenshot());
        Find.Object("SearchItemFieldTxtBx").submit().getPerformance("SUBMIT on Search Button", "SearchFunction");

    }
    public static void ClearSearchBox() throws Exception {
        //Thread.sleep(2000);
        //StepLogger.validate(Check.ObjectPresent, "SearchItemFieldTxtBx");
        //closeOverlay();
        //Thread.sleep(2000);
        Find.Object("SearchItemFieldTxtBx").hover();

       // Find.Object("SearchItemFieldTxtBx").submit().getPerformance("SUBMIT on Search Button", "SearchFunction");

    }


    public static void SearchBox(String value) throws Exception{
        //Thread.sleep(2000);
        //StepLogger.validate(Check.ObjectPresent, "SearchItemFieldTxtBx");
        //closeOverlay();
        //Thread.sleep(2000);
        Find.Object("SearchItemFieldTxtBx").clear();
        Find.Object("SearchItemFieldTxtBx").input(value);
        //Find.Object("SearchItemFieldTxtBx").enter();
        Report.pass("Search For " + value, BrowserAction.screenshot());
        Find.Object("SearchItemFieldTxtBx").submit().getPerformance("SUBMIT on Search Button", "SearchFunction");

    }

    private static void closeOverlay() throws Exception {
        if (Find.Object("closeHomePageOverlay_vm").isPresent()) {
            Find.Object("closeHomePageOverlay_vm").click();
        }
    }

    public static void SearchForGiftCard() throws Exception {
        closeOverlay();
        Find.Object("navPurchaseGiftCardBtn").click();
        Find.Object("BuygiftCardBtn").click();

		/*Find.Object("SearchItemFieldTxtBx").input("gift card");
		Find.Object("SearchBtn").submit();*/
        StepLogger.validate(Check.TextPresent, "giftCardTxt", "Gift Card");
    }

    public static void Search() throws Exception {
        Find.Object("SearchItemFieldTxtBx").inputPresetData();
        ClickSearch();
    }

    public static void SearchOnProductArray(String value) throws Exception {
        Find.Object("SearchItemFieldTxtBx").input(value + " ");
        Report.pass("Search For Product Array: " + value + " ", BrowserAction.screenshot());
        ClickSearch();
    }

    public static void ClickFirstResultAfterSearch(String input) throws Exception {
        Find.Object("SearchItemFieldTxtBx").clear();
        StepLogger.validate(Check.ObjectPresent, "SearchItemFieldTxtBx");
        Find.Object("SearchItemFieldTxtBx").input(input);
        Thread.sleep(1000L);
        Find.Object("searchDropdownFirstItem_wk").click();
    }
    public static void ClickSearch() throws Exception{
        Find.Object("SearchBtn").click();
    }
}
