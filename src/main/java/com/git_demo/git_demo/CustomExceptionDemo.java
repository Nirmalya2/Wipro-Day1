
class CustomException extends feb1q2 {
    public CustomException(String message) {
        super(message);
    }
}


public class CustomExceptionDemo {
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

    
    public static void checkCondition(boolean condition) throws CustomException {
        if (!condition) {
            throw new CustomException("Condition was false!");
        }
        System.out.println("Condition was true.");
    }
}
