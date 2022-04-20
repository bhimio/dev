package mod1;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = choseColor(); // call color method here 
        String animal = choseAnimal(); // call animal method again here 
        String colorAgain = choseColor(); // call color method again here 
        int weight = randomNumber(5, 100); // call number method, 
            // with a range between 5 - 200 
        int distance = randomNumber(10, 20); // call number method, 
            // with a range between 10 - 20 
        int number = randomNumber(10000, 20000); // call number method, 
            // with a range between 10000 - 20000 
        int time = randomNumber(2, 6); // call number method, 
            // with a range between 2 - 6            
    
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal 
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");
    }
    public static String choseAnimal(){
        int animal = randomNumber(0, 12);
        String stringAnimal;
        if (animal == 1) {
            stringAnimal = "hippo";
        } else if (animal == 2) {
            stringAnimal = "bird";
        } else if (animal == 3) {
            stringAnimal = "tiger";
        } else if (animal == 4) {
            stringAnimal = "lepord";
        } else if (animal == 5) {
            stringAnimal = "lion";
        } else if (animal == 6) {
            stringAnimal = "cat";
        } else {
            stringAnimal = "dog";
        }
        return stringAnimal;
    }
    public static String choseColor(){
        int color = randomNumber(0, 12);
        String stringColor;
        if (color == 1) {
            stringColor = "red";
        } else if (color == 2) {
            stringColor = "blue";
        } else if (color == 3) {
            stringColor = "green";
        } else if (color == 4) {
            stringColor = "yelow";
        } else if (color == 5) {
            stringColor = "white";
        } else if (color == 6) {
            stringColor = "copper";
        } else {
            stringColor = "black";
        }
        return stringColor;
    }
    public static int randomNumber(int y, int z){
        Random randomnumber = new Random();
        int x = z - y;
        int num = randomnumber.nextInt(x);
        return num + y;
    }
}
