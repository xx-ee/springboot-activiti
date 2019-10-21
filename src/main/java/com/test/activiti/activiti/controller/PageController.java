package com.test.activiti.activiti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 */
@Controller
public class PageController {
    @GetMapping("editor")
    public String test(){
        return "/modeler";
    }
}
