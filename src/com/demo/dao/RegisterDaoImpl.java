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
            "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,'已挂号')",
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
        Register register = new Register();
        try {
          register.setCaseNumber(rs.getString("case_number"));
          register.setRealName(rs.getString("real_name"));
          register.setIdnumber(rs.getString("idnumber"));
          register.setVisitDate(rs.getString("visit_date"));
          register.setHomeAddress(rs.getString("home_address"));
          register.setNoon(rs.getString("noon"));
          register.setDeptId(rs.getInt("dept_id"));
          register.setVisitState(rs.getString("visit_state"));
          register.setItem(rs.getString("item"));
          register.setPrice(rs.getInt("price"));
          register.setAmount(rs.getInt("amount"));
          register.setNote(rs.getString("note"));
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return register;
      }
    }, caseNumber);
  }

  @Override
  public int updateOne(String caseNumber) {
    return JdbcUtils.executeUpdate("UPDATE register SET visit_state='已退号' WHERE case_number=?",caseNumber);
  }

  @Override
  public int KaiYizhu(Register register) {


    return JdbcUtils.executeUpdate(
        "update register set item = ?,price=?,amount=?,note=?,time=now(),visit_state='医生接诊' where case_number=?",
        register.getItem(),
        register.getPrice(),
        register.getAmount(),
        register.getNote(),
        register.getCaseNumber()
        );
  }

  @Override
  public int shoufeila(String caseNumber) {
    return JdbcUtils.executeUpdate("UPDATE register SET visit_state='已收费' WHERE case_number=?",caseNumber);
  }

  @Override
  public int tuifeila(String caseNumber) {
    return JdbcUtils.executeUpdate("UPDATE register SET visit_state='已退费' WHERE case_number=?",caseNumber);
  }
}


