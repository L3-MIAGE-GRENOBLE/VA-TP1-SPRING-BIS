package fr.uga.l3miage.tp1.bis.exceptions.rest;

public class EmailInvalidFormatRestException extends RuntimeException {
    public EmailInvalidFormatRestException(String message) {
        super(message);
    }
}
