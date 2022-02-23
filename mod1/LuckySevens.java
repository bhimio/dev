package mod1;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how much money do you have? $");
        String stringMoney = sc.nextLine();
        int money = Integer.parseInt(stringMoney);
        
        int maxMoney = money;
        int die1, die2, timesRoled, maxTimesRoled, sum;
        timesRoled = 0;
        maxTimesRoled = 0;
        Random roller = new Random();

        while (money > 0) {
            timesRoled++;
            die1 = roller.nextInt(6) + 1;
            die2 = roller.nextInt(6) + 1;
            sum = die1 + die2;
            if (sum == 7) {
                money = money + 4;
            } else {
                money--;
            }
            if (money > maxMoney) {
                maxMoney = money;
                maxTimesRoled = timesRoled;
            }
        }
        System.out.println("you are broke after " + timesRoled + " rolls");
        System.out.println("you should of quit after " + maxTimesRoled + " rolls when you had $" + maxMoney);
    }
}
