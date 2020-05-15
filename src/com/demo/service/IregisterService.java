package com.demo.service;

import com.demo.pojo.Register;

/**
 * author Jayce
 * create 2020-05-15 11:20
 */
public interface IregisterService {
  public int add(Register register);
  public  Register getOne(String caseNumber);
  public int updateOne(String caseNumber);
  public int KaiYizhu(Register register);
  public int shoufeila(String caseNumber);
  public int tuifeila(String caseNumber);

}
