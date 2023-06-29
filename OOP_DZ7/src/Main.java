import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ComplexScaner complexScaner = new ComplexScaner(new Scanner(System.in));

        ComplexCalculator calculator = new ComplexCalculator();

        System.out.println("Введите первое число ");
        ComplexNum a = complexScaner.readComplexNumber();

        System.out.println("Введите второе число ");
        ComplexNum b = complexScaner.readComplexNumber();

        System.out.println("Введите операцию");
        String operator = new Scanner(System.in).next();

        switch (operator) {
            case "+":
                calculator.setOperation(new AdditionOperation());
                break;
            case "-":
                calculator.setOperation(new SubstactionOperation());
                break;

            case "*":
                calculator.setOperation(new MultiplicationOperation());
                break;

            case "/":
                calculator.setOperation(new DivisionOperation());
                break;

            default:
                System.out.println("Ошибочная операция");
                break;
        }
        ComplexNum result = calculator.calculate(a, b);
        System.out.println(result.getReal() + " + " + result.getImaginary() + "i");

    }
}