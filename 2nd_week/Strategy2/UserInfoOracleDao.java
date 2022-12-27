public class UserInfoOracleDao implements UserInfoDao {
  public void insert(String key, String value) {
    System.out.println("insert into ORACLE DB " + key + " = " + value);
  }

  public void update(String key, String value) {
    System.out.println("update into ORACLE DB " + key + " = " + value);
  }

  public void delete(String key, String value) {
    System.out.println("delete from ORACLE DB " + key + " = " + value);
  }
}