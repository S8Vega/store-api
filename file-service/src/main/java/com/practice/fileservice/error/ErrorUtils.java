package com.practice.fileservice.error;

public class ErrorUtils {

    private static final String NON_EXISTENT_FILE = "El archivo con id (%s) no existe";

    private ErrorUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String nonExistentFile(String id) {
        return String.format(NON_EXISTENT_FILE, id);
    }
}
