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

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeShouldContainLiteral() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",String.class)).contains("Login Form");
    }

    @Test
    public void formShouldContainLiteral() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",String.class)).contains("Username");
    }
}