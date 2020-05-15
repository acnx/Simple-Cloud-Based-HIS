package com.demo.dao;

import com.demo.pojo.Register;

/**
 * author Jayce
 * create 2020-05-15 11:09
 */
public interface IregisterDao{
  public  int add(Register register);
  public Register getOne(String caseNumber);
}
