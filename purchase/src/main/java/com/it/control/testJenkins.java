package com.it.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testJenkins {
    @RequestMapping("/purchase")
    @ResponseBody
    public String test() {
        return "ni hao ";
    }
}
