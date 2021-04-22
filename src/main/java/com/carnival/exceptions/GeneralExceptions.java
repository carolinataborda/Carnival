package com.carnival.exceptions;

public class GeneralExceptions extends AssertionError{

    private static final long serialVersionUID = 1L;

    public GeneralExceptions(String message, Throwable cause){ super(message,cause); }
}
