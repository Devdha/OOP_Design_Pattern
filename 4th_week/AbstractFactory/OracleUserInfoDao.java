public class OracleUserInfoDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB UserID = " + userInfo.getUserId());
    }
    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB UserID = " + userInfo.getUserId());
    }
    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB UserID = " + userInfo.getUserId());
    }
}