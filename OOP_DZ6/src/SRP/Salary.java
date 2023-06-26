package SRP;

public class Salary {

    private int baseSalary;


    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}