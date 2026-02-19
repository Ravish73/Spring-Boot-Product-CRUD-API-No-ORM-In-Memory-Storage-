package com.MySpringProject.WebApp.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{   @RequestMapping("/home")

    public  String greet()
    {
        System.out.println("i am here");
        return "Hii King";
    }
    @RequestMapping("/about")
    public String about (){
    return  "I Win I Win thats my job Thats what i do";
    }
}
