package DIP;

public class GasStation implements iGasStation {

    @Override
    public void refuelingStart() {
        System.out.println("Начать заправку");
    }

}