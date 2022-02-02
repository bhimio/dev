package mod1;
import java.util.Scanner;

public class bestAdderEver {

    public static void main(String[] args){

        // Declare value
        float num1;
        float num2;
        float num3;

        // Declare string
        String Stringnum1;
        String Stringnum2;
        String Stringnum3;

        // The other variables
        float sum1;
        float sum2;
        String rating;

        // Make a Scanner
        Scanner myScanner = new Scanner(System.in);

        // Use the scaner 
        System.out.println("this is a program that will do num1 + num2 + num3");
        System.out.println("please enter num1");
        Stringnum1 = myScanner.nextLine();
        System.out.println("please enter num2");
        Stringnum2 = myScanner.nextLine();
        System.out.println("please enter num3");
        Stringnum3 = myScanner.nextLine();

        // Conversion
        num1 = Float.parseFloat(Stringnum1);
        num2 = Float.parseFloat(Stringnum2);
        num3 = Float.parseFloat(Stringnum3);

        // The adder part
        sum1 = num1 + num2;

        // PRINT!
        System.out.println(num1 + " + " + num2 + " = " + sum1);

        // The adder part
        sum2 = sum1 + num3;

        // PRINT!
        System.out.println(sum1 + " + " + num3 + " = " + sum2);

        // The conclusion
        System.out.println("/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#");
        System.out.println("how was this program?");
        rating = myScanner.nextLine();
        System.out.println("thankyou for your input:");
        System.out.println("");
        System.out.println(rating);
        System.out.println("/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#");
        
    }
    
}
