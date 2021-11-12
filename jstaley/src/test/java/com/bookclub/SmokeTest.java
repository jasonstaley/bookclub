/*
Student:	    Jason Staley
Date: 		    11/12/2021
Assignment: 	11.2 – Unit Tests in Action
File Name: 	    SmokeTest.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021

Source code retrieved from: https://spring.io/guides/gs/testing-web/
*/
package com.bookclub;
import com.bookclub.web.HomeController;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}