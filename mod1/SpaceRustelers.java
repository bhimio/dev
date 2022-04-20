package mod1;

public class SpaceRustelers {
    public static void main(String[] args) {
        
        /*
        this is going to be a vidio game one day....
        one day in the far futer just imagin
        _____________________________________
        |   8   8                   8   8   |
        |  888 888                 888 888  |
        |***********             ***********|
        |!   \ /   !             !   \ /   !|
        |:    "    :             :    "    :|
        -------------------------------------
        */

        // set variables
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        if(cows > (aliens)){
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        else if ((cows + 10) < aliens){
            System.out.println("Why'd we hire so many green guys?");
        }
        else{
            System.out.println("Looks like we'v got the right amount of green guys!");
        }
    }
}
