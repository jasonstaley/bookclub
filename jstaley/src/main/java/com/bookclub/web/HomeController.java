package com.bookclub.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Student:	    Jason Staley
Date: 		    9/9/2021
Assignment: 	2.2 - Controller Aspects and Navigation
File Name: 	    HomeController.java

University:	    Bellevue University
Class:		    CIS530-T301 Server-Side Development (2221-1)
Professor: 	    Richard Lomax

Citations:
Lomax, R. (2021). CIS 530 Server-Side Development. Bellevue University.
Modified by J. Staley 2021
*/

@Controller
@RequestMapping("/")

public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String showHome(Model model)
    {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAboutUs(Model model)
    {
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path =  "/contact")
    public  String showContactUs(Model model)
    {
        return "contact";
    }
}
