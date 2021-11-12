/*
Student:	    Jason Staley
Date: 		    9/9/2021
Assignment: 	2.2 - Controller Aspects and Navigation
Updated:        9/14/2021 - 3.2 - Thymeleaf in Action - updated showHome() method
                11/2/2021 - 10.2 – Authorization in Action
File Name: 	    HomeController.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.web;

import com.bookclub.model.Book;
import com.bookclub.model.BookOfTheMonth;
import com.bookclub.service.dao.BookOfTheMonthDao;
import com.bookclub.service.impl.MongoBookOfTheMonthDao;
import com.bookclub.service.impl.RestBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController
{
    BookOfTheMonthDao bookOfTheMonthDao = new MongoBookOfTheMonthDao();

    @Autowired
    public void setBookOfTheMonthDao(BookOfTheMonthDao bookOfTheMonthDao) {
        this.bookOfTheMonthDao = bookOfTheMonthDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showHome(Model model) {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int calMonth = cal.get(Calendar.MONTH) + 1;

        RestBookDao bookDao = new RestBookDao();
        List<BookOfTheMonth> monthlyBooks = bookOfTheMonthDao.list(Integer.toString(calMonth));

        StringBuilder isbnBuilder = new StringBuilder();
        isbnBuilder.append("ISBN:");

        for (BookOfTheMonth monthlyBook : monthlyBooks) {
            isbnBuilder.append(monthlyBook.getIsbn()).append(",");
        }

        String isbnString = isbnBuilder.toString().substring(0, isbnBuilder.toString().length() - 1);

        List<Book> books = bookDao.list(isbnString);

        model.addAttribute("books", books);

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String getMonthlyBook(@PathVariable("id") String id, Model model) {
        RestBookDao bookDao = new RestBookDao();

        Book book = bookDao.find(id);

        model.addAttribute("book", book);

        return "monthly-books/view";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAboutUs()
    {
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contact")
    public String showContactUs()
    {
        return "contact";
    }
}