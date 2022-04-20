package console;

import java.util.List;
import java.util.Scanner;

import model.Book;

public class Console {
    private Scanner sc;
    public Console(Scanner sc) {
        this.sc = sc;
    }

    public void printMenu(){
        System.out.println("1: add a book to the library");
        System.out.println("2: search for a book by id in the library");
        System.out.println("3: search for a book by author in the library");
        System.out.println("4: search for a book by title in the library");
        System.out.println("5: list the books in the library");
        System.out.println("6: exit the library");
    }
    public void printBook(Book book) {
        System.out.println("___________________________");
        System.out.println("title: " + book.getTitle());
        System.out.println("author: " + book.getAuthor());
        System.out.println("id: " + book.getId());
        System.out.println("___________________________");
    }

    public void printBooks(List<Book> books){
        for(Book b: books){
            this.printBook(b);
        }
    }

    public int getInt(String prompt) {
        boolean isCorrect = false;
        int value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Integer.parseInt(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a int. Please try again");
            }
        } 
        return value;
    }
    public float getFloat(String prompt) {
        boolean isCorrect = false;
        float value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Float.parseFloat(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a float. Please try again");
            }
        } 
        return value;
    }
    public double getDouble(String prompt) {
        boolean isCorrect = false;
        double value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Double.parseDouble(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a double. Please try again");
            }
        } 
        return value;
    }
    public boolean getboolean(String prompt) {
        boolean isCorrect = false;
        boolean value = false;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Boolean.parseBoolean(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a boolean. Please try again");
            }
        } 
        return value;
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public boolean getYesOrNo(String prompt, String yes, String no){
        String whatToDo = null;
        boolean satifaction = false;
        boolean yn = false;
        
        do {
            System.out .println(prompt + " " + yes + "/" + no);
            whatToDo = sc.nextLine();
            if (whatToDo.equals(yes)) {
                yn = true;
                satifaction = true;
            } else if (whatToDo.equals(no)) {
                yn = false;
                satifaction = true;
            } else {
                System.out.println("Uh oh: somthing whent wrong please try again");
            }
        } while (!satifaction);
        return yn;
    }
}
