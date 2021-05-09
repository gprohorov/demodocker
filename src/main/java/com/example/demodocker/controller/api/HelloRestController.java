package com.example.demodocker.controller.api;/*
  @author   george
  @project   demodocker
  @class  com.example.demodocker.controller.api.HelloRestController
  @version  1.0.0 
  @since 09.05.2021 - 11.25
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/hello")
    String getHello(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return "<h1> Hello Docker! </h1>";
    }

}
