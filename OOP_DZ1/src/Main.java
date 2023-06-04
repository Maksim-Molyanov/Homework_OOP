import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Water", 60, 500);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Mars", "Шоколад", 50));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 70, 500));
        iMachine.addProduct(new HotDrink(5, "Capuchino", "Кофе", 45, 70));
        iMachine.addProduct(new HotDrink(6, "Macchiato", "Кофе", 50, 65));

        for (Product prod: iMachine.getProducts()){
            System.out.println(prod.toString());
        }


    }
}