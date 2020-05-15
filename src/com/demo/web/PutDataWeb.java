package com.demo.web;

import com.demo.pojo.Register;
import com.demo.service.IregisterService;
import com.demo.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * author Jayce
 * create 2020-05-14 19:04
 */
public class PutDataWeb extends HttpServlet {
  private IregisterService service = new RegisterServiceImpl();

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {







//    System.out.println("执行了");
    String caseNumber = req.getParameter("caseNumber");
    String realName = req.getParameter("realName");
//    Integer age = Integer.parseInt(req.getParameter("age"));
//    System.out.println(caseNumber);
////    System.out.println(age);
//    System.out.println(realName);
//    在这添加所有register表单提交的数据

    Register register = new Register();
    register.setCaseNumber(caseNumber);
    register.setRealName(realName);
//    把获取到的表单上的值赋给对象


//  挂号时间


    String data = req.getParameter("birthDate");
    String visitDate = req.getParameter("visitDate");
//    System.out.println(data);
//    System.out.println(visitDate);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
      Date d = sdf.parse(data);
//      System.out.println(d);
    } catch (ParseException e) {
      e.printStackTrace();
    }


    /*checkbox*/

    String isBook = req.getParameter("isBook") ;
    if(isBook==null){
      isBook="0";
    }

    Integer isbook = Integer.parseInt(isBook);

    System.out.println(isbook);

    int a = service.add(register);

//    System.out.println(a);
    resp.sendRedirect("register");


  }

}
