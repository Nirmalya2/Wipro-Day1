public class feb1q1 {

    public static void main(String[] args) {
        String str = null;
        int[] array = {1, 2, 3};

        try {
            // This will throw NullPointerException
            System.out.println(str.length());

            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(array[5]);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
