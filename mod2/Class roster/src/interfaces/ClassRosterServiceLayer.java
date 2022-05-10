package interfaces;

import java.util.List;

import exceptions.ClassRosterDataValidationException;
import exceptions.ClassRosterDuplicateIdException;
import exceptions.ClassRosterPersistenceException;
import model.Student;

public interface ClassRosterServiceLayer {

        /**
         * creates a student but also thows an Exeption if the students id matches
         * another id
         * 
         * @param student
         * @throws ClassRosterDuplicateIdException
         * @throws ClassRosterDataValidationException
         * @throws ClassRosterPersistenceException
         */
        void createStudent(Student student) throws ClassRosterDuplicateIdException,
                        ClassRosterDataValidationException,
                        ClassRosterPersistenceException;

        /**
         * gets all students in the student librairy while also checking the Scanner
         * 
         * @return all students as a list
         * @throws ClassRosterPersistenceException
         */
        List<Student> getAllStudents() throws ClassRosterPersistenceException;

        /**
         * gets a student by searching it by id
         * 
         * @param studentId
         * @return searched student
         * @throws ClassRosterPersistenceException
         */
        Student getStudent(String studentId) throws ClassRosterPersistenceException;

        /**
         * gets a student and then removes it
         * 
         * @param studentId
         * @return deleted student
         * @throws ClassRosterPersistenceException
         */
        Student removeStudent(String studentId) throws ClassRosterPersistenceException;

        /**
         * instantiates all students at run time and then writes to an audit
         * 
         * @throws ClassRosterPersistenceException
         */
        void run() throws ClassRosterPersistenceException;

        /**
         * writes to file and then writes to audit
         * 
         * @throws ClassRosterPersistenceException
         */
        void stopProgram() throws ClassRosterPersistenceException;
}
