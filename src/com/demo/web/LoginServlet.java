package com.demo.web;

import com.demo.pojo.User;
import com.demo.service.IuserService;
import com.demo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * author Jayce
 * create 2020-05-16 8:22
 * 登录验证 servlet
 */
public class LoginServlet extends HttpServlet {
  private IuserService service = new UserServiceImpl();
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    Integer userType = Integer.parseInt(req.getParameter("userType"));
    System.out.println(username +"+"+password+"+"+userType);
    /*根据用户名密码数据库查询*/
    User user = service.getUser(username,password,userType);

    System.out.println(user);
    /*判断用户*/
    if (user==null){
      String message=" <script> window.alert(\"输入有误，请重新输入\");</script>";
      req.setAttribute("mess",message);
      req.getRequestDispatcher("index.jsp").forward(req,resp);

    }else {

//      user_type 管理员
//      del_mark 该用户不存在

      /*根据delmark判断状态*/
      if(user.getDelMark() == 0)
      {
        String message=" <script> window.alert(\"用户信息已失效，请联系管理员\");</script>";
        req.setAttribute("mess",message);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

      }
      System.out.println(user.getUserType());

      /*判断用户类型*/
//      if(user.getUserType()==1){
//        String message=" <script>\n" +
//            "          window.alert(\"尊敬的管理员用户，登录成功！\");\n" +
//            "\n" +
//            "      </script>";
//
//        req.setAttribute("mess",message);
//
//      }

      req.setAttribute("user",user);

      if(user.getUserType()==1){
        String userTypeto = "管理员";
        req.setAttribute("userType",userTypeto);
      }else if(user.getUserType()==2){
        String userTypeto = "挂号员";
        req.setAttribute("userType",userTypeto);
      }else if(user.getUserType()==3){
        String userTypeto = "医生";
        req.setAttribute("userType",userTypeto);
      }

//      req.setAttribute("userType",userType);
//      HttpSession session = req.getSession();
//      session.setAttribute("sessionuser",user);
      req.getRequestDispatcher("main").forward(req,resp);

    }

  }
}
