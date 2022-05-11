package exceptions;

public class DataVialationException extends Exception {
    DataVialationException(String msg) {
        super(msg);
    }

    DataVialationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
