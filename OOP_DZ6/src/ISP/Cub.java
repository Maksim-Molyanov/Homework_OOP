package ISP;

public class Cub implements Area,Volume{
    private int edge;

    public Cub(Integer edge) {
        this.edge = edge;
    }

    @Override
    public void getArea() {
        System.out.println("Cub Area = " + 6 * edge * edge);
    }

    @Override
    public void getVolume() {
        System.out.println("Cub volume = " + edge * edge * edge);
    }



}