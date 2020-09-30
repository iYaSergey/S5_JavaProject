package com.company.exceptions;

public class InvalidDataException extends RuntimeException {
    public String toString() {
        return "Error: invalid data.";
    }
}
