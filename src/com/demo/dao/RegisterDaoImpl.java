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
        "insert into register" +
            "(case_number,real_name,gender,age,age_type,birth_date,home_address,idnumber,settle_id," +
            "visit_date,noon,dept_id,regist_leid,user_id,is_book,visit_state)values" +
            "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,1)",
        register.getCaseNumber(),
        register.getRealName(),
        register.getGender(),
        register.getAge(),
        register.getAgeType(),
        register.getBirthDate(),
        register.getHomeAddress(),
        register.getIdnumber(),
        register.getSettleId(),
        register.getVisitDate(),
        register.getNoon(),
        register.getDeptId(),
        register.getRegistLeid(),
        register.getUserId(),
        register.getIsBook()
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



          register.setCaseNumber(rs.getString("case_number"));
          register.setRealName(rs.getString("real_name"));
          register.setHomeAddress(rs.getString("home_address"));
          register.setIdnumber(rs.getString("idnumber"));
          register.setVisitState(rs.getInt("visit_state"));

          /*..................*/


        } catch (SQLException e) {
          e.printStackTrace();
        }


        return register;
      }
    }, caseNumber);
  }

  @Override
  public int updateOne(String caseNumber) {
//    System.out.println("2321312321321321321321321");
//    System.out.println("12345678"+caseNumber+"321414124");
    return JdbcUtils.executeUpdate("UPDATE register SET visit_state=4 WHERE case_number=?",caseNumber);
//    return 0;
  }
}


