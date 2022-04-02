import java.util.Scanner;

import console.Console;
import dao.LibraryInMemoryImpl;
import interfaces.LibraryInterface;
import model.Book;

public class App {
    public static void main(String[] args) throws Exception {
        LibraryInterface impl = new LibraryInMemoryImpl();
        Scanner sc = new Scanner(System.in);
        Console console = new Console(sc);
        boolean satifaction = false;
        int whatToDo;
        Book sampleBook = new Book();
        String bookType;
        String getBookNamePrompt = "what is the title of this book";
        String getBookAuthorPrompt = "who is the author of this book";
        String getBookGenrePrompt = "which genre is this book located";
        String getBookIdPrompt = "what is the id of this book";
        String getBookTypePrompt = "what type will you serch by";

        
        impl.create(new Book("go", "the goose", "childrens books"));

        System.out.println("welcome to the library");
        System.out.println("you can preform actions acording to the number you enter");

        do {
            console.printMenue();
            whatToDo = console.getInt("");
            switch (whatToDo) {
                case 1:
                    Book createBook = new Book();
                    createBook.setTitle(console.getString(getBookNamePrompt));
                    createBook.setAuthor(console.getString(getBookAuthorPrompt));
                    createBook.setGenre(console.getString(getBookGenrePrompt));
                    impl.create(createBook);
                    break;
                case 2:
                    bookType = console.getString(getBookTypePrompt);
                    sampleBook = impl.findType(bookType, sampleBook);
                    if (sampleBook != null) {
                        console.printBook(sampleBook);
                    }
                    
                    break;
                case 3:
                    impl.print();
                    break;
                case 4:
                    bookType = console.getString(getBookTypePrompt);
                    sampleBook = impl.findType(bookType, sampleBook);
                    if (sampleBook != null) {
                        impl.checkOut(sampleBook, true);
                    }
                break;
            case 6:
                    System.out.println("exiting librairy");
                    satifaction = true;
                break;
            case 5:
                bookType = console.getString(getBookTypePrompt);
                sampleBook = impl.findType(bookType, sampleBook);
                if (sampleBook != null) {
                    impl.checkOut(sampleBook, false);
                }
                break;
            default:
            System.out.println("the entered number does not match the suplied numbers: \n please try again");
                break;
            }
        } while (!satifaction);
    }
}