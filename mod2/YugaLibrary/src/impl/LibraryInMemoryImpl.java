package impl;

import java.util.ArrayList;
import java.util.List;

import dao.LibraryInterface;
import model.Book;

public class LibraryInMemoryImpl implements LibraryInterface {
    private List<Book> list = new ArrayList<>();
    private static int id = 1;

    @Override
    public void create(Book b) {
        b.setId(id++);
        list.add(b);
    }

    @Override
    public Book searchById(int id) {
        for (Book b : list) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Book searchByTitle(String title) {
        for (Book b : list) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> ret = new ArrayList<>();
        for (Book b: list) {
            if(b.getAuthor().equals(author)){
                ret.add(b);
            }
        }
        return ret;
    }

    @Override
    public void load() {
        System.out.println("In memory running - nothing to load");

    }

    @Override
    public List<Book> getAll() {
       return list;
    }

}
