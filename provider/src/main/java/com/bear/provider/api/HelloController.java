package com.bear.provider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: provider
 * @description:
 * @author: Bear
 * @create: 2022-08-30 16:17
 **/
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }
}
