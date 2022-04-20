import java.util.List;
import java.util.Scanner;

import console.Console;
import dao.LibraryInterface;
import impl.LibraryInMemoryImpl;
import model.Book;

public class App {
    public static void main(String[] args) throws Exception {
        // This is where we define what implementation of the library we are running
        LibraryInterface library = new LibraryInMemoryImpl();
        library.load();

        // Create the console
        Scanner sc = new Scanner(System.in);
        Console console = new Console(sc);

        // Defined menu prompts
        String getBookNamePrompt = "what is the title of this book";
        String getBookAuthorPrompt = "who is the author of this book";
        String getBookIdPrompt = "what is the id of this book";
        
        int choice = 0;
        // show the initial prompt
        System.out.println("welcome to the library");
        System.out.println("you can perform actions acording to the number you enter");

        // variable to store return values in switch statement
        Book b;
        List<Book> books;

        do{
            console.printMenu();
            choice = console.getInt("Please choose an option");
            switch (choice) {
                case 1:
                    Book createBook = new Book();
                    createBook.setTitle(console.getString(getBookNamePrompt));
                    createBook.setAuthor(console.getString(getBookAuthorPrompt));
                    library.create(createBook);
                    break;
                case 2:
                    int id = console.getInt(getBookIdPrompt);
                    b = library.searchById(id);
                    if(b == null) {
                        System.out.println("This book cannot be found");
                    } else {
                        console.printBook(b);
                    }
                    break;
                case 3:
                    String author = console.getString(getBookAuthorPrompt);
                    books = library.searchByAuthor(author);
                    console.printBooks(books);
                    break;
                case 4:
                    String title = console.getString(getBookNamePrompt);
                    b = library.searchByTitle(title);
                    if(b == null) {
                        System.out.println("This book cannot be found");
                    } else {
                        console.printBook(b);
                    }
                    break;
                case 5:
                    books = library.getAll();
                    console.printBooks(books);
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Please try again");
            }

        } while(choice != 6);
    }
}
