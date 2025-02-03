public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");
        
        // Creating a Magazine object
        Magazine magazine = new Magazine("National Geographic", "Various Authors", 2023, 101);
        
        // Displaying details of the Book
        System.out.println("Book Details:");
        book.displayDetails();
        
        // Displaying details of the Magazine
        System.out.println("\nMagazine Details:");
        magazine.displayDetails();
    }
}
