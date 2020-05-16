package com.demo.dao;

import com.demo.pojo.User;

/**
 * author Jayce
 * create 2020-05-16 10:07
 */
public interface IuserDao {
  public User getUser(String username,String password,Integer userType);
}
