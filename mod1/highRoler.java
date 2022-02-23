package mod1;

import java.util.Random;
import java.util.Scanner;

public class highRoler {
    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("how many sides does youre die have");
        String stringDieSides = sc.nextLine();

        int dieSides = Integer.parseInt(stringDieSides);

        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(dieSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == dieSides){
            System.out.println("you roled a critical sucsess");
        }
    }
}
