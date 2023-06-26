package LSP;

public class Square extends Figure {
    private Double height;
    private Double width;

    public Square(Double height, Double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь квадрата = " + this.width * this.height);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр квадрата = " + (this.width + this.height) * 2);
    }

}