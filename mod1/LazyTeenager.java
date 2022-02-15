package mod1;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        // variables
        int timesAsked, precentChance, otherThing;
        boolean roomClean;
        timesAsked = 0;
        roomClean = false;

        //rando
        Random chance = new Random();

        // while loop
        while (roomClean == false) {
            timesAsked ++;
            if (timesAsked > 15) {
                System.out.println("thats it youre grounded and i'm taking youre Xbox!");
                break;
            } else {
                System.out.println("clean youre room!");
            }
            precentChance = 100 / (timesAsked * 5);
            otherThing = chance.nextInt(precentChance);
            if (otherThing == precentChance) {
                roomClean = true;
            }
        }
    }
}
