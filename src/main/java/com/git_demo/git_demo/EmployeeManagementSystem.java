public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating an array of Employee objects
        Employee[] employees = new Employee[2];
        
        // Adding FullTimeEmployee and PartTimeEmployee objects to the array
        employees[0] = new FullTimeEmployee("John Doe", 1, 5000);
        employees[1] = new PartTimeEmployee("Jane Smith", 2, 20, 80);
        
        // Calculating and displaying salaries and details using overridden methods
        for (Employee emp : employees) {
            emp.displayDetails();
            emp.calculateSalary();
            System.out.println();
        }
    }
}
