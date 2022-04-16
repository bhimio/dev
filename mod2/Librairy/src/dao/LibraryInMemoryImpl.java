package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import console.Console;
import interfaces.LibraryInterface;
import model.Book;
import model.Client;

public class LibraryInMemoryImpl implements LibraryInterface{
    private List<Book> libraryList = new ArrayList<>();
    private HashMap<String, Book> librairyMap = new HashMap<>();
    //private List<Client> clientList = new ArrayList<>();
    private static int id = 11111111;
    private static int id2 = 11111111;
    Scanner sc = new Scanner(System.in);
    Console console = new Console(sc);
    public Book wrongBook = new Book("uh oh", "uh oh", "uh oh");

    @Override
    public void create(Book book){
        book.setId(id++);
        book.setCheckedOut(false);
        libraryList.add(book);
    }
    @Override
    public Book searchById(String value){
        int id;
        try {
            id = Integer.parseInt(value);
            for (Book b : libraryList) {
                if (id == b.getId()) {
                    return b;
                }
            }
        } catch (Exception e) {
            return wrongBook;
        }
        return null;
    }
    @Override
    public Book searchByName(String value){
        for (Book b: libraryList) {
            if (value.equals(b.getTitle())) {
                return b;
            }
        }
        return null;
    }
    @Override
    public List<Book> searchByAuthor(String value){
        List<Book> bookList = new ArrayList<>();
        for (Book b : libraryList) {
            if (value.equals(b.getAuthor())) {
                bookList.add(b);
            }
        }
        return bookList;
    }
    @Override
    public void checkOut(Book book, boolean checkedOut){
        this.searchByName(book.getTitle()).setCheckedOut(checkedOut);

    }

    @Override
    public Client create(Client client){
        client.setId(id2++);
        client.setAge(client.getAge());
        client.setBooks(client.getBooks());
        client.setName(client.getName());
        return client;
    }
    @Override
    public void print() {
         for (Book b : libraryList) {
             console.printBook(b);
         }
    }
    @Override
    public Book findType(String bookType, Book sampleBook) {
        
        String getBookNamePrompt = "what is the title of this book";
        String getBookAuthorPrompt = "who is the author of this book";
        String getBookIdPrompt = "what is the id of this book";
        switch (bookType) {
            case "id":
                sampleBook = this.searchById(console.getString(getBookIdPrompt));
                if (sampleBook == null || sampleBook.getGenre() == "uh oh") {
                    System.out.println("the book you where looking for is non existent");
                } else {
                    return sampleBook;
                }
                break;
            case "title":
            case "name":
                sampleBook = this.searchByName(console.getString(getBookNamePrompt));
                if (sampleBook == null) {
                    System.out.println("the book you where looking for is non existent");
                } else {
                    return sampleBook;
                }
                break;
            case "author":
                List<Book> bookList = new ArrayList<>();
                bookList = this.searchByAuthor(console.getString(getBookAuthorPrompt));
                if (bookList == null) {
                    System.out.println("the book you where looking for is non existent");
                } else {
                   for (Book book : bookList) {
                       
                   }
                }
                break;
            default:
            System.out.println("the given value was incorrect");
                break;
        }
        return null;
    }
    
    @Override
    public void install(){
        Scanner read = new Scanner(
            new BufferedReader(new FileReader("OutFile.txt")));
            String[] parts;
            String line;
            boolean ischeckedout;
            int id;
        while (read.hasNextLine()) {
            line = read.nextLine();
            parts = line.split("::");
            ischeckedout = Boolean.parseBoolean(parts[3]);
            id = Integer.parseInt(parts[4]);
            Book b = new Book();
            b.setAuthor(parts[1]);
            b.setTitle(parts[0]);
            b.setCheckedOut(ischeckedout);
            b.setGenre(parts [2]);
            b.setId(id);
            //add to in memory list for fast lookup
            libraryList.add(b);
        }
    }
}
