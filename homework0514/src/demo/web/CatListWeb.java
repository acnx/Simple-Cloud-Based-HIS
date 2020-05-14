package demo.web;


import com.demo.pojo.Cat;
import com.demo.service.CatServiveImpl;
import com.demo.service.IcatService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * author Jayce
 * create 2020-05-14 17:23
 */
public class CatListWeb extends HttpServlet {
  private IcatService service = new CatServiveImpl();
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Cat> cats = service.getAll();
    req.setAttribute("cats",cats);
    req.getRequestDispatcher("cats.jsp").forward(req,resp);
  }
}
