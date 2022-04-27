package model;

public class Client {
    private int id;
    private String name;
    private int age;
    private int books;

    public Client() {

    }

    public Client(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getBooks() {
        return this.books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
