package com.demo.pojo;

/**
 * author Jayce
 * create 2020-05-14 16:32
 */
public class Stu {
  private Integer sno;
  private String name;
  private Integer height;

  public Integer getSno() {
    return sno;
  }

  public void setSno(Integer sno) {
    this.sno = sno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public String toString() {
    return "stu{" +
        "sno=" + sno +
        ", name='" + name + '\'' +
        ", height=" + height +
        '}';
  }
}
