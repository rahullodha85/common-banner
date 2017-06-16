package com.hbcd.commonbanner.pages;

public interface WishList {

    public void AddToBagFromWishList() throws Exception;

    public void AddWishListToBag(String itemName) throws Exception;

    public void RemoveWishList(String itemName) throws Exception;

    public void AddAllToBag() throws Exception;

    public void SendWishList(String recipientEmail, String sendersName,
                             String sendersEmailaddress, String message) throws Exception;

    public void AddToBagFromWishList(String itemName) throws Exception;

    public void RemoveFromWishList(String itemName) throws Exception;

}
