package interfaces;

import java.util.List;

import model.Book;
import model.Client;

public interface LibraryInterface {
    public void create(Book book);
    public Book searchById(String value);
    public Book searchByName(String value);
    public List<Book> searchByAuthor(String value);
    public void checkOut(Book book, boolean checkedOut);
    public Client create(Client client);
    public void print();
    public Book findType(String type, Book sampleBook);
    public void install();
    // public boolean delete(String value, String type);
}
