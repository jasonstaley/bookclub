/*
Student:	    Jason Staley
Date: 		    9/14/2021
Assignment: 	3.2 - Thymeleaf in Action
File Name: 	    BookDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.service.dao;

import com.bookclub.model.Book;
import com.bookclub.service.GenericDao;

public interface BookDao extends GenericDao<Book, String> {
}