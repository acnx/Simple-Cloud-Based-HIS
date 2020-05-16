package com.demo.dao;

import com.demo.pojo.User;
import com.demo.utils.JdbcUtils;
import com.demo.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * author Jayce
 * create 2020-05-16 10:08
 */
public class UserDaoImpl implements IuserDao {

  @Override
  public User getUser(String username, String password, Integer userType) {
    System.out.println(username +"+"+password+"+"+userType+"dao");
    return JdbcUtils.executeQuaryOne("select * from user where username=? and password=? and user_type=?", new RowMap<User>() {
      @Override
      public User rowMapping(ResultSet rs) {
        User user = new User();
        try {
          user.setId(rs.getInt("id"));
          user.setUsername(username);
          user.setPassword(password);
          user.setRealName(rs.getString("real_name"));
          user.setUserType(userType);
          user.setDocTitleId(rs.getInt("doc_title_id"));
          user.setIsScheduling(rs.getString("is_scheduling"));
          user.setDeptId(rs.getInt("dept_id"));
          user.setRegistLeid(rs.getInt("regist_le_id"));
          user.setDelMark(rs.getInt("del_mark"));



        } catch (SQLException e) {
          e.printStackTrace();
        }
        return user;
      }
    }, username, password, userType);
  }
}
