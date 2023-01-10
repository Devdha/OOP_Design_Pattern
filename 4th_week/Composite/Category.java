import java.util.*;

public class Category extends ProductCategory {
    private List<ProductCategory> products = new ArrayList<ProductCategory>();

    public Category(int id, String name, int price) {
        super(id, name, price);
    }

    public void addProduct(ProductCategory product) {
        products.add(product);
    }

    public void removeProduct(ProductCategory product) {
        products.remove(product);
    }

    public int getCount() {
        int sum = 0;
        for (ProductCategory product : products) {
            sum += product.getCount();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        int sum = 0;
        for (ProductCategory product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public int getId() {
        return id;
    }
}