package IO;

import interfaces.consoleIO;

public class Veiw {
    consoleIO io;
    private final String SPACE = "    ";

    Veiw(consoleIO io) {
        this.io = io;
    }

    public int printMenu() {
        io.print("==================");
        io.print("chose one of the folowing");
        io.print(SPACE + "1: create adress");
        io.print(SPACE + "2: list all adresses");
        io.print(SPACE + "3: search for a adress");
        io.print(SPACE + "4: count all the adresses");
        io.print(SPACE + "5: remove an adress");
        io.print(SPACE + "6: EXIT");

        return io.readInt("", 1, 5);
    }

    public void baner(String msg) {
        io.print("===== " + msg + " =====");
    }

    public void errorMessage(String errorMsg) {
        io.print("==== ERROR ====");
        io.print(errorMsg);
    }
}
