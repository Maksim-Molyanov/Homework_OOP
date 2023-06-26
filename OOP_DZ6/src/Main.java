import ISP.Cub;
import LSP.CircleLSP;
import DIP.iGasStation;
import ISP.CircleISP;
import LSP.Figure;
import LSP.Square;
import LSP.Triangle;
import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------Пример OCP-------------");
        Vehicle vehicle = new Vehicle(100.5);
        vehicle.calculateAllowedSpeed(vehicle);
        Bus bus = new Bus(190.5);
        bus.calculateAllowedSpeed(vehicle);

        Car car = new Car(220.0);
        car.calculateAllowedSpeed(car);
        System.out.println("--------------Пример OCP-------------");

        System.out.println("--------------Пример LSP-------------");

        CircleLSP circle = new CircleLSP(5.5);
        circle.getArea();
        circle.getPerimeter();

        Square square = new Square(5.5, 5.5);
        square.getArea();
        square.getPerimeter();

        Triangle triangle = new Triangle(3.0, 3.0, 3.0);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println("--------------Пример LSP-------------");

        System.out.println("--------------Пример ISP-------------");
        CircleLSP circleLSP = new CircleLSP(6.5);
        circleLSP.getArea();
        Cub cub = new Cub(5);
        cub.getArea();
        cub.getVolume();
        System.out.println("--------------Пример ISP-------------");



    }
}