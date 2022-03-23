package dao;

import interfaces.LibraryInterface;
import model.Book;

public class LibraryImpl implements LibraryInterface{
    private List<Book> libraryList = new ArrayList<>();

    @Override
    public Book create(Book book){
        return book;
    }
    @Override
    public Book search(String value, String type) {
        Book book = new Book();
        return book;
    }
}
