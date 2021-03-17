package com.skhu.skhuedIn.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeComtroller {

//Logger log = LoggerFactory.getLogger(getClass()); 이게 Slf4j

    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }

    //추가

}
