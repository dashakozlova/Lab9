package com.lab9;

public class FieldLengthLimitException extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     */
    public FieldLengthLimitException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     * @param   message   the detail message.
     */
    public FieldLengthLimitException(String message) {
        super(message);
    }
}