package com.demo.web;

import com.demo.pojo.Register;
import com.demo.service.IregisterService;
import com.demo.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-15 22:30
 */
public class YiZhuWeb extends HttpServlet {
  private IregisterService service = new RegisterServiceImpl();
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    /*获取所有jz.jsp表单提交的数据*/
    String caseNumber=req.getParameter("caseNumber");
    String item = req.getParameter("item");
    Integer price = Integer.parseInt(req.getParameter("price"));
    Integer amount = Integer.parseInt(req.getParameter("amount"));
    String note = req.getParameter("note");


    Register register = new Register();


    register.setCaseNumber(caseNumber);
    register.setItem(item);
    register.setPrice(price);
    register.setAmount(amount);
    register.setNote(note);


    service.KaiYizhu(register);
//    System.out.println(a);
    resp.sendRedirect("jiezhen");

//    把获取到的表单上的值赋给对象
//
//
////  挂号时间
//
//
//    String data = req.getParameter("birthDate");
//    String visitDate = req.getParameter("visitDate");
////    System.out.println(data);
////    System.out.println(visitDate);
//
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//    try {
//      Date d = sdf.parse(data);
////      System.out.println(d);
//    } catch (ParseException e) {
//      e.printStackTrace();
//    }
//
//
//    /*checkbox*/
//
//    String isBook = req.getParameter("isBook") ;
//    if(isBook==null){
//      isBook="0";
//    }
//
//    Integer isbook = Integer.parseInt(isBook);
//
//    System.out.println(isbook);
//    req.getRequestDispatcher("jz.jsp").forward(req,resp);

  }
}
