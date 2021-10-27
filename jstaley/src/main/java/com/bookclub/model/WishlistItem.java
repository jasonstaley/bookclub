/*
Student:	    Jason Staley
Date: 		    9/21/2021
Assignment: 	4.2 - Forms and Data Validation
Updated:        9/28/2021 - Assignment 5.2 – Data Persistence with MongoDB - a new private property for id of type String with a decorator of @Id
                -Add getter method for the new id property
                -Update the overridden toString() method to include the id property
                10/27/2021 - Assignment 9.2 – CRUD Operations
File Name: 	    WishlistItem.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishlist")
public class WishlistItem
{
    @Id
    private String id;

    @NotNull
    @NotEmpty(message = "ISBN is a required field.")
    private String isbn;

    @NotNull
    @NotEmpty(message = "Title is a required field.")
    private String title;

    private String username;

    public WishlistItem() {}

    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public WishlistItem(String isbn, String title, String username) {
        this.isbn = isbn;
        this.title = title;
        this.username = username;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return String.format("WishlistItem{id=%s, isbn=%s, title=%s, username=%s}", id, isbn, title, username);
    }
}