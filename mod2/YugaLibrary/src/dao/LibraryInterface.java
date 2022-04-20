package dao;

import java.util.List;

import model.Book;

public interface LibraryInterface {
    public void create(Book b);
    public Book searchById(int id);
    public Book searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> getAll();
    public void load();
}
