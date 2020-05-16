package com.demo.service;

import com.demo.dao.IuserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.pojo.User;

/**
 * author Jayce
 * create 2020-05-16 10:24
 */
public class UserServiceImpl implements IuserService {
  private IuserDao dao = new UserDaoImpl();
  @Override
  public User getUser(String username, String password, Integer userType) {
    System.out.println(username +"+"+password+"+"+userType+"sevice");
    return dao.getUser(username,password,userType);
  }
}
