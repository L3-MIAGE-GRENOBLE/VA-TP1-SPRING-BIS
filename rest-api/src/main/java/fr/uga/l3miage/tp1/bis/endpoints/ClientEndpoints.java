package fr.uga.l3miage.tp1.bis.endpoints;

import fr.uga.l3miage.tp1.bis.responses.CommandResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Set;

@Tag(name = "Client", description = "Création d'un client et récuperation de toutes ses commandes")
@RequestMapping("/api/client")
public interface ClientEndpoints {
    @Operation(description = "Récupérer toutes les commandes d'un client")
    @ApiResponse(responseCode = "200", description = "Toutes les commandes d'un client")
    @ApiResponse(responseCode = "404", description = "Le client n'existe pas")
    @GetMapping("/{idClient}/commands")
    @ResponseStatus(HttpStatus.OK)
    Set<CommandResponse> getAllCommand(@PathVariable(name = "idClient") Long idClient);
}
