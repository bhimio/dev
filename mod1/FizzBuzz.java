package mod1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //vars
        int num, fart;
        String stringNum;
        boolean next = true;
        fart = 0;

        //Scanner
        Scanner ooops = new Scanner(System.in);

        // use the scanner 
        System.out.print("How much units fizzing and buzzing do you need in your life? ");
        stringNum = ooops.nextLine();
        num = Integer.parseInt(stringNum);

        //the last for loop
        for (int i = 0; i < num;) {
            if (fart % 3 == 0) {
                System.out.print("fizz!");
                next = false;
                i++;
            }
            if (fart % 5 == 0) {
                System.out.print("buzz!");
                i++;
            } else if (next) {
                System.out.println(fart);
                
            }
            next = true;
            fart++;
        }
    }
}
