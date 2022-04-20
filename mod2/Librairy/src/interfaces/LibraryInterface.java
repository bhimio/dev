package interfaces;

import java.util.List;

import model.Book;
import model.Client;

public interface LibraryInterface {
    public void create(Book book);
    public Book searchById(String value);
    public Book searchByName(String value);
    public List<Book> searchByAuthor(String value);
    public List<Book> searchByGenre(String value);
    public void checkOut(Book book, boolean checkedOut);
    public Client create(Client client);
    public void print();
    public Book findType(String bookType, Book sampleBook);
    public List<Book> findType(String bookType, List<Book> sapleList);
    public void install() throws Exception;
    // public boolean delete(String value, String type);
}
