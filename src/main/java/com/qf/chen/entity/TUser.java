package com.sample;


public class TUser {

  private String id;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp expireDate;
  private long isVip;
  private String userEmail;
  private String userName;
  private String userPasswd;
  private long isManager;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(java.sql.Timestamp expireDate) {
    this.expireDate = expireDate;
  }


  public long getIsVip() {
    return isVip;
  }

  public void setIsVip(long isVip) {
    this.isVip = isVip;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPasswd() {
    return userPasswd;
  }

  public void setUserPasswd(String userPasswd) {
    this.userPasswd = userPasswd;
  }


  public long getIsManager() {
    return isManager;
  }

  public void setIsManager(long isManager) {
    this.isManager = isManager;
  }

}
