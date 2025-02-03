// Abstract class
public abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract methods
    public abstract void calculateSalary();
    public abstract void displayDetails();
}
