package ua.donskykh.mybookstore.controller;

import java.io.Serializable;

public class BookNotFoundExeption extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;

    public BookNotFoundExeption(String message) {
        this.message = System.currentTimeMillis() + " : " + message;
    }

    public BookNotFoundExeption() {
        this("Book not available!");
    }

    public String getMessage() {
        return message;
    }
}

