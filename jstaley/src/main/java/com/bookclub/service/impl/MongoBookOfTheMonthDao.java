/*
Student:	    Jason Staley
Date: 		    11/2/2021
Assignment: 	10.2 – Authorization in Action
File Name: 	    MongoBookOfTheMonthDao.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/
package com.bookclub.service.impl;

import com.bookclub.model.BookOfTheMonth;
import com.bookclub.service.dao.BookOfTheMonthDao;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookOfTheMonthDao")
public class MongoBookOfTheMonthDao implements BookOfTheMonthDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void add(BookOfTheMonth entity) {
        mongoTemplate.save(entity);
    }

    @Override
    public void update(BookOfTheMonth entity) {
        throw new NotImplementedException();
    }

    @Override
    public boolean remove(String key) {
        Query query = new Query();

        query.addCriteria(Criteria.where("id").is(key));

        mongoTemplate.remove(query, BookOfTheMonth.class);

        return true;
    }

    @Override
    public List<BookOfTheMonth> list(String key) {
        int month = Integer.parseInt(key);

        System.out.println("Month: " + month);

        if (month == 999) {
            return mongoTemplate.findAll(BookOfTheMonth.class);
        }

        Query query = new Query();

        query.addCriteria(Criteria.where("month").is(month));

        return mongoTemplate.find(query, BookOfTheMonth.class);
    }

    @Override
    public BookOfTheMonth find(String key) {
        throw new NotImplementedException();
    }
}