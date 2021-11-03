/*
Student:	    Jason Staley
Date: 		    11/2/2021
Assignment: 	10.2 – Authorization in Action
File Name: 	    BookOfTheMonth.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.model;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotEmpty;

public class BookOfTheMonth {

    @Id
    private String id;

    private Integer month;

    @NotEmpty(message = "ISBN is a required field")
    private String isbn;

    public BookOfTheMonth() {}

    public BookOfTheMonth(int month, String isbn) {
        this.month = month;
        this.isbn = isbn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("BookOfTheMonth{id=%s, month=%s, isbn=%s}", id, month, isbn);
    }
}