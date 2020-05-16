package com.demo.utils;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * author Jayce
 * create 2020-05-13 18:06
 */
public class JdbcUtils {
  private static final String url = "jdbc:mysql://localhost:3306/yhis?useUnicode=true&characterEncoding=utf8";
  private static final String user = "root";
  private static final String pwd = "root";

  private Connection con = null;
  private PreparedStatement ps = null;
  private ResultSet rs = null;

  static {
//    // 使用jar包加载驱动
//    try {
//      new Driver();
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }


    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

  public static Connection getConnection() {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection(url, user, pwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;

  }


  public static void close() {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      if (rs != null) {
        rs.close();
      }
      if (ps != null) {
        ps.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  /*
   * 增删改：只有sql语句不同
   * 方法的通用性
   *
   * */
  public static int executeUpdate(String sql, Object... obj) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    int result = 0;
    try {

      con = getConnection();
      ps = con.prepareStatement(sql);
      for (int i = 0; i < obj.length; i++) {
        ps.setObject(i + 1, obj[i]);
      }

      result = ps.executeUpdate();
      System.out.println(result);

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close();
    }
  return result;

  }





  //    public <T> void select(String sql,RowMap<T> rowMap, Object...obj) {
  public static  <T> List<T> executeQuary(String sql, RowMap<T> rowMap, Object... obj) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    List<T> lists = new ArrayList<T>();
    try {
//          连接
      con = getConnection();
      ps = con.prepareStatement(sql);
      if (obj != null) {
        for (int i = 0; i < obj.length; i++) {
          ps.setObject(i + 1, obj[i]);
        }
      }
//          执行
      rs = ps.executeQuery();
      while (rs.next()) {
        T t = rowMap.rowMapping(rs);
        lists.add(t);
      }
    } catch (
        SQLException e) {
      e.printStackTrace();
    } finally {
      close();
    }
    return lists;
  }

  //    public <T> void select(String sql,RowMap<T> rowMap, Object...obj) {
  public static  <T> T executeQuaryOne(String sql, RowMap<T> rowMap, Object... obj) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    T t = null;
    try {
//          连接
      con = getConnection();
      ps = con.prepareStatement(sql);
      if (obj != null) {
        for (int i = 0; i < obj.length; i++) {
          ps.setObject(i + 1, obj[i]);
        }
      }
//          执行
      rs = ps.executeQuery();
      while (rs.next()) {
        t = rowMap.rowMapping(rs);
      }
    } catch (
        SQLException e) {
      e.printStackTrace();
    } finally {
      close();
    }
    return t;
  }



}
