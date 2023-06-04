package Domen;

public class Product {
    private int productId;
    private String name;
    private String productCategory;
    private int price;
    public Product(int productId, String name, String productCategory, int price){
        this.productId = productId;
        this.name = name;
        this.productCategory = productCategory;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0){
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
        }
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product{" + "name='" + name + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", cost=" + price + '}';
    }
}
