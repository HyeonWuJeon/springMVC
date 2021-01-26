package me.hyeonwoo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//자바 설정파일
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class)) // service 만 등록한다.
public class AppConfig {

}
