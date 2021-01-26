package me.hyeonwoo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 서블릿
 * 요청 당 쓰레드를 만들어서 사용( 쓰레드 풀 )
 * CGI(Common Gateway Interface)
 * 요청당 프로세스를 만들어서 사용
 */

/**
 * 서블릿 생명주기
 * 1. init() : 최초요청을 서블릿 컨테이너가 받으면 서블릿 인스턴스를 생성 후 한번만 서블릿을 초기화한다. ( 웜업 )
 * 2. doget() : 요청(get, post, delete ,put) 을 처리하는 메소드를 호출한다. 재 요청이 들어오면 이미 서블릿이 메모리에 올려져 있기 때문에
 * init() 함수는 호출하지 않고 doget() 함수만 호출한다.
 * 3. destroy() : 서블릿 컨테이너 판단에 따라 해당 서블릿을 메모리에 내려야할 시점에 destroy() 함수를 호출한다.
 */
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException{
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.getWriter().write("hello Servlet");
    }

    @Override
    public void destroy(){
        System.out.println("destory");
    }
}
