public class MySqlProductDao implements ProductDao {
    public void insertProduct(Product product) {
        System.out.println("Insert product into MySql database: " + product.getProductId());
    }
    public void updateProduct(Product product) {
        System.out.println("Update product in MySql database" + product.getProductId());
    }
    public void deleteProduct(Product product) {
        System.out.println("Delete product from MySql database" + product.getProductId());
    }
}