package OCP;

public class Car extends Vehicle {

    public Car(Double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public Double getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void calculateAllowedSpeed(Vehicle vehicle) {
        System.out.println("Разрешенная максимальная скорость = " + this.maxSpeed * 0.8);
    }

}