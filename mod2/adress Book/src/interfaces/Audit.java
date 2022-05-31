package interfaces;

import exceptions.PersistenceException;

public interface Audit {
    /**
     * writes a Audit
     * 
     * @param entry
     * @throws ClassRosterPersistenceException
     */
    void writeAuditEntry(String entry) throws PersistenceException;
}
