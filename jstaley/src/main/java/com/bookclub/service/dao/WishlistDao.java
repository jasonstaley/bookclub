/*
Student:	    Jason Staley
Date: 		    9/21/2021
Assignment: 	4.2 - Forms and Data Validation
Updated:        9/28/2021 - Assignment 5.2 – Data Persistence with MongoDB - extend the GenericCrudDao instead of the GenericDao interface
File Name: 	    WishlistDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.service.dao;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.GenericCrudDao;
import com.bookclub.service.GenericDao;

public interface WishlistDao extends GenericCrudDao<WishlistItem, String> {
}