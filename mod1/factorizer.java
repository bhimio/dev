package mod1;

import java.util.Scanner;

public class factorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int perfect = 0;
        System.out.println("what number would you like to factorize");
        String stringNum = sc.nextLine();
        int num = Integer.parseInt(stringNum);
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                times++;
                perfect = perfect + i;
            }
        }
            
        if (num == perfect) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        if (times == 1) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}