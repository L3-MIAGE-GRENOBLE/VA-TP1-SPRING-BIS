package fr.uga.l3miage.tp1.bis.handlers;

import fr.uga.l3miage.tp1.bis.errors.ErrorResponse;
import fr.uga.l3miage.tp1.bis.errors.ErrorType;
import fr.uga.l3miage.tp1.bis.exceptions.rest.EmailInvalidFormatRestException;
import fr.uga.l3miage.tp1.bis.exceptions.rest.EmptyCommandRestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BadRequestHandler {

    @ExceptionHandler(EmptyCommandRestException.class)
    public ResponseEntity<ErrorResponse> handleEmptyCommandRestException(EmptyCommandRestException e) {
        return ResponseEntity
                .badRequest()
                .body(ErrorResponse
                        .builder()
                        .type(ErrorType.CREATION_EMPTY_COMMAND)
                        .error(e.getMessage())
                        .build());
    }

    @ExceptionHandler(EmailInvalidFormatRestException.class)
    public ResponseEntity<ErrorResponse> handleEmailInvalidFormatRestException(EmailInvalidFormatRestException e) {
        return ResponseEntity
                .badRequest()
                .body(ErrorResponse
                        .builder()
                        .type(ErrorType.EMAIL_INVALID_EXCEPTION)
                        .error(e.getMessage())
                        .build());
    }
}
