public class OracleProductDao implements ProductDao {
    public void insertProduct(Product product) {
        System.out.println("Insert product into Oracle database: " + product.getProductId());
    }

    public void updateProduct(Product product) {
        System.out.println("Update product in Oracle database" + product.getProductId());
    }

    public void deleteProduct(Product product) {
        System.out.println("Delete product from Oracle database" + product.getProductId());
    }
}