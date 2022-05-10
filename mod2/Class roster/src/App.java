import IO.ClassRosterView;
import IO.Console;
import audit.ClassRosterAuditDaoFileImpl;
import controller.ClassRosterControl;
import dao.ClassRosterDaoFileImpl;
import interfaces.ClassRosterAuditDao;
import interfaces.ClassRosterDao;
import interfaces.ClassRosterServiceLayer;
import interfaces.ConsoleIo;
import serviceLayer.ClassRosterServiceLayerFileImpl;

public class App {
    public static void main(String[] args) throws Exception {
        // Instantiate the UserIO implementation
        ConsoleIo myIo = new Console();
        // Instantiate the View and wire the UserIO implementation into it
        ClassRosterView myView = new ClassRosterView(myIo);
        // Instantiate the DAO
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // Instantiate the Audit DAO
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        // Instantiate the Service Layer and wire the DAO and Audit DAO into it
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerFileImpl(myDao, myAuditDao);
        // Instantiate the Controller and wire the Service Layer into it
        ClassRosterControl controller = new ClassRosterControl(myService, myView);
        // Kick off the Controller
        controller.run();
    }
}
