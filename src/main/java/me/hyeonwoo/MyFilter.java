package me.hyeonwoo;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(servletRequest,servletResponse); // 필터를 서블릿에 연결시킨다. request, response
    }

    // servlet -> filter -> context
    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
