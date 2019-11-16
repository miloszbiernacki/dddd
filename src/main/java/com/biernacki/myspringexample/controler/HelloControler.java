package com.biernacki.myspringexample.controler;


import com.biernacki.myspringexample.domain.User;
import com.biernacki.myspringexample.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloControler
{

    private static final Logger logger = LoggerFactory.getLogger(HelloControler.class);
    private UserService userservice;

    @Autowired
    public HelloControler(UserService userservice) {
        this.userservice = userservice;
    }

    @GetMapping("/hello")
    public ModelAndView myfirstview(ModelAndView modelAndView, @RequestParam(defaultValue = "milosz") String name)
    {

        logger.info("name: {}",name);
        modelAndView.addObject("user",name);
        modelAndView.setViewName("home");
        return modelAndView;
    }


    @GetMapping("/dane")
    public ModelAndView my2(ModelAndView modelAndView,
                            @RequestParam(value = "imie" , defaultValue = "mil") String name,
                            @RequestParam(value = "nazwisko", defaultValue = "biei") String surname  ,
                            @RequestParam(value = "wiek", defaultValue = "15") String wiek   )
    {
        logger.info("name: {}",name);
        logger.info("nazwisko: {}",surname);
        logger.info("wiek: {}",wiek);

        modelAndView.addObject("user",name);
        modelAndView.addObject("nazwisko",surname);
        modelAndView.addObject("wiek",wiek);
        modelAndView.setViewName("dane");
        return modelAndView;
    }

    @GetMapping("/users")
    ModelAndView readAllUsers(ModelAndView modelAndView){

        List<User> users = userservice.getAllUsers();
        logger.info("users from db: [{}]",users);

        modelAndView.addObject("allUsers",users);
        modelAndView.addObject("old","empty");

        modelAndView.setViewName("home/users");
        return modelAndView;


    }



}
