package mod1;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        boolean isRoomClean = false;
        Random ran = new Random();
        int timesAsked = 0;
        do {
            timesAsked++;
            if (timesAsked == 15) {
                System.out.println("");
            }
            int chance = ran.nextInt(100) + 1;
            int teenagerChance = 5 * timesAsked;
            System.out.println("Clean your room                 (x" + timesAsked + ")");
        } while (!isRoomClean);
    }
}
