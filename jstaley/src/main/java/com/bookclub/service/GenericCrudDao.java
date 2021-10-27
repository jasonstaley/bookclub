/*
Student:	    Jason Staley
Date: 		    9/28/2021
Assignment: 	Data Persistence with MongoDB
Updated:        10/27/2021 - Assignment 9.2 – CRUD Operations - add g a parameter to the list() method of type K and a value of key
File Name: 	    GenericCrudDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity);
    boolean remove(K key);
    List<E> list(K key); // Return a list of objects of type E by username.
    E find(K key); // Return an object of type E by type K value.
}
