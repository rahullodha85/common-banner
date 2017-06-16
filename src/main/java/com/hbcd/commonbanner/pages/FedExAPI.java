package com.hbcd.commonbanner.pages;

import com.hbcd.commonbanner.dataobjects.Address;

public interface FedExAPI {
    public String handle(Address data) throws Exception;
}
