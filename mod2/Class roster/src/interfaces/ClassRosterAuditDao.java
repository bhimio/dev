package interfaces;

import exceptions.ClassRosterPersistenceException;

public interface ClassRosterAuditDao {

    /**
     * writes a Audit
     * 
     * @param entry
     * @throws ClassRosterPersistenceException
     */
    void writeAuditEntry(String entry) throws ClassRosterPersistenceException;

}
