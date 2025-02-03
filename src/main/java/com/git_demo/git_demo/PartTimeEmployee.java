// Derived class: PartTimeEmployee
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing the abstract methods
    @Override
    public void calculateSalary() {
        // For part-time employees, salary is calculated based on hourly rate
        double salary = hourlyRate * hoursWorked;
        System.out.println("Calculated Salary: " + salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
