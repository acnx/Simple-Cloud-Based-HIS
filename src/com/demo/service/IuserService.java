package com.demo.service;

import com.demo.pojo.User;

/**
 * author Jayce
 * create 2020-05-16 10:23
 */
public interface IuserService {
  public User getUser(String username, String password, Integer userType);
}
