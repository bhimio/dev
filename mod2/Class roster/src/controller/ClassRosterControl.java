package controller;

import java.util.List;

import IO.ClassRosterView;
import exceptions.ClassRosterDataValidationException;
import exceptions.ClassRosterDuplicateIdException;
import exceptions.ClassRosterPersistenceException;
import interfaces.ClassRosterServiceLayer;
import model.Student;

public class ClassRosterControl {
	private ClassRosterView view;
	private ClassRosterServiceLayer service;
	ClassRosterPersistenceException e;

	public ClassRosterControl(ClassRosterServiceLayer service, ClassRosterView view) {
		this.service = service;
		this.view = view;
	}

	/**
	 * runs program
	 */
	public void run() {
		boolean keepGoing = true;
		int menuSelection = 0;
		try {
			this.service.run();
			while (keepGoing) {

				menuSelection = getMenuSelection();

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
						service.stopProgram();
						break;
					default:
						unknownCommand();
				}

			}
			exitMessage();
		} catch (ClassRosterPersistenceException | ClassRosterDataValidationException | ClassRosterDuplicateIdException e) {
			view.displayErrorMessage(e.getMessage());
		}
	}

	private int getMenuSelection() {
		return view.printMenuAndGetSelection();
	}

	private void createStudent() throws ClassRosterPersistenceException, ClassRosterDataValidationException,
			ClassRosterDuplicateIdException {
		view.displayCreateStudentBanner();
		boolean hasErrors = false;
		do {
			Student currentStudent = view.getNewStudentInfo();
			try {
				service.createStudent(currentStudent);
				view.displayCreateSuccessBanner();
				hasErrors = false;
			} catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
				hasErrors = true;
				view.displayErrorMessage(e.getMessage());
			}
		} while (hasErrors);
	}

	private void listStudents() throws ClassRosterPersistenceException {
		view.displayDisplayAllBanner();
		List<Student> studentList = service.getAllStudents();
		view.displayStudentList(studentList);
	}

	private void viewStudent() throws ClassRosterPersistenceException {
		view.displayDisplayStudentBanner();
		String studentId = view.getStudentIdChoice();
		Student student = service.getStudent(studentId);
		view.displayStudent(student);
	}

	private void removeStudent() throws ClassRosterPersistenceException {
		view.displayRemoveStudentBanner();
		String studentId = view.getStudentIdChoice();
		service.removeStudent(studentId);
		view.displayRemoveSuccessBanner();
	}

	private void unknownCommand() {
		view.displayUnknownCommandBanner();
	}

	private void exitMessage() {
		view.displayExitBanner();
	}
}
