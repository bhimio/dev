package mod1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many FizzBuzzes?");
        String numStr = sc.nextLine();
        int num = Integer.parseInt(numStr);
        int times =0;
        for (int i = 1; times < num; i++){
            if (i % 15 == 0) {
                System.out.println("fizz! buzz!");
                times++;
            } else if (i % 5 == 0) {
                System.out.println("buzz!");
                times++;
            } else if (i % 3 == 0) {
                System.out.println("fizz!");
                times++;
            } else {
                System.out.println(i);
            }
        }
    }
}
