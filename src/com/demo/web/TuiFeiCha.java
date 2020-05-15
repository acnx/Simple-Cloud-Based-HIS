package com.demo.web;

import com.demo.pojo.Register;
import com.demo.service.IregisterService;
import com.demo.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * author Jayce
 * create 2020-05-15 20:05
 */
public class TuiFeiCha extends HttpServlet {
  private IregisterService service = new RegisterServiceImpl();

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String caseNumber = req.getParameter("caseNumber");
//    System.out.println(caseNumber);
    Register register = service.getOne(caseNumber);
    req.setAttribute("reg",register);
    req.getRequestDispatcher("tf.jsp").forward(req,resp);
  }
}
