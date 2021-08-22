import java.util.HashMap;

public class Library {
    private HashMap<Integer,Book> books = new HashMap<Integer, Book>();

    public void addBook(String title, String author, double price, int quantity, int num_of_pages, int edition, int published_year, int ISBN) {
        books.put(ISBN, new Book(title, author, price, quantity, num_of_pages, edition, published_year, ISBN));
    }

    public Book getBook(int ISBN) {
        Book book = books.get(ISBN);
        if(book == null) {
            System.out.println("There's no such book with this ISBN number");
            return null;
        }
        else
            return (Book) book;
    }
}
