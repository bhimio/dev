package mod1;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        //variables
        String name, stringAge;
        float age, num;

        //make scanner
        Scanner myScanner = new Scanner(System.in);

        //use another scanner
        System.out.print("what is your name? ");
        name = myScanner.nextLine();
        System.out.println("");
        System.out.print("how old are you? ");
        stringAge = myScanner.nextLine();
        age = Float.parseFloat(stringAge);
        num = 2022 - age;
        if(num <= 2005){
            System.out.println(name + "Pixar's 'Up' came out half a decade ago.");
        }
        if(num <= 1995){
            System.out.println(name + "The first Harry Potter came out over 15 years ago.");  
        }
        if(num <= 1985){
            System.out.println(name + "Space Jam came out not last decade, but the one before THAT.");
        }
        if(num <= 1975){
            System.out.println(name + "The original Jurassic Park release is closer to the lunar landing, than today.");
        }
        if(num <= 1965){
            System.out.println(name + "MASH has been around for almost half a century!");
        }
    }
}
