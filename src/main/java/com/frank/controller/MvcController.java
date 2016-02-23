package com.frank.controller;

import com.frank.entity.Person;
import com.frank.service.MvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyan on 2016/2/23.
 */
@Controller
@RequestMapping("/mvc")
public class MvcController {
    @Autowired
    private MvcService mvcService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/person")
    public String toPerson(String name,double age){
        System.out.println(name+" "+age);
        return "hello";
    }

    @RequestMapping("/show")
    public String showPerson(Model model){
        Person person = mvcService.show();

        model.addAttribute("person",person);
        return "person";
    }
}
