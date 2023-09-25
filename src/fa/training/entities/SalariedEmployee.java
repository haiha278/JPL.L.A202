package fa.training.entities;

public class SalariedEmployee extends Employee {
    private double commisstionRate;
    private double grossSales;
    private double basicSalary;

    public SalariedEmployee(double commisstionRate, double grossSales, double basicSalary) {
        this.commisstionRate = commisstionRate;
        this.grossSales = grossSales;
        this.basicSalary = basicSalary;
    }

    public SalariedEmployee(String ssn, String firstName, String lastName, double commisstionRate, double grossSales, double basicSalary) {
        super(ssn, firstName, lastName);
        this.commisstionRate = commisstionRate;
        this.grossSales = grossSales;
        this.basicSalary = basicSalary;
    }

    public double getCommisstionRate() {
        return commisstionRate;
    }

    public void setCommisstionRate(double commisstionRate) {
        this.commisstionRate = commisstionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
