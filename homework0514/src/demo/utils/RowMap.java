package demo.utils;

import java.sql.ResultSet;

/**
 * author Jayce
 * create 2020-05-13 19:18
 * 泛型接口
 * 只能写一个方法
 */
public interface RowMap<T> {
  public T rowMapping(ResultSet rs);

}
