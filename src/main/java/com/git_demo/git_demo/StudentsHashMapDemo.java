import java.util.HashMap;
import java.util.Map;

public class StudentsHashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");
        students.put(105, "Eve");

        // Retrieve and display the name of a student using a specific roll number
        int rollNumberToFind = 102;
        String studentName = students.get(rollNumberToFind);
        if (studentName != null) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + studentName);
        } else {
            System.out.println("Student with roll number " + rollNumberToFind + " not found.");
        }

        // Remove a student entry using a roll number
        int rollNumberToRemove = 103;
        students.remove(rollNumberToRemove);
        System.out.println("Removed student with roll number " + rollNumberToRemove);

        // Display all student records
        System.out.println("\nAll student records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
