// Derived class: FullTimeEmployee
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implementing the abstract methods
    @Override
    public void calculateSalary() {
        // For full-time employees, salary is a fixed monthly rate
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
