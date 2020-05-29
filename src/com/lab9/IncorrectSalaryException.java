package com.lab9;

public class IncorrectSalaryException extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     */
    public IncorrectSalaryException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     * @param   message   the detail message.
     */
    public IncorrectSalaryException(String message) {
        super(message);
    }
}