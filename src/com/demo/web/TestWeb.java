package com.demo.web;

import com.demo.pojo.Stu;

import javafx.print.Printer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * author Jayce
 * create 2020-05-14 12:05
 */
public class TestWeb extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
//    System.out.println("...TestWeb中的代码被执行了 ...");
//
//    PrintWriter pw = resp.getWriter();
//    pw.print("success 成功");
//    pw.print("<div style='background:blue'>success 成功</div>");

//    req.setAttribute("data","测试数据");
//
//    List<String> lists = new ArrayList<>();
//    for (int i = 0;i<=20;i++){
//      lists.add("abc"+i);
//    }


    List<Stu> lists = new ArrayList<>();
    for (int i =0;i<20;i++){
      Stu stu = new Stu();
      stu.setSno(i);
      stu.setName("abc"+i);
      stu.setHeight(i+100);
      lists.add(stu);
    }


    req.setAttribute("data",lists);

    req.getRequestDispatcher("test.jsp").forward(req,resp);



  }
}
