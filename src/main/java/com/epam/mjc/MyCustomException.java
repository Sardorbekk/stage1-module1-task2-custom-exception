package com.epam.mjc;

public class MyCustomException extends IllegalArgumentException {
    public MyCustomException(long s) {
        super("Could not find student with ID "+s);
    }
}
