package com.demo.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-15 10:58
 * 编码转换
 */
public class EncodingFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    servletRequest.setCharacterEncoding("utf-8");
    filterChain.doFilter(servletRequest,servletResponse);
  }

  @Override
  public void destroy() {

  }
}
