package mod1;

import java.util.Scanner;

public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        //declar all variables
        String noun1, noun2, pnoun1, pnoun2, pnoun3, adj1, adj2, verb, pverb, number;

        //make the last scanner (hopefully)
        Scanner myScanner = new Scanner(System.in);

        //use the last Scanner (hopefully)
        System.out.println("This is a mini mad libs!");
        System.out.println("");
        System.out.println("noun");
        noun1 = myScanner.nextLine();
        System.out.println("noun");
        noun2 = myScanner.nextLine();
        System.out.println("plural noun");
        pnoun1 = myScanner.nextLine();
        System.out.println("plural noun");
        pnoun2 = myScanner.nextLine();
        System.out.println("plural noun");
        pnoun3 = myScanner.nextLine();
        System.out.println("adjective");
        adj1 = myScanner.nextLine();
        System.out.println("adjective");
        adj2 = myScanner.nextLine();
        System.out.println("verb present tense");
        verb = myScanner.nextLine();
        System.out.println("same verb past tense");
        pverb = myScanner.nextLine();
        System.out.println("number");
        number = myScanner.nextLine();
        System.out.println("");
        System.out.println("    " + noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2 +". Its " + number + "-year mission: to explore strange " + adj2 +" "+ pnoun1 + ", to seek out " + adj2 +" "+ pnoun2 + " and " + adj2 +" "+ pnoun3 + ",");
        System.out.println("to boldly " + verb + " where no one has " + pverb + " before.");
    }
}
