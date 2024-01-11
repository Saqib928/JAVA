import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void removeBook(int bookId) {
        boolean removed = false;

        for (Book book : books) {
            if (book.getId() == bookId) {
                books.remove(book);
                removed = true;
                System.out.println("Book removed successfully!");
                break;
            }
        }

        if (!removed) {
            System.out.println("Book not found!");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Books available in the library:");
        
         for (Book book : books) { 
             System.out.println("ID: " + book.getId());
             System.out.println("Title: " + book.getTitle());
             System.out.println("Author: " + book.getAuthor());
             System.out.println("---------------------------");
         }
     }
}

public class Library_projrct {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         Library library = new Library();

         while (true) {

             System.out.println("\nLibrary Book Management System");
             System.out.println("-----------------------------");
             System.out.println("1. Add Book");
             System.out.println("2. Remove Book");
             System.out.println("3. Display Books");
             System.out.println("4. Exit");
             System.out.print("\nEnter your choice: ");
             
              int choice = scanner.nextInt();
              
              switch (choice) { 
                  case 1:
                      // Add Book
                      scanner.nextLine(); // Consume newline character
                      System.out.print("\nEnter Book Title: ");
                      String title = scanner.nextLine();
                      System.out.print("Enter Author Name: ");
                      String author = scanner.nextLine();
                      int id=library.books.size()+1; // Generate unique ID based on the number of existing books
                      Book newBook=new Book(id,title,author);
                      library.addBook(newBook);
                      break; 
                  case 2:
                       // Remove Book 
                       scanner.nextLine(); // Consume newline character 
                       System.out.print("\nEnter the ID of the book to be removed: "); 
                       int removeId=scanner.nextInt(); 
                       library.removeBook(removeId); 
                       break; 
                   case 3:
                        // Display Books
                        library.displayBooks();
                        break; 
                   case 4:
                        // Exit
                        scanner.close();
                        return; 
                   default:
                         // Invalid choice
                         System.out.println("\nInvalid choice! Please enter a valid option.");
              }  
          }  
      }  
}