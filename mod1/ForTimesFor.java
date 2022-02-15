package mod1;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        //scanner
        Scanner whynot = new Scanner(System.in);
        
        //variables
        int num, anser, imput, score;
        String stringNum, stringImput;
        score = 15;

        //print
        System.out.print("Which times table shall I recite? ");
        stringNum = whynot.nextLine();
        num = Integer.parseInt(stringNum);

        //for loop
        for (int num2 = 0; num2 < 15; num2++) {
            anser = num * num2;
            System.out.print(num2 + " x " + num + " is: ");
            stringImput = whynot.nextLine();
            imput = Integer.parseInt(stringImput);

            //if statement
            if (imput != anser) {
                System.out.println("Sorry no, the answer is: " + anser);
                score--;
            } else {
                System.out.println("Correct!");
            }
        }

        //score
        System.out.println("You got " + score + " correct.");

        //end of program #######################################################################
    }
}
