package com.demo.dao;

import com.demo.pojo.Register;
import com.demo.utils.JdbcUtils;

/**
 * author Jayce
 * create 2020-05-15 11:11
 */
public class RegisterDaoImpl implements IregisterDao  {
  @Override
  public int add(Register register) {
    return JdbcUtils.executeQuery(
        "insert into register(case_number,real_name)values(?,?)",
        register.getCaseNumber(),
        register.getRealName());
  }
}
