package OCP;

public class Bus extends Vehicle {

    public Bus(Double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public Double getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void calculateAllowedSpeed(Vehicle vehicle) {
        System.out.println("Разрешенная скорость = " + this.maxSpeed * 0.6);
    }



}