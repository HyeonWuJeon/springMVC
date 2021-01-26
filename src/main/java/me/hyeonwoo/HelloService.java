package me.hyeonwoo;

import org.springframework.stereotype.Service;

/**
 * ContextLoadListener : ApplicationContext
 */
@Service
public class HelloService {

    public String getName(){
        return "notion.hyeonwoo.ml";
    }
}
