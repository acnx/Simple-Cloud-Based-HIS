package com.demo.pojo;

/**
 * author Jayce
 * create 2020-05-16 8:24
 * user表实体类
 */
public class User {
  private Integer id;
  private String username;
  private String password;
  private Integer userType;
  private String realName;
  private  Integer docTitleId;
  private String isScheduling;
  private Integer deptId;
  private Integer registLeid;
  private Integer delMark;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public Integer getDocTitleId() {
    return docTitleId;
  }

  public void setDocTitleId(Integer docTitleId) {
    this.docTitleId = docTitleId;
  }

  public String getIsScheduling() {
    return isScheduling;
  }

  public void setIsScheduling(String isScheduling) {
    this.isScheduling = isScheduling;
  }

  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public Integer getRegistLeid() {
    return registLeid;
  }

  public void setRegistLeid(Integer registLeid) {
    this.registLeid = registLeid;
  }

  public Integer getDelMark() {
    return delMark;
  }

  public void setDelMark(Integer delMark) {
    this.delMark = delMark;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", userType=" + userType +
        ", realName='" + realName + '\'' +
        ", docTitleId=" + docTitleId +
        ", isScheduling='" + isScheduling + '\'' +
        ", deptId=" + deptId +
        ", registLeid=" + registLeid +
        ", delMark=" + delMark +
        '}';
  }
}
