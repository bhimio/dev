public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        // Declare ALL THE THINGS
        int butterflies, beetles, bugs;
        String color, size, shape, thing;
        double number;

        // Now give a all of them some values
        butterflies = 3;
        beetles = 4;
        color = "blue";
        size = "large";
        shape = "square";
        thing = "habitat";
        number = 1;
        bugs = butterflies + beetles;

        // now print
        System.out.println("There are only " + butterflies + " " + color + " butterflies in the " + size + " " + shape + " " + thing + ",");
        System.out.println("but " + bugs + " bugs total.");

        // dog eats one buterfly
        System.out.println("Uh oh, my dog ate " + number + " of the buterflies");
        butterflies--;

        // more print
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But still " + bugs + " bugs left, wait a minute!!!");
        System.out.println("Maybe I just counted wrong the first time...");
    }
}
