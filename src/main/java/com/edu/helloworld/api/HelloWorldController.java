/*
 * (C) Copyright 2022 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Oct 30, 2022
 * @Version 1.0
 */
package com.edu.helloworld.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "index.html";
    }
}
