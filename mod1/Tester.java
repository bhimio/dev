package mod1;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int go, no, how, hohoho, hahaha, rats ,gnats;
        boolean sow = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a few numbers");
        go = userInput.nextInt();
        no = userInput.nextInt();
        how = userInput.nextInt();
        hohoho = userInput.nextInt();
        hahaha = userInput.nextInt();
        rats = userInput.nextInt();
        gnats = userInput.nextInt();
        if(go < 100){
            if(no < 100){
                if(how < 100){
                    if(hohoho < 100){
                        if(hahaha < 100){
                            if(rats < 100){
                                if(gnats < 100){
                                    sow = true;
                                    System.out.println("you won!");
                                }
                            }
                        }
                    }
                }
            }
        }
        if(sow == false){
            System.out.println("you lost the numbers are to high");
        }
    }
}

