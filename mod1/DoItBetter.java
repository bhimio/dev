package mod1;

import java.util.Scanner;

public class DoItBetter {
    
    public static void main(String[] args) {

        //declare variables
        String StringMile, StringLang, StringFood, StringPounds;
        float mile, lang, food, pounds;
        float moreMile, moreLang, moreFood, morePounds;

        //make a scanner
        Scanner myScanner = new Scanner(System.in);

        // use scanner 
        System.out.println("how many miles can you run in an hour?");
        StringMile = myScanner.nextLine();
        mile = Float.parseFloat(StringMile);
        moreMile = ((mile * 2) + 1);
        System.out.println("");
        System.out.println("ha you think you can run a lot? I can run " + moreMile + " miles in an hour.");
        System.out.println("");
        System.out.println("how many laguages can you speak?");
        StringLang = myScanner.nextLine();
        lang = Float.parseFloat(StringLang);
        moreLang = ((lang * 2) + 1);
        System.out.println("");
        System.out.println("ha you think you know a lot of languages? I can speak " + moreLang + " languages.");
        System.out.println("");
        System.out.println("how many pound of food can you eat a day?");
        StringFood = myScanner.nextLine();
        food = Float.parseFloat(StringFood);
        moreFood = ((food * 2) + 1);
        System.out.println("");
        System.out.println("ha you think you can eat a lot? I can eat " + moreFood + " pounds of food a day.");
        System.out.println("");
        System.out.println("how many pounds can you lift at a time?");
        StringPounds = myScanner.nextLine();
        pounds = Float.parseFloat(StringPounds);
        morePounds = ((pounds * 2) + 1);
        System.out.println("");
        System.out.println("ha you think you can lift more? I can lift " + morePounds + " pounds at a time.");
        
        //end of program
            //later
    }
}
