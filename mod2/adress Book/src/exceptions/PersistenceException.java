package exceptions;

public class PersistenceException extends Exception {
    PersistenceException(String msg) {
        super(msg);
    }

    PersistenceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
