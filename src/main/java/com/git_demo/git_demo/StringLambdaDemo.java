import java.util.ArrayList;
import java.util.List;

public class StringLambdaDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        // Sort the list in reverse alphabetical order using lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse alphabetical order: " + strings);

        // Define the StringProcessor functional interface
        @FunctionalInterface
        interface StringProcessor {
            String process(String str);
        }

        // Create a lambda expression to implement StringProcessor's process method
        StringProcessor toUpperCase = str -> str.toUpperCase();

        // Process and print the strings in uppercase
        System.out.println("Strings in uppercase:");
        for (String s : strings) {
            System.out.println(toUpperCase.process(s));
        }
    }
}
