package com.hbcd.commonbanner.lazyCalls.helpers;

import com.hbcd.commonbanner.pages.Page;
import com.hbcd.utility.common.ApplicationSetup;
import com.hbcd.utility.common.Setting;


public class PageFactory {
    public static Page getPage(String page) throws ReflectiveOperationException {
        try {
            System.out.println(ApplicationSetup.get(Setting.SITE));
            String packageName = "com.hbcd." + ApplicationSetup.get(Setting.SITE);

            return (Page) Class.forName(packageName + page).newInstance();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            throw e;
        }
    }
}
