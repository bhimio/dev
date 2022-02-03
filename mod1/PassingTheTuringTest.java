package mod1;

import java.util.Scanner;

public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        System.out.println("");
        
        //declare vaiables
        String name, faveColor, StringAge, faveFood;
        float age, combineAge;
        
        //make scanner
        Scanner inputReader = new Scanner(System.in);

        
        //use scanner
        System.out.print("What is your name? ");
        name = inputReader.nextLine();
        System.out.println("Hello " + name + " my name is AI.");
        System.out.println("");
        System.out.print("Oh and by the way how old are you? ");
        StringAge = inputReader.nextLine();
        age = Float.parseFloat(StringAge);
        combineAge = age + 10;
        System.out.println("That's cool " + age + " that pretty old! I'm only 10 year's old");
        System.out.println("OK! If you'r " + age + " and I'm 10 then our combine age is " + combineAge + " isn't that cool!");
        System.out.println("");
        System.out.print("Hey " + name + " what's your favorit color? ");
        faveColor = inputReader.nextLine();
        System.out.println("Cool " + faveColor + "! Mine is lime green");
        System.out.println("");
        System.out.print("Sooo... talking about limes their my favorit food! whats yours? ");
        faveFood =inputReader.nextLine();
        System.out.println("Cool " + faveFood + "! I've never tried that before but it must be delicios!");
        //end scanner
            //later
    }
}
