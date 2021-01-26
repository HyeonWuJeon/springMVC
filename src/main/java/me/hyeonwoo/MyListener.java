package me.hyeonwoo;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// 서블릿 컨텍스트 이벤트
// 세션 수준의 이벤트
public class MyListener implements ServletContextListener {
    //컨텍스트 초기화
    // 리스너 , 공통적으로 사용할 객체를 넣어둔다.
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name", "hyeonwoo");
    }

    //종료 servlet -> context
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context Destroyed");
    }
}
