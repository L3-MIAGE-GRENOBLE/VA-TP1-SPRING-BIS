package fr.uga.l3miage.tp1.bis.exceptions.rest;

public class CommandNotFoundRestException extends RuntimeException {
    public CommandNotFoundRestException(String message) {
        super(message);
    }
}
