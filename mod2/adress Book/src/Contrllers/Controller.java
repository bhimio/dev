package Contrllers;

import IO.Veiw;

public class Controller {
    Veiw veiw;

    public Controller(Veiw veiw){
        this.veiw = veiw;
    }

    public void run() {
        boolean keepGoing = true;
		int menuSelection = 0;
		while (keepGoing) {

        	menuSelection = getMenu();

        	switch (menuSelection) {
        		case 1:
        			listStudents();
        			break;
        		case 2:
        			createStudent();
        			break;
        		case 3:
        			viewStudent();
        			break;
        		case 4:
        			removeStudent();
        			break;
        		case 5:
        			keepGoing = false;
        			break;
        		default:
        			
        	}

        }
    }
    

    private void removeStudent() {
    }

    private void viewStudent() {
    }

    private void createStudent() {
    }

    private void listStudents() {
    }

    private int getMenu() {
        return veiw.printMenu();
    }
}
