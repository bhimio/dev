import IO.ClassRosterView;
import IO.Console;
import controller.ClassRosterControl;
import dao.ClassRosterDaoFileImpl;
import interfaces.ClassRosterDao;
import interfaces.ConsoleIo;

public class App {
    public static void main(String[] args) throws Exception {
        ConsoleIo myIo = new Console();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterControl controller = new ClassRosterControl(myDao, myView);
        controller.run();
    }
}
