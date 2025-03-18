package fr.uga.l3miage.tp1.bis.controllers;

import fr.uga.l3miage.tp1.bis.endpoints.ClientEndpoints;
import fr.uga.l3miage.tp1.bis.mappers.CommandMapper;
import fr.uga.l3miage.tp1.bis.responses.CommandResponse;
import fr.uga.l3miage.tp1.bis.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequiredArgsConstructor
@RestController
public class ClientController implements ClientEndpoints {
    private final ClientService clientService;
    private final CommandMapper commandMapper;

    @Override
    public Set<CommandResponse> getAllCommand(Long idClient) {
        return commandMapper.toResponses(clientService.getAllCommandByClient(idClient));
    }
}
