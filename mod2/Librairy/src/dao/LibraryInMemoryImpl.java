package dao;

import java.util.ArrayList;
import java.util.List;

import interfaces.LibraryInterface;
import model.Book;
import model.Client;

public class LibraryInMemoryImpl implements LibraryInterface{
    private List<Book> libraryList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();
    private static int id = 11111111;
    private static int id2 = 11111111;
    public Book wrongBook = new Book("uh oh", "uh oh", "uh oh");

    @Override
    public Book create(Book book){
        book.setId(id++);
        book.setCheckedOut(false);
        libraryList.add(book);
        return book;
    }
    @Override
    public Book search(String value, String type){
        int id;
        try {
            id = Integer.parseInt(value);
            for (Book b : libraryList) {
                if (b.getId() == id){
                    return b;
                } 
            }
        } catch (Exception e) {
            return wrongBook;
        }
        try {
            for (Book b : libraryList) {
                if(type.equals("title") && b.getTitle().equals(value)){
                    return b;
                } else if (type.equals("author") && b.getAuthor().equals(value)) {
                    return b;
                }
            }
        } catch (Exception e) {
            return wrongBook;
        }
        return null;
    }
    @Override
    public void checkOut(Book book, boolean checkedOut){
        //book.setCheckedOut(checkedOut);
    }

    @Override
    public Client create(Client client){
        client.setId(id2++);
        client.setAge(client.getAge());
        client.setBooks(client.getBooks());
        client.setName(client.getName());
        return client;
    }
}
