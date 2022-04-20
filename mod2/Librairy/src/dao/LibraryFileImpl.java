package dao;

import java.io.PrintWriter;
import java.util.List;

import interfaces.LibraryInterface;
import model.Book;
import model.Client;

public class LibraryFileImpl implements LibraryInterface{

    @Override
    public void create(Book book, PrintWriter writer) {
        writer.println(book.getTitle() + "::" + book.getAuthor() + "::" + book.getGenre() + "::" + book.getCheckedOut() + "::" + book.getId());
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public Client create(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
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
        
    }
    
}
