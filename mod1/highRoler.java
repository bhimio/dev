package mod1;

import java.util.Random;
import java.util.Scanner;

public class highRoler {
    public static void main(String[] args) {
       // set randomizer
       Random randomizer = new Random();

       // set scanner
       Scanner myScanner = new Scanner(System.in);

       // set variables
       int roll, die, die2, die3, die4, die5, die6, die7, die8, die9, die10, Amount;
       String stringroll, stringAmount;

       // ask die
       System.out.println("how many sides dose youre die have?");
       stringroll = myScanner.nextLine();
       roll = Integer.parseInt(stringroll);
       System.out.println("how many die do you have?");
       stringAmount = myScanner.nextLine();
       Amount = Integer.parseInt(stringAmount);

       // roll dice
       die = randomizer.nextInt(roll);
       die2 = randomizer.nextInt(roll);
       die3 = randomizer.nextInt(roll);
       die4 = randomizer.nextInt(roll);
       die5 = randomizer.nextInt(roll);
       die6 = randomizer.nextInt(roll);
       die7 = randomizer.nextInt(roll);
       die8 = randomizer.nextInt(roll);
       die9 = randomizer.nextInt(roll);
       die10 = randomizer.nextInt(roll);

       if (Amount > 10){
           System.out.println("you are roling to many dice were setinng it to ten");
           Amount = 10;
       }
       System.out.println("NOW LETS ROLLLLL!!!");
       if (Amount == 1) {
           if (roll == 1) {
               System.out.println("you roled a critical failure: you rolled a 1");
           } else if (roll == die) {
            System.out.println("you rolled a critical sucsess: you rolled a" + die);
           } else {
               System.out.println("youre die roll is " + roll);
           }
       } else {
        System.out.println("your first die roll is " + die);
        System.out.println("your second die roll is " + die2);
        if (Amount > 2) {
            System.out.println("your third die roll is " + die3);
            if (Amount > 3) {
                System.out.println("your forth die roll is " + die4);
                if (Amount > 4) {
                    System.out.println("your fifth die roll is " + die5);
                    if (Amount > 5) {
                        System.out.println("your sixth die roll is " + die6);
                        if (Amount > 6) {
                            System.out.println("your seventh die roll is " + die);
                            if (Amount > 7) {
                                System.out.println("your eighth die roll is " + die8);
                                if (Amount > 8) {
                                    System.out.println("your ninth die roll is " + die9);
                                    if (Amount == 10) {
                                        System.out.println("your tenth die roll is " + die10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
       }
    }
}
