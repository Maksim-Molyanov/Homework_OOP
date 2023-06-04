package Domen;

public class HotDrink extends Product {
    /** Добавление нового поля temperature */
    private int temperature;

    /** Конструктор для горячих напитков  */
    public HotDrink(int productId, String name, String productCategory, int price, int temperature) {
        super(productId, name, productCategory, price);
        this.temperature = temperature;
    }

    /** Получаем температуру напитка */
    public int getTemperature() {
        return temperature;
    }

    /** Устанавливаем температуру напитка */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /** Переопределение метода toString() */
    @Override
    public String toString() {
        return "Product{" + "name='" + super.getName() + '\'' +
                ", productCategory='" + super.getProductCategory() + '\'' +
                ", cost=" + super.getPrice() +
                ", temperature=" + temperature +
                '}';
    }
}
