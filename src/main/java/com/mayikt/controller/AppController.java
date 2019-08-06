package com.mayikt.controller;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨星宇
 * @version V1.0
 * @Package com.mayikt.controller
 * @date 2019/8/6 10:54
 * @Copyright
 */
@SpringBootApplication
@RestController
public class AppController {

    @RequestMapping("/")
    public String index(){
        return "dddddddddddd";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppController.class,args);
    }
}
