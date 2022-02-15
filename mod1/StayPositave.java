package mod1;

import java.util.Scanner;

public class StayPositave {
    public static void main(String[] args) {
        // create scanner
        Scanner myScanner = new Scanner(System.in);

        //set variables
        int num;
        String stringNum;

        // use scaner
        System.out.print("which number do you want us to count down from: ");
        stringNum = myScanner.nextLine();
        num = Integer.parseInt(stringNum);

        //print numbers
        System.out.println("here it gose!");
        System.out.println("");
        while(num > 0){
            System.out.print(num + ", ");
            num--;
        }
        System.out.println("whew lets stop here!");
    }
}
