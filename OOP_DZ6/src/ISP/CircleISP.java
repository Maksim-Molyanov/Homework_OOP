package ISP;

public class CircleISP implements Area{
    public Double radius;

    public CircleISP(Double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Circle area = " + Math.PI * 2 + radius );
    }

}