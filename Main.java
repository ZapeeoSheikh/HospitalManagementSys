import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String title;
        String author_name;
        double price;
        int quantity;
        int num_of_pages;
        int edition;
        int published_year;
        int ISBN;


        Library library = new Library();
        Author author  = new Author();

        Scanner input = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.print("Welcome to the library\n");
            System.out.print("1. Add a book to the library\n");
            System.out.print("2. Get a book from the library with ISBN number\n");
            System.out.print("3. Exit the Library management program\n");
            System.out.print("4. Developer Information\n");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter Book's title: ");
                title = input.nextLine();

                System.out.print("Enter author's name: ");
                author_name = input.nextLine();

                System.out.print("Enter number of pages: ");
                num_of_pages = input.nextInt();

                System.out.print("Enter price of the book: ");
                price = input.nextDouble();

                System.out.print("Enter edition: ");
                edition = input.nextInt();

                System.out.print("Enter published year: ");
                published_year = input.nextInt();

                System.out.print("Enter quantity: ");
                quantity = input.nextInt();

                System.out.print("Enter ISBN: ");
                ISBN = input.nextInt();

                library.addBook(title, author_name, price, quantity, num_of_pages, edition, published_year, ISBN);

                System.out.println("Book details has been added to Library");
            }
            else if(choice == 2) {
                System.out.print("Enter book's ISBN: ");
                ISBN = input.nextInt();
                if(library.getBook(ISBN) != null) {
                    Book book = library.getBook(ISBN);
                    book.display();
                    continue;
                }
            }

            else if(choice == 3) {
                System.exit(0);
            }
            else if(choice == 4) {
                author.setName("Muhammad Rameez");
                author.setEmail("muhammadrmz871@gmail.com");
                author.display();
            }

            else
                System.out.println("Invalid choice!!!");
        }
    }
}
