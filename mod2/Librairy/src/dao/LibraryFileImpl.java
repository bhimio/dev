package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import console.Console;
import interfaces.LibraryInterface;
import model.Book;
import model.Client;

public class LibraryFileImpl implements LibraryInterface {
    private List<Book> libraryList = new ArrayList<>();
    private static int id;
    private static Scanner scanner = new Scanner(System.in);
    private static Console console = new Console(scanner);

    @Override
    public void create(Book book, PrintWriter writer) {
        book.setId(id++);
        book.setCheckedOut(false);
        libraryList.add(book);
        for (Book book2 : libraryList) {
            writer.println(
                    book2.getTitle() + "::" + book2.getAuthor() + "::" + book2.getGenre() + "::" + book2.getCheckedOut()
                            + "::" + book2.getId());
            writer.flush();
            writer.close();
        }
    }

    @Override
    public Book searchById(String value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book searchByName(String value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Book> searchByGenre(String value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void checkOut(Book book, boolean checkedOut) {

    }

    @Override
    public Client create(Client client) {
        return null;
    }

    @Override
    public void print() {
        for (Book book : libraryList) {
            console.printBook(book);
        }
    }

    @Override
    public Book findType(String bookType, Book sampleBook) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Book> findType(String bookType, List<Book> sampleList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void install() throws Exception {
        Scanner read = new Scanner(
                new BufferedReader(new FileReader("/home/bhima/dev/mod2/Librairy/src/storage/OutFile.txt")));
        String[] parts;
        String line;
        while (read.hasNextLine()) {
            line = read.nextLine();
            parts = line.split("::");
            Book b = new Book();
            b.setTitle(parts[0]);
            b.setAuthor(parts[1]);
            b.setGenre(parts[2]);
            b.setCheckedOut(Boolean.parseBoolean(parts[3]));
            b.setId(Integer.parseInt(parts[4]));
            // add to in memory list for fast lookup
            libraryList.add(b);
            if (!read.hasNextLine()) {
                this.id = Integer.parseInt(parts[4]) + 1;
            }
        }

    }
}
