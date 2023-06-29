import java.util.Scanner;

public class ComplexScaner {
    private Scanner scanner;
    public ComplexScaner (Scanner scanner){
        this.scanner = scanner;
    }

    public ComplexNum readComplexNumber(){
        double real = scanner.nextDouble();
        double imaginary = scanner.nextDouble();
        return new ComplexNum(real, imaginary);
    }
}