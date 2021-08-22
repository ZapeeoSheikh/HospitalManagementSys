public class Book {

    // Declaring private attributes of the class
    private String title;
    private Author author = new Author();
    private double price;
    private int quantity;
    private int num_of_pages;
    private int edition;
    private int published_year;
    private int ISBN;


    // Constructor without parameters
    Book() {
        title = null;
        author.setName(null);
        author.setEmail(null);
        price = 0;
        quantity = 0;
        num_of_pages = 0;
        edition = 0;
        published_year = 0;
        ISBN = 0;
    }

    // Constructor with parameters
    Book(String title, String author, double price, int quantity, int num_of_pages, int edition, int published_year, int ISBN) {
        this.title = title;
        this.author.setName(author);
        this.price = price;
        this.quantity = quantity;
        this.num_of_pages = num_of_pages;
        this.edition = edition;
        this.published_year = published_year;
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNum_of_pages() {
        return num_of_pages;
    }

    public void setNum_of_pages(int num_of_pages) {
        this.num_of_pages = num_of_pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    // Get Set methods for title attribute
    // Set method
    public void setTitle(String title) {
        this.title = title;
    }
    // Get method
    public String getTitle() {
        return title;
    }

    // Get Set methods for author attribute
    // Set method
    public void setAuthor(String author) {
        this.author.setName(author);
    }
    // Get method
    public String getAuthor() {
        return author.getName();
    }

    // Get Set methods for price attribute
    // Set method
    public void setPrice(double price) {
        this.price = price;
    }
    // Get method
    public double getPrice() {
        return price;
    }

    // Get Set methods for quantity attribute
    // Set method
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Get method
    public int getQuantity() {
        return quantity;
    }

    // Display method which is used to display all the attributes of the class
    public void display() {
        System.out.println("Book title     = " + title);
        System.out.println("Author name    = " + author.getName());
        System.out.println("Edition        = " + edition);
        System.out.println("Published year = " + published_year);
        System.out.println("Number of pages= " + num_of_pages);
        System.out.println("Price          = " + price);
        System.out.println("Quantity       = " + quantity);
    }

}
