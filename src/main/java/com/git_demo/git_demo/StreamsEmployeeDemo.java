import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEmployeeDemo {
    public static void main(String[] args) {
        // Define a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25, 50000),
            new Employee("Bob", 35, 60000),
            new Employee("Charlie", 40, 70000),
            new Employee("David", 28, 45000),
            new Employee("Eve", 32, 55000)
        );

        // Filter employees older than 30
        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getAge() > 30)
            .collect(Collectors.toList());

        // Calculate the average salary of employees who are older than 30
        double averageSalary = filteredEmployees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        // Collect the names of employees who are older than 30
        List<String> employeeNames = filteredEmployees.stream()
            .map(Employee::getName)
            .collect(Collectors.toList());

        // Print the list of employee names and the average salary
        System.out.println("Employee names: " + employeeNames);
        System.out.println("Average salary: " + averageSalary);
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}



