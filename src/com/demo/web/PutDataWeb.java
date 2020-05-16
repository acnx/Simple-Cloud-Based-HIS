package com.demo.web;

import com.demo.pojo.Register;
import com.demo.pojo.User;
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




    /*获取所有register.jsp表单提交的数据*/
    String caseNumber = req.getParameter("caseNumber");
    String realName = req.getParameter("realName");
    String gender = req.getParameter("gender");
    Integer age = Integer.parseInt(req.getParameter("age"));
    Integer ageType = Integer.parseInt(req.getParameter("ageType"));
    String birthDate = req.getParameter("birthDate");
    String homeAddress = req.getParameter("homeAddress");
    String idnumber = req.getParameter("idnumber");
    Integer settleId = Integer.parseInt(req.getParameter("settleId"));
    String visitDate = req.getParameter("visitDate");
    String noon = req.getParameter("noon");
    Integer deptId = Integer.parseInt(req.getParameter("deptId"));
    Integer registerLeid = Integer.parseInt(req.getParameter("registerLeid"));
    Integer userId = Integer.parseInt(req.getParameter("userId"));

    String isBook = req.getParameter("isBook") ;
    if(isBook==null){
      isBook="0";
    }
    Integer isbook = Integer.parseInt(isBook);

    Register register = new Register();


    register.setCaseNumber(caseNumber);
    register.setRealName(realName);
    register.setGender(gender);
    register.setAge(age);
    register.setAgeType(ageType);
    register.setBirthDate(birthDate);
    register.setHomeAddress(homeAddress);
    register.setIdnumber(idnumber);
    register.setSettleId(settleId);
    register.setVisitDate(visitDate);
    register.setNoon(noon);
    register.setDeptId(deptId);
    register.setRegistLeid(registerLeid);
    register.setUserId(userId);
    register.setIsBook(isbook);


//    System.out.println(register);



    int a = service.add(register);

    User user = (User) req.getSession().getAttribute("sessionuser");
//    System.out.println(user.getId());
    /*有了挂号员id 可以插入到user表*/

    /*session是用来  状态管理的 Http是无状态协议*/


    resp.sendRedirect("register");

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



  }

}
