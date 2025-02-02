// Define the custom exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class to demonstrate custom exception
public class feb1Q2 {
    public static void main(String[] args) {
        try {
            // Call a method that might throw CustomException
            checkCondition(false);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }

    // Method that throws CustomException based on a condition
    public static void checkCondition(boolean condition) throws CustomException {
        if (!condition) {
            throw new CustomException("Condition was false!");
        }
        System.out.println("Condition was true.");
    }
}
