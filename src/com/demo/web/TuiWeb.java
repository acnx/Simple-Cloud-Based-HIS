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
 * create 2020-05-15 13:43
 * 退号操作
 */
public class TuiWeb extends HttpServlet {
  private IregisterService service = new RegisterServiceImpl();
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int visitState = Integer.parseInt(req.getParameter("visitState"));
    System.out.println(visitState);
    if(visitState==1){
      String message=" <script> window.alert(\"已就医，不能退号\");</script>";
      req.setAttribute("mess",message);
      resp.sendRedirect("tuihao");
    }else {
      String caseNumber = req.getParameter("caseNumber");
      service.updateOne(caseNumber);
      resp.sendRedirect("tuihao");
    }

  }
}
