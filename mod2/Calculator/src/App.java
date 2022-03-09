import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean done = false;
        int a, b, answer;
        String stringDone, type;
        Scanner sc = new Scanner(System.in);
        Console console = new Console(sc);
        SimpleCalculator calc = new SimpleCalculator();
        while (!done) {
            type = console.getString("which method would you like to use (+/-/*/%)");
            a = console.getInt("type in the first number");
            b = console.getInt("type in the next number");
            answer = 0;
            if (type.equals("+")) {
                answer = calc.add(a, b);
            } else if (type.equals("-")) {
                answer = calc.subtract(a, b);
            } else if (type.equals("*")) {
                answer = calc.multiply(a, b);
            } else if (type.equals("%")) {
                answer = calc.divide(a, b);
            } else {
                System.out.print("Error wile prosesing " + type + " please try again    ");
            }
            System.out.println(a +" "+ type +" "+ b +" = " + answer);
            stringDone = console.getString("do you want to continue (y/n)");
            if (stringDone.equals("n")) {
                done = true;
                System.out.println("thankyou");
            }
        }
    }
}
