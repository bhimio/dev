import java.util.Scanner;

public class Window {
    public static void main(String[] args) {
        //declare hight and width
        float hight;
        float width;
        //strings
        String stringHight;
        String stringWidth;
        String stringReview;
        //other stuff
        float price;
        float pirimiter;
        float area;

        //scanner
        Scanner myScanner = new Scanner(System.in);

        //hight
        System.out.println("please enter window hight in feet");
        stringHight = myScanner.nextLine();
        
        //whidth
        System.out.println("please enter window width in feet");
        stringWidth = myScanner.nextLine();
        
        //conversion
        hight = Float.parseFloat(stringHight);
        width = Float.parseFloat(stringWidth);

        //math
        pirimiter = 2 * (hight + width);
        area = hight * width;
        price = ((3.50f * area) + (2.25f * pirimiter));
        
        //print results
        System.out.println("window hight = " + stringHight +(" feet"));
        System.out.println("window whidth = " + stringWidth + (" feet"));
        System.out.println("window area = " + area + (" square feet"));
        System.out.println("window lining = " + pirimiter + (" feet"));
        System.out.println("price = $" + price);
        System.out.println("");
        // Scanner again
        System.out.println("was this program good");
        stringReview = myScanner.nextLine();
        System.out.println("thank you for your input");
        System.out.println(stringReview);
    }
}
