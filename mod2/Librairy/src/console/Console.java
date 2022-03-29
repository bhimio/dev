package console;

import java.util.Scanner;

public class Console {
    private Scanner sc;
    public Console(Scanner sc) {
        this.sc = sc;
    }


    public int getInt(String prompt) {
        boolean isCorrect = false;
        int value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Integer.parseInt(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a int. Please try again");
            }
        } 
        return value;
    }
    public float getFloat(String prompt) {
        boolean isCorrect = false;
        float value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Float.parseFloat(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a float. Please try again");
            }
        } 
        return value;
    }
    public double getDouble(String prompt) {
        boolean isCorrect = false;
        double value = 0;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Double.parseDouble(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a double. Please try again");
            }
        } 
        return value;
    }
    public boolean getboolean(String prompt) {
        boolean isCorrect = false;
        boolean value = false;
        String userInput;
        while(!isCorrect) {
            System.out.println(prompt);
            userInput = this.sc.nextLine();
            try {
                value = Boolean.parseBoolean(userInput);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("That was not a boolean. Please try again");
            }
        } 
        return value;
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public boolean getYesOrNo(String prompt, String yes, String no){
        String whatToDo = null;
        boolean satifaction = false;
        boolean yn = false;
        
        do {
            System.out .println(prompt + " " + yes + "/" + no);
            whatToDo = sc.nextLine();
            if (whatToDo.equals(yes)) {
                yn = true;
                satifaction = true;
            } else if (whatToDo.equals(no)) {
                yn = false;
                satifaction = true;
            } else {
                System.out.println("Uh oh: somthing whent wrong please try again");
            }
        } while (!satifaction);
        return yn;
    }
}
