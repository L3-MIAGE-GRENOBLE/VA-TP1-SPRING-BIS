package fr.uga.l3miage.tp1.bis.exceptions.rest;

public class ProductNotFoundRestException extends RuntimeException {
    public ProductNotFoundRestException(String message) {
        super(message);
    }
}
