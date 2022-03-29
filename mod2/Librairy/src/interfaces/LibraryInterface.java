package interfaces;

import model.Book;
import model.Client;

public interface LibraryInterface {
    public Book create(Book book);
    public Book search(String value, String type);
    public void checkOut(Book book, boolean checkedOut);
    public Client create(Client client);
    // public boolean delete(String value, String type);
}
