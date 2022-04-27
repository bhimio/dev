package IO;

import interfaces.ConsoleIo;

public class ClassRosterView {
    private ConsoleIo io = new Console();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");

        return io.getInt("Please select from the above choices.", 1, 5);
    }
}
