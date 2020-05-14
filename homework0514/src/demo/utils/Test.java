package demo.utils;//package com.demo.utils;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
///**
// * author Jayce
// * create 2020-05-13 18:03
// */
//public class Test {
//  public static void main(String[] args) {
////
////   new jdbcUtils().execute("INSERT INTO `register` VALUES (null, '09455', '张三2055', '男', '142938199807012351', '2020-01-03', 15, 1, '河北省张家口市01区', '2020-05-03', '上午', 4, 23, 1, 1, 1, '2020-02-01 12:03:09', 34201,?);",2);
////    new jdbcUtils().execute("update `register` set case_number = ? where id = ?",9999999,2);
////    new jdbcUtils().execute("delete from register where id = ?",2);
//
//    jdbcUtils ju = new jdbcUtils();
//    List<Regester> regesters = ju.select("select * from register", new RowMap<Regester>() {
//      @Override
//      public Regester rowMapping(ResultSet rs){
//        Regester regester = new Regester();
//        try {
//
//          int id             =rs.getInt("id");
//          String caseNumber  =rs.getString("case_number");
//          String realName    =rs.getString("real_name");
//          String gender      =rs.getString("gender");
//          String idNumber    =rs.getString("idnumber");
//          String birthDate=rs.getString("birth_date");
//          int age            =rs.getInt("age");
//          int ageType        =rs.getInt("age_type");
//          String homeAddress =rs.getString("home_address");
//          String visitDate   =rs.getString("visit_date");
//          String noon        =rs.getString("noon");
//          int deptId         =rs.getInt("dept_id");
//          int userId         =rs.getInt("user_id");
//          int registLeid     =rs.getInt("regist_leid");
//          int settleId       =rs.getInt("settle_id");
//          int isBook         =rs.getInt("is_book");
//          /*mysql里面的datetime字段使用java的getString方法会有问题，先上课，后期解决*/
//          String registTime  =rs.getString("regist_time");
//          int registId       =rs.getInt("regist_id");
//          int visitState     =rs.getInt("visit_state");
//
//          regester.setId(id);
//          regester.setCaseNumber(caseNumber);
//          regester.setRealName(realName);
//          regester.setGender(gender);
//          regester.setIdNumber(idNumber);
//          regester.setBirthDate(birthDate);
//          regester.setAge(age);
//          regester.setAgeType(ageType);
//          regester.setHomeAddress(homeAddress);
//          regester.setVisitDate(visitDate);
//          regester.setNoon(noon);
//          regester.setDeptId(deptId);
//          regester.setUserId(userId);
//          regester.setRegistLeid(registLeid);
//          regester.setSettleId(settleId);
//          regester.setIsBook(isBook);
//          regester.setRegistTime(registTime);
//          regester.setRegistId(registId);
//          regester.setVisitState(visitState);
//
//
//        } catch (SQLException e) {
//          e.printStackTrace();
//        }
//        return regester;
//      }
//    },null);
//
//    for (Regester regester: regesters){
//      System.out.println(regester);
//    }
//
//
//
//  }
//
//
////  public  String toDateStr(Timestamp birthdayDate){
////    if(null!=birthdayDate){
////      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthdayDate);
////    }
////    return "";
////  }
//
//
//
//}
