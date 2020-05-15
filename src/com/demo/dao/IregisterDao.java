package com.demo.dao;

import com.demo.pojo.Register;

/**
 * author Jayce
 * create 2020-05-15 11:09
 */
public interface IregisterDao{
  public  int add(Register register);
  public Register getOne(String caseNumber);
  public int updateOne(String caseNumber);
  public int KaiYizhu(Register register);
  public int shoufeila(String caseNumber);
  public int tuifeila(String caseNumber);
}
