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
}
