
public class DivisionOperation implements iComplexOperation{

    @Override
    public ComplexNum perform(ComplexNum a, ComplexNum b) {
        double divisor = b.getReal()*b.getReal() + b.getImaginary()*b.getImaginary();
        double real = ((a.getReal()*b.getReal()) + (a.getImaginary() * b.getImaginary())) / divisor;
        double imaginary = ((a.getImaginary() * b.getReal()) - (a.getReal() * b.getImaginary()))/divisor;
        return new ComplexNum(real, imaginary);
    }

}