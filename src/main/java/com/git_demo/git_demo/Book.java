// Derived class: Book
public class Book extends Item {
    private String genre;

    // Constructor
    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    // Method to display book details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}
