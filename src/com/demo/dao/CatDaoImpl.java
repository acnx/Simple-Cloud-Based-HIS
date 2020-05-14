package com.demo.dao;


import com.demo.pojo.Cat;
import com.demo.utils.JdbcUtils;
import com.demo.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * author Jayce
 * create 2020-05-14 16:46
 */
public class CatDaoImpl implements IcatDao {


  @Override
  public List<Cat> getAll() {
    return JdbcUtils.select("select * from cat", new RowMap<Cat>() {
      @Override
      public Cat rowMapping(ResultSet rs){
        Cat cat = new Cat();
        try {
          cat.setId(rs.getInt("id"));
          cat.setName(rs.getString("name"));
        } catch (SQLException e) {
          e.printStackTrace();
        }


        return cat;
      }


    }, null);
  }
}

