package mod1;

public class LovesMe {
    public static void main(String[] args) {
        //set variable
        int petles = 34;
        boolean LorLn = false;
        do {
            if (LorLn){
                System.out.println("Loves me!");
                LorLn = false;
            }else if (LorLn == false){
                System.out.println("Loves me NOT!");
                LorLn = true;
            }
            petles--;
        } while (petles > 0);
    }
}
