
public class AdditionOperation implements iComplexOperation {

    @Override
    public ComplexNum perform(ComplexNum a, ComplexNum b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNum(real, imaginary);
    }

}