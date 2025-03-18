package fr.uga.l3miage.tp1.bis.errors;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorResponse {
    private ErrorType type;
    private String error;
}
