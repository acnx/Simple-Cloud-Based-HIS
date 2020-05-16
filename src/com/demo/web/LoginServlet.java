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
    /**/
    if (user==null){
      String message="输入有误，请重新输入";
      req.setAttribute("mess",message);
      req.getRequestDispatcher("index.jsp").forward(req,resp);

    }else {
//      user_type 管理员
//      del_mark 该用户不存在
      req.setAttribute("user",user);
      HttpSession session = req.getSession();

      req.getRequestDispatcher("main.jsp").forward(req,resp);

    }






  }
}
