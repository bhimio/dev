package mod1;

import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {  
        //strings 
        String stringNum, name;

        //booleens
        boolean TorF = false;

        //floats 
        int num ,rNum;
        

        // make randomizer
        Random randomizer = new Random();

        //make scaner
        Scanner inputReader = new Scanner(System.in);

        //use it all
        rNum = randomizer.nextInt(100);
        System.out.println("What is your name?");
        name = inputReader.nextLine();

        System.out.print("Hello " + name + "! I have a secret number can you guess it?:");
        stringNum = inputReader.nextLine();
        num = Integer.parseInt(stringNum);
        if (num == rNum) {
            System.out.println("Good job you figuerd it out!");
            TorF = true;
        }
        if (num > rNum) {
            System.out.println("To bad that number was to large :(");
        }
        if (num < rNum) {
            System.out.println("Sorry that number is to small :(");
        }

        //now for the while loop
        while (TorF == false){
            System.out.println("sorry please try again;");
            stringNum = inputReader.nextLine();
            num = Integer.parseInt(stringNum);
            if (num == rNum) {
                System.out.println("Good job you figuerd it out!");
                TorF = true;
            }
            if (num > rNum) {
                System.out.println("To bad that number was to large :(");
            }
            if (num < rNum) {
                System.out.println("Sorry that number is to small :(");
            }
        }
    }
}
