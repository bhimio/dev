package exceptions;

public class SameAdressException extends Exception {
    SameAdressException(String msg) {
        super(msg);
    }

    SameAdressException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
