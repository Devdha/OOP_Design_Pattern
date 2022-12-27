public class UserInfo {
  private String userId;
  private String passwd;
  private String userName;
  private UserInfoDao dao;

  public UserInfo(int dbType, String userId, String passwd, String userName) {
    switch (dbType) {
      case 0:
        dao = new UserInfoMySqlDao();
        break;
      case 1:
        dao = new UserInfoMsSqlDao();
        break;
      case 2:
        dao = new UserInfoOracleDao();
        break;
    }

    this.userId = userId;
    this.passwd = passwd;
    this.userName = userName;

    dao.insert("userId", userId);
    dao.insert("passwd", passwd);
    dao.insert("userName", userName);
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
    dao.update("userId", userId);
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
    dao.update("passwd", passwd);
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
    dao.update("userName", userName);

  }
}