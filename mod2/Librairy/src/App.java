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
        String bookType, bookValue;
        String getBookNamePrompt = "what is the title of this book";
        String getBookAuthorPrompt = "who is the author of this book";
        String getBookGenrePrompt = "which genre is this book located";
        String getBookIdPrompt = "what is the id of this book";
        String getBookTypePrompt = "what type will you serch by";
        do {
            console.printMenue();
            whatToDo = console.getInt("");
            switch (whatToDo) {
                case 1:
                    sampleBook.setTitle(console.getString(getBookNamePrompt));
                    sampleBook.setAuthor(console.getString(getBookAuthorPrompt));
                    sampleBook.setGenre(console.getString(getBookGenrePrompt));
                    impl.create(sampleBook);
                    break;
                case 2:
                bookType = console.getString(getBookTypePrompt);
                    switch (bookType) {
                        case "id":
                            sampleBook = impl.searchById(console.getString(getBookIdPrompt));
                            if (sampleBook == null || sampleBook.getGenre() == "uh oh") {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                                console.printBook(sampleBook);
                            }
                            break;
                        case "title":
                        case "name":
                            sampleBook = impl.searchByName(console.getString(getBookNamePrompt));
                            if (sampleBook == null) {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                                console.printBook(sampleBook);
                            }
                            break;
                        case "author":
                            sampleBook = impl.searchByAuthor(console.getString(getBookAuthorPrompt));
                            if (sampleBook == null) {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                               console.printBook(sampleBook);
                            }
                            break;
                        default:
                        System.out.println("the given value was incorrect");
                            break;
                    }
                    break;
                case 3:
                    impl.print();
                    break;
                case 4:
                    bookType = console.getString(getBookTypePrompt);
                    switch (bookType) {
                        case "id":
                            sampleBook = impl.searchById(console.getString(getBookIdPrompt));
                            if (sampleBook == null || sampleBook.getGenre() == "uh oh") {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                                impl.checkOut(sampleBook, true);
                           }
                            break;
                        case "title":
                        case "name":
                            sampleBook = impl.searchByName(console.getString(getBookNamePrompt));
                            if (sampleBook == null) {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                                impl.checkOut(sampleBook, true);
                           }
                            break;
                        case "author":
                            sampleBook = impl.searchByAuthor(console.getString(getBookAuthorPrompt));
                            if (sampleBook == null) {
                                System.out.println("the book you where looking for is non existent");
                            } else {
                               impl.checkOut(sampleBook, true);
                            }
                            break;
                        default:
                        System.out.println("the given value was incorrect");
                            break;
                            //TODO
                    }   
                break;
            case 5:
                    System.out.println("exiting program");
                    satifaction = true;
                break;
            default:
            System.out.println("the entered number does not match the suplied numbers: \n please try again");
                break;
            }
        } while (!satifaction);
    }
}
