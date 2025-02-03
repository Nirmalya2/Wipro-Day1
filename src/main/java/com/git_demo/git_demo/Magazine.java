// Derived class: Magazine
public class Magazine extends Item {
    private int issueNumber;

    // Constructor
    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Method to display magazine details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}
