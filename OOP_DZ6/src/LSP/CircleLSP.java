package LSP;

public class CircleLSP extends Figure {
    private Double radius;

    public CircleLSP(Double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь круга = " +  Math.PI*radius*radius);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр круга = " + Math.PI*radius*2);
    }

}