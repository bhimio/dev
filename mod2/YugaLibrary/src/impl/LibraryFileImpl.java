package impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.LibraryInterface;
import model.Book;

public class LibraryFileImpl implements LibraryInterface {
    private List<Book> list = new ArrayList<>();
    private static int id = 1;
    private static String DELIMITER = "::";

    @Override
    public void create(Book b) {
        try {
            b.setId(id++);
            list.add(b);
            // write it to the file
            PrintWriter out = new PrintWriter(new FileWriter("src/storage/OutFile.txt"));
            for(Book bk: list){
                out.println(bk.getId() + DELIMITER + bk.getAuthor() + DELIMITER + bk.getTitle());
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("We failed to write to the file");
        }
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
        for (Book b : list) {
            if (b.getAuthor().equals(author)) {
                ret.add(b);
            }
        }
        return ret;
    }

    @Override
    public List<Book> getAll() {
        return list;
    }

    @Override
    public void load() {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader("src/storage/OutFile.txt")));
            String[] parts;
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                parts = line.split("::");

                Book b = new Book();
                b.setId(Integer.parseInt(parts[0]));
                b.setAuthor(parts[1]);
                b.setTitle(parts[2]);

                // add to in memory list for fast lookup
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println("The file does not exist, will be created at run time");
        }
    }
}