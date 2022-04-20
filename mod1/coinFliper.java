package mod1;

import java.util.Random;

public class coinFliper {
    
    public static void main(String[] args) {
        // set random
        Random randomizer = new Random();

        // set variables
        boolean coin;

        // flip coin
        System.out.println("this program will flip a coin");
        coin = randomizer.nextBoolean();
        if (coin) {
            System.out.println("you got heads");
        } else {
            System.out.println("you got tails"); 
        }
    }
}
