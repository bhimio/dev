package mod1;

import java.util.Scanner;

public class HelthyHearts {

    public static void main(String[] args) {
        
        //declare all variables
        String StringAge;
        float age, HR;
        double TargetHR1, TargetHR2;

        //make scanner
        Scanner inputReader = new Scanner(System.in);

        //print
        System.out.print("how old are you? ");
        StringAge = inputReader.nextLine();

        //couculate
        age = Float.parseFloat(StringAge);
        HR = 220 - age;
        TargetHR1 = HR * 0.5;
        TargetHR2 = HR * 0.8;

        //print again
        System.out.println("Your maximum heart rate(HR) should be " + HR + ".");
        System.out.println("Your target HR should be " + TargetHR1 + " - " + TargetHR2 + ".");
    }
}
