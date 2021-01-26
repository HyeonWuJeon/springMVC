package me.hyeonwoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Dispatcher servlet : WebApplicationContext
 */
@RestController  // 모든 함수에 + @ResponseBody
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello, " + service.getName();
    }
}
