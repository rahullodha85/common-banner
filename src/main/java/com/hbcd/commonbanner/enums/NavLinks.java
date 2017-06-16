package com.hbcd.commonbanner.enums;

public enum NavLinks {
    SAKSFIRSTMEMBERSHIP("SaksFirst Membership"), SAKSFIRSTSTORECARD("SaksFirst Store Card"), SAKSFIRSTMASTERCARD("SaksFirst Mastercard"), CONTACTSAKSFIRST("Contact SaksFirst"),
    SAKSFIRSTACCOUNT("SaksFirst Account"), APPLYSAKSFIRSTSTORECARD("Apply for the SaksFirst"), UPGRADESAKSFIRSTMASTERCARD("Upgrade to the SaksFirst");
    private String objectName;

    private NavLinks(String objectName) {
        this.objectName = objectName;
    }

    public String toString() {
        return this.objectName;
    }

}
