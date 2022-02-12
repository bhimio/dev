package mod1;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {  
        //strings 
        String stringNum, name;

        //floats 
        float num ,rNum;
        rNum = 45;
        //make scaner
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your name?");
        name = inputReader.nextLine();
        System.out.print("Hello " + name + "! I have a secret number can you guess it?:");
        stringNum = inputReader.nextLine();
        num = Float.parseFloat(stringNum);
        if (num == rNum) {
            System.out.println("Good job you figuerd it out!");
        }
        if (num > rNum) {
            System.out.println("To bad that number was to large :(");
        }
        if (num < rNum) {
            System.out.println("Sorry that number is to small :(");
        }
    }
}
