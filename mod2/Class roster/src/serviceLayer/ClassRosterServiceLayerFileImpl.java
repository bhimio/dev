package serviceLayer;

import java.util.List;

import exceptions.ClassRosterDataValidationException;
import exceptions.ClassRosterDuplicateIdException;
import exceptions.ClassRosterPersistenceException;
import interfaces.ClassRosterAuditDao;
import interfaces.ClassRosterDao;
import interfaces.ClassRosterServiceLayer;
import model.Student;

public class ClassRosterServiceLayerFileImpl implements ClassRosterServiceLayer {

    private ClassRosterAuditDao auditDao;

    private ClassRosterDao dao;

    public ClassRosterServiceLayerFileImpl(ClassRosterDao dao, ClassRosterAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    private void validateStudentData(Student student) throws ClassRosterDataValidationException {

        if (student.getFirstName() == null
                || student.getFirstName().trim().length() == 0
                || student.getLastName() == null
                || student.getLastName().trim().length() == 0
                || student.getCohort() == null
                || student.getCohort().trim().length() == 0) {

            throw new ClassRosterDataValidationException(
                    "ERROR: All fields [First Name, Last Name, Cohort] are required.");
        }
    }

    @Override
    public void createStudent(Student student) throws ClassRosterDataValidationException,
            ClassRosterPersistenceException, ClassRosterDuplicateIdException {

        // First check to see if there is alreay a student
        // associated with the given student's id
        // If so, we're all done here -
        // throw a ClassRosterDuplicateIdException
        if (dao.getStudent(student.getStudentId()) != null) {
            throw new ClassRosterDuplicateIdException(
                    "ERROR: Could not create student.  Student Id "
                            + student.getStudentId()
                            + " already exists");
        }

        // Now validate all the fields on the given Student object.
        // This method will throw an
        // exception if any of the validation rules are violated.
        validateStudentData(student);

        // We passed all our business rules checks so go ahead
        // and persist the Student object
        dao.addStudent(student.getStudentId(), student);

        // The student was successfully created, now write to the audit log
        auditDao.writeAuditEntry(
                "Student " + student.getStudentId() + " CREATED.");
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        Student removedStudent = dao.removeStudent(studentId);
        // Write to audit log
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED.");
        return removedStudent;
    }

    @Override
    public void run() throws ClassRosterPersistenceException {
        dao.run();
        auditDao.writeAuditEntry("||||||||||||||| Sucesfull: start runing program |||||||||||||||");
    }

    @Override
    public void stopProgram() throws ClassRosterPersistenceException {
        dao.stopProgram();
        auditDao.writeAuditEntry("||||||||||||||| Sucesfull: stop program |||||||||||||||");
    }
}
