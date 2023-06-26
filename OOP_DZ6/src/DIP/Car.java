package DIP;

public class Car {
    private iGasStation gasStation;
    public Car(iGasStation gasStation){
        this.gasStation = gasStation;
    }
    public void petrolRefueling(){
        System.out.println("Заправка машины бензином");
        gasStation.refuelingStart();
    }
}