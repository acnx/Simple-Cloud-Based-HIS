package com.demo.util;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * author Jayce
 * create 2020-05-13 18:06
 */
public class jdbcUtils {
  private static final String url = "jdbc:mysql://localhost:3306/his?useUnicode=true&characterEncoding=utf8";
  private static final String user = "root";
  private static final String pwd = "root";

  public Connection con = null;
  public PreparedStatement ps = null;
  public ResultSet rs = null;

  static {
    // 使用jar包加载驱动
    try {
      new Driver();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public Connection getConnection() {
    try {
      con = DriverManager.getConnection(url, user, pwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;

  }


  public void close() {
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
  public void execute(String sql, Object... obj) {

    try {

      con = getConnection();
      ps = con.prepareStatement(sql);
      for (int i = 0; i < obj.length; i++) {
        ps.setObject(i + 1, obj[i]);
      }

      int result = ps.executeUpdate();
      System.out.println(result);

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.close();
    }


  }


  //    public <T> void select(String sql,RowMap<T> rowMap, Object...obj) {
  public <T> List<T> select(String sql, RowMap<T> rowMap, Object... obj) {
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
      this.close();
    }
    return lists;
  }


}
