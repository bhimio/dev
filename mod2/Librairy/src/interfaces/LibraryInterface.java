package interfaces;

import model.Book;

public interface LibraryInterface {
    public Book create(Book book);
    public Book search(String value, String type);
    // public boolean delete(String value, String type);
}
