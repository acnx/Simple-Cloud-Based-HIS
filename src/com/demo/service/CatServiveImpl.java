package com.demo.service;

import com.demo.dao.CatDaoImpl;
import com.demo.dao.IcatDao;
import com.demo.pojo.Cat;

import java.util.List;

/**
 * author Jayce
 * create 2020-05-14 17:20
 */
public class CatServiveImpl implements IcatService {
  private IcatDao dao = new CatDaoImpl();
  @Override
  public List<Cat> getAll(){
    return dao.getAll();
  }
}
