package com.demo.service;

import com.demo.dao.IregisterDao;
import com.demo.dao.RegisterDaoImpl;
import com.demo.pojo.Register;

/**
 * author Jayce
 * create 2020-05-15 11:23
 */
public class RegisterServiceImpl implements IregisterService {
  private IregisterDao dao = new RegisterDaoImpl();
  @Override
  public int add(Register register) {

    return dao.add(register);
  }

  @Override
  public Register getOne(String caseNumber) {
    return dao.getOne(caseNumber);
  }

  @Override
  public int updateOne(String caseNumber) {
    return dao.updateOne(caseNumber);
  }

  @Override
  public int KaiYizhu(Register register) {
    return dao.KaiYizhu(register);
  }

  @Override
  public int shoufeila(String caseNumber) {
    return dao.shoufeila(caseNumber);
  }

  @Override
  public int tuifeila(String caseNumber) {
    return dao.tuifeila(caseNumber);
  }

}

