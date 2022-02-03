package mod1;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] args) {
        
        //declar the variables
        String math1, math2, math3, Eightplanet;
       
        // Make scanner
        Scanner myScanner = new Scanner(System.in);

        // use scanner
        System.out.println("what is 14 x 6?");
        math1 = myScanner.nextLine();
        System.out.println("what is 66 -:- 11?");
        math2 = myScanner.nextLine();
        System.out.println("what is 76 + 33.55 x .5 -:- 4");
        math3 = myScanner.nextLine();
        System.out.println("which planet is the last from the sun");
        Eightplanet = myScanner.nextLine();

        //print results
        System.out.println("did you know that 14 x 6 is " + Eightplanet);
        System.out.println("did you know that 66 -:- 11 is " + math3);
        System.out.println("did you know that 76 + 33.55 x .5 -:- 4 is " + math2);
        System.out.println("did you know that the last planet from the sun is " + math1);
    }
}
