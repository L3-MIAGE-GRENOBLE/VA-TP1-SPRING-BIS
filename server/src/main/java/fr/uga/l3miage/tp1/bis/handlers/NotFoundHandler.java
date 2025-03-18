package fr.uga.l3miage.tp1.bis.handlers;

import fr.uga.l3miage.tp1.bis.errors.ErrorResponse;
import fr.uga.l3miage.tp1.bis.errors.ErrorType;
import fr.uga.l3miage.tp1.bis.exceptions.rest.ClientNotFoundRestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFoundHandler {

    @ExceptionHandler(ClientNotFoundRestException.class)
    public ResponseEntity<ErrorResponse> handleClientNotFoundRestException(ClientNotFoundRestException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ErrorResponse
                        .builder()
                        .type(ErrorType.CLIENT_NOT_FOUND)
                        .error(ex.getMessage())
                        .build()
                );

    }
}
