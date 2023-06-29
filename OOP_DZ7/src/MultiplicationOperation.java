
public class MultiplicationOperation implements iComplexOperation {

    @Override
    public ComplexNum perform(ComplexNum a, ComplexNum b) {
        double real = (a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary());
        double imaginary = (a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal());
        return new ComplexNum(real, imaginary);
    }

}