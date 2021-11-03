/*
Student:	    Jason Staley
Date: 		    9/14/2021
Assignment: 	3.2 - Thymeleaf in Action
Updated:        11/2/2021 - 10.2 – Authorization in Action - add parameter to list() method
File Name: 	    GenericDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.service;

import java.util.List;

public interface GenericDao<E, K> {
    List<E> list(K key); // Return a list of objects of type E.
    E find(K key); // Return an object of type E by type K value.
}