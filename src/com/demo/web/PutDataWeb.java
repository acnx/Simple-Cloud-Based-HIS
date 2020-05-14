package com.demo.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-14 19:04
 */
public class PutDataWeb extends HttpServlet {

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    System.out.println("执行了");
    String caseNumber = req.getParameter("caseNumber");
    Integer age = Integer.parseInt(req.getParameter("age"));
    System.out.println(caseNumber);
    System.out.println(age);



    resp.sendRedirect("register");


  }

}
