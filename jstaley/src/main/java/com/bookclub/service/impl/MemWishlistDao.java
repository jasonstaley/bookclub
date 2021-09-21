/*
Student:	    Jason Staley
Date: 		    9/21/2021
Assignment: 	4.2 - Forms and Data Validation
File Name: 	    MemWishlistDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.service.impl;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

import java.util.ArrayList;
import java.util.List;

public class MemWishlistDao implements WishlistDao {
    List<WishlistItem> wishlist;

    public MemWishlistDao() {
        this.wishlist = new ArrayList<WishlistItem>();
        this.wishlist.add(new WishlistItem("9780385121675", "The Shining"));
        this.wishlist.add(new WishlistItem("9780385182447", "Pet Sematary"));
        this.wishlist.add(new WishlistItem("0670813028", "It"));
        this.wishlist.add(new WishlistItem("9780385086950", "Carrie"));
        this.wishlist.add(new WishlistItem("9780385007511", "'Salem's Lot"));
    }

    @Override
    public List<WishlistItem> list() {
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem item : wishlist) {
            if (item.getIsbn().equals(key)) {
                return item;
            }
        }
        return new WishlistItem();
    }
}
