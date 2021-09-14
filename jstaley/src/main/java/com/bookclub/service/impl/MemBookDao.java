/*
Student:	    Jason Staley
Date: 		    9/14/2021
Assignment: 	3.2 - Thymeleaf in Action
File Name: 	    MemBookDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("9780385121675", "The Shining", "A 1977 horror novel by American author Stephen King. It is King's third published novel and first hardback bestseller; its success firmly established King as a preeminent author in the horror genre.", 447, new ArrayList<>(List.of("Stephen King"))));
        this.books.add(new Book("9780385182447", "Pet Sematary", "A 1983 horror novel by American writer Stephen King. The novel was nominated for a World Fantasy Award for Best Novel in 1986, and adapted into two films: one in 1989 and another in 2019.", 373, new ArrayList<>(List.of("Stephen King"))));
        this.books.add(new Book("0670813028", "It", "A 1986 horror novel by American author Stephen King. The story follows the experiences of seven children as they are terrorized by an evil entity that exploits the fears of its victims to disguise itself while hunting its prey.", 1138, new ArrayList<>(List.of("Stephen King"))));
        this.books.add(new Book("9780385086950", "Carrie", "Carrie is an epistolary horror novel by American author Stephen King. Set primarily in the then-future year of 1979, it revolves around the eponymous Carrie White, a friendless, bullied high-school girl from an abusive religious household who uses her newly discovered telekinetic powers to exact revenge on those who torment her. In the process, she causes one of the worst local disasters the town has ever had.", 199, new ArrayList<>(List.of("Stephen King"))));
        this.books.add(new Book("9780385007511", "'Salem's Lot", "A 1975 horror novel by American author Stephen King. The story involves a writer named Ben Mears who returns to the town of Jerusalem's Lot (or 'Salem's Lot for short) in Maine, where he lived from the age of five through nine, only to discover that the residents are becoming vampires.", 439, new ArrayList<>(List.of("Stephen King"))));


    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}