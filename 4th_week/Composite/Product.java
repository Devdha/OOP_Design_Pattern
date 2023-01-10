public class Product extends ProductCategory {
    public void addProduct(ProductCategory product) {}
    public void removeProduct(ProductCategory product) {}

    public int getCount() {
        return 1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
    public int getId() {
        return id;
    }
  }