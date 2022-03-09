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
}
