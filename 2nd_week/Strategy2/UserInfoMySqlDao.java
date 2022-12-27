public class UserInfoMySqlDao implements UserInfoDao {
  public void insert(String key, String value) {
    System.out.println("insert into MYSQL DB " + key + " = " + value);
  }

  public void update(String key, String value) {
    System.out.println("update into MYSQL DB " + key + " = " + value);
  }

  public void delete(String key, String value) {
    System.out.println("delete from MYSQL DB " + key + " = " + value);
  }
}