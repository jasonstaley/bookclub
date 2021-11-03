/*
Student:	    Jason Staley
Date: 		    11/2/2021
Assignment: 	10.2 – Authorization in Action
File Name: 	    BookOfTheMonthDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.service.dao;

import com.bookclub.model.BookOfTheMonth;
import com.bookclub.service.GenericCrudDao;

public interface BookOfTheMonthDao extends GenericCrudDao<BookOfTheMonth, String> {
}
