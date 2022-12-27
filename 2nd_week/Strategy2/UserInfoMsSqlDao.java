public class UserInfoMsSqlDao implements UserInfoDao {
  public void insert(String key, String value) {
    System.out.println("insert into MSSQL DB " + key + " = " + value);
  }

  public void update(String key, String value) {
    System.out.println("update into MSSQL DB " + key + " = " + value);
  }

  public void delete(String key, String value) {
    System.out.println("delete from MSSQL DB " + key + " = " + value);
  }
}