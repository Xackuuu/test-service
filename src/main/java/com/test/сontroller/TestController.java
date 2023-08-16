package com.test.сontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RestController
public class TestController {

    @GetMapping("/test")
    public void getTestData() {
        System.out.println(new Date());
    }
}
