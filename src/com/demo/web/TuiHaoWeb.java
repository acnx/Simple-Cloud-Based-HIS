package com.demo.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-15 13:54
 * 跳转th.jsp
 */
public class TuiHaoWeb extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("th.jsp").forward(req,resp);
  }
}
