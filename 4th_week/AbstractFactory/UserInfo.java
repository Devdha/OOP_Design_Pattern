public class UserInfo {
    protected String userId;
    protected String userName;
    protected String passwd;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswd() {
        return passwd;
    }
}