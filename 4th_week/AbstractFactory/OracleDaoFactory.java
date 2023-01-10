public class OracleDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao(); 
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao(); 
    }
}