package com.biernacki.myspringexample.controler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControler {

    private static final Logger logger = LoggerFactory.getLogger(HelloControler.class);

    @GetMapping("/hello")
    public ModelAndView myfirstview(ModelAndView modelAndView, @RequestParam(defaultValue = "milosz") String name)
    {

        logger.info("name: {}",name);

        modelAndView.addObject("user",name);
        modelAndView.setViewName("home");
        return modelAndView;
    }

}
