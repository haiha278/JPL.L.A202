package fa.training.entities;

public class HourlyEmployee extends Employee {
    private double wage;
    private double workingHours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String ssn, String firstName, String lastName, double wage, double workingHours) {
        super(ssn, firstName, lastName);
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
