package Domen;

public class Bottle extends Product {
    private int volume;
    public Bottle(int productId, String name, String productCategory, int price, int volume) throws Exception{
        super(productId, name, productCategory, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + super.getName() + '\'' +
                ", productCategory='" + super.getProductCategory() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                '}';
    }
}
