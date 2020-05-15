package com.demo.dao;

import com.demo.pojo.Register;
import com.demo.utils.JdbcUtils;
import com.demo.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * author Jayce
 * create 2020-05-15 11:11
 */
public class RegisterDaoImpl implements IregisterDao  {
  @Override
  public int add(Register register) {
    return JdbcUtils.executeUpdate(
        "insert into register(case_number,real_name,birth_date)values(?,?,now())",
        register.getCaseNumber(),
        register.getRealName()
    );
  }

  @Override
  public Register getOne(String caseNumber) {
    return JdbcUtils.executeQuaryOne("select * from register where case_number = ?", new RowMap<Register>() {
      @Override
      public Register rowMapping(ResultSet rs) {
//        把表里数据全部获取

      Register register = new Register();

        try {

//          register.setIdNumber(caseNumber);
//          register.setHomeAddress(homeAddress);




          register.setRealName(rs.getString("real_name"));
          register.setHomeAddress(rs.getString("home_address"));
          register.setIdnumber(rs.getString("idnumber"));

          /*..................*/


        } catch (SQLException e) {
          e.printStackTrace();
        }


        return register;
      }
    }, caseNumber);
  }
}


