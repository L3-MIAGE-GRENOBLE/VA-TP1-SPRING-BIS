package fr.uga.l3miage.tp1.bis.exceptions.rest;

public class EmptyCommandRestException extends RuntimeException {
    public EmptyCommandRestException(String message) {
        super(message);
    }
}
