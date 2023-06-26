package OCP;

public class Vehicle extends SpeedCalculation{
    public Double maxSpeed;
    public Vehicle(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getMaxSpeed() {
        return this.maxSpeed;
    }


}