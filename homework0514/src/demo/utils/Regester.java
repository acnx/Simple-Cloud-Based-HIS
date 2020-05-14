package demo.utils;

/**
 * author Jayce
 * create 2020-05-13 18:06
 */
public class Regester {


//
//  private Integer id;
//  private String name;

  private Integer id;
  private String caseNumber;
  private String realName;
  private String gender;
  private String idNumber;
  private String birthDate;
  private Integer age;
  private Integer ageType;
  private String homeAddress;
  private String visitDate;
  private String noon;
  private Integer deptId;
  private Integer userId;
  private Integer registLeid;
  private Integer settleId;
  private Integer isBook;
  private String registTime;
  private Integer registId;
  private Integer visitState;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCaseNumber() {
    return caseNumber;
  }

  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getAgeType() {
    return ageType;
  }

  public void setAgeType(Integer ageType) {
    this.ageType = ageType;
  }

  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }

  public String getVisitDate() {
    return visitDate;
  }

  public void setVisitDate(String visitDate) {
    this.visitDate = visitDate;
  }

  public String getNoon() {
    return noon;
  }

  public void setNoon(String noon) {
    this.noon = noon;
  }

  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRegistLeid() {
    return registLeid;
  }

  public void setRegistLeid(Integer registLeid) {
    this.registLeid = registLeid;
  }

  public Integer getSettleId() {
    return settleId;
  }

  public void setSettleId(Integer settleId) {
    this.settleId = settleId;
  }

  public Integer getIsBook() {
    return isBook;
  }

  public void setIsBook(Integer isBook) {
    this.isBook = isBook;
  }

  public String getRegistTime() {
    return registTime;
  }

  public void setRegistTime(String registTime) {
    this.registTime = registTime;
  }

  public Integer getRegistId() {
    return registId;
  }

  public void setRegistId(Integer registId) {
    this.registId = registId;
  }

  public Integer getVisitState() {
    return visitState;
  }

  public void setVisitState(Integer visitState) {
    this.visitState = visitState;
  }


  @Override
  public String toString() {
    return "Regester{" +
        "id=" + id +
        ", caseNumber='" + caseNumber + '\'' +
        ", realName='" + realName + '\'' +
        ", gender='" + gender + '\'' +
        ", idNumber='" + idNumber + '\'' +
        ", birthDate='" + birthDate + '\'' +
        ", age=" + age +
        ", ageType=" + ageType +
        ", homeAddress='" + homeAddress + '\'' +
        ", visitDate='" + visitDate + '\'' +
        ", noon='" + noon + '\'' +
        ", deptId=" + deptId +
        ", userId=" + userId +
        ", registLeid=" + registLeid +
        ", settleId=" + settleId +
        ", isBook=" + isBook +
        ", registTime='" + registTime + '\'' +
        ", registId=" + registId +
        ", visitState=" + visitState +
        '}';
  }
}
