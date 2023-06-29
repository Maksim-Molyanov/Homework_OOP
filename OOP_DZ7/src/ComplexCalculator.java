public class ComplexCalculator {
    private iComplexOperation operation;

    public void setOperation(iComplexOperation operation){
        this.operation = operation;
    }

    public ComplexNum calculate (ComplexNum a, ComplexNum b) {
        if (operation != null) {
            return operation.perform(a, b);
        }
        return null;
    }

}