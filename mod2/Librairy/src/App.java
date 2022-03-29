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
        boolean yn = false;
        String bookName, bookAuthor, bookGenre, bookType, bookSercher;
        String yes = "y";
        String no = "n";
        Book sampleBook = new Book();
        do {
            yn = console.getYesOrNo("are you a costomer", yes, no);
            if (!yn) {
                yn = console.getYesOrNo("do you want to add a book", yes, no);
                if (yn) {
                    bookName = console.getString("what is the title of this book");
                    bookAuthor = console.getString("what is the author of this book");
                    bookGenre = console.getString("what genre is this book located");
                    Book book = new Book(bookName, bookAuthor, bookGenre);
                    impl.create(book);
                } else {
                    
                }
            } else {
                yn = console.getYesOrNo("do you want to check out a book", yes, no);
                if (yn) {
                    bookType = console.getString("what whould you like to serch by");
                    bookSercher = console.getString("what is the " + bookType + " of this book");
                    sampleBook = impl.search(bookType, bookSercher);
                    //impl.checkOut(sampleBook, true);
                } else {
                    yn = console.getYesOrNo("do you want to serch a book", yes, no);
                    if (yn) {
                        bookType = console.getString("what whould you like to serch by");
                        bookSercher = console.getString("what is the " + bookType + " of this book");
                        sampleBook = impl.search(bookType, bookSercher);
                        System.out.println("info{");
                        System.out.println("    title: " + sampleBook.getTitle());
                        System.out.println("    author: " + sampleBook.getAuthor());
                        System.out.println("    id: " + sampleBook.getId());
                        System.out.println("}");
                    } else {
                        
                    }
                }
            }
            satifaction = console.getYesOrNo("do you want to shut down this program", yes, no);
        } while (!satifaction);
    }
}
