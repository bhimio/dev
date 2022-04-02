package interfaces;

import model.Book;
import model.Client;

public interface LibraryInterface {
    public Book create(Book book);
    public Book searchById(String value);
    public Book searchByName(String value);
    public Book searchByAuthor(String value);
    public void checkOut(Book book, boolean checkedOut);
    public Client create(Client client);
    public void print();
    public Book findType(String type, Book sampleBook);
    // public boolean delete(String value, String type);
}
