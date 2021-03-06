package com.demo.web;

import com.demo.service.IregisterService;
import com.demo.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-15 23:50
 * 点击退费按钮
 */
public class TuiFeiLaWeb extends HttpServlet {
  private IregisterService service=new RegisterServiceImpl();
  @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String caseNumber = req.getParameter("caseNumber");
//    System.out.println(caseNumber);
      service.tuifeila(caseNumber);
      resp.sendRedirect("shoufei");
    }
}
