/*
Student:	    Jason Staley
Date: 		    9/14/2021
Assignment: 	3.2 - Thymeleaf in Action
File Name: 	    Book.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.model;

import java.util.List;

public class Book
{
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private List<String> authors;

    public Book() {}

    public Book(String isbn, String title, String description, int numOfPages, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.authors = authors;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return String.format("Book{isbn=%s, title=%s, description=%s, numOfPages=%s, authors=%s}", isbn, title, description, numOfPages, authors);
    }
}