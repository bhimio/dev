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

        System.out.println("how many dice do you have?");
        String stringDieAmount = sc.nextLine();

        int dieAmount = Integer.parseInt(stringDieAmount);

        Random diceRoller = new Random();
        int whileLoop = 0;
        int rollResult =  0;
        do {
            rollResult = diceRoller.nextInt(dieSides) + 1;
            whileLoop ++;
            if (dieAmount ==1) {
                System.out.println("TIME TO ROOOOOOLL THE DICE!");
            }
            
            System.out.println("You rolled a " + rollResult);
            if (dieAmount == 1){
                if (rollResult == 1) {
                    System.out.println("You rolled a critical failure!");
                } else if (rollResult == dieSides){
                    System.out.println("you roled a critical sucses");
                }
            }
        } while (dieAmount > whileLoop);

        
    }
}
