package fr.uga.l3miage.tp1.bis.exceptions.rest;

public class ClientNotFoundRestException extends RuntimeException {
    public ClientNotFoundRestException(String message) {
        super(message);
    }
}
