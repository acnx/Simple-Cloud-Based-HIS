package com.demo.web;

import javafx.print.Printer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * author Jayce
 * create 2020-05-14 12:05
 */
public class TestWeb extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    System.out.println("...TestWeb中的代码被执行了 ...");

    PrintWriter pw = resp.getWriter();
    pw.print("success 成功");
    pw.print("<div style='background:blue'>success 成功</div>");





  }
}
