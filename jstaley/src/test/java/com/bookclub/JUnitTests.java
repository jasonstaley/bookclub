/*
Student:	    Jason Staley
Date: 		    11/12/2021
Assignment: 	11.2 – Unit Tests in Action
File Name: 	    HttpRequestTest.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R., Krasso, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021

Source code retrieved from: https://spring.io/guides/gs/testing-web/
*/
package com.bookclub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.bookclub.service.dao.WishlistDao;
import com.bookclub.web.WishlistController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JUnitTests {

    @Autowired
    private WishlistController controller;

    @MockBean
    private WishlistDao wishlistDao;

    //Example only
    @Test
    public void test_example(){
        String str1 = "JUnit test";
        assertEquals("JUnit test", str1 );
    }

    //Actual tests
    @Test
    public void testWLD(){
        WishlistController wlc = new WishlistController();
        System.out.println("JUnit test for showWishlist test 1");
        assertEquals("testing showWishlist method", false, wlc.showWishlist().isBlank());
    }

    @Test
    public void testWLD2(){
        WishlistController wlc2 = new WishlistController();
        System.out.println("JUnit test for showWishlist test 2");
        assertEquals("testing showWishlist method", false, wlc2.showWishlist().isEmpty());
    }

    @Test
    public void testWLD3(){
        WishlistController wlc3 = new WishlistController();
        System.out.println("JUnit test for showWishlist test 3");
        assertEquals("testing showWishlist method", false, wlc3.equals(null));
    }
}
