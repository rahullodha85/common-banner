package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.base.pages.SearchFunction;


@FunctionalInterface
public interface SearchInterface {
    void doNothing();

    static void Search() throws Exception {
//		Action.inputPresetData("OBJ1");
//		Action.click("OBJ2");
        SearchFunction.Search();
    }
}
