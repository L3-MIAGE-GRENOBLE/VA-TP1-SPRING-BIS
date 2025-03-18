package fr.uga.l3miage.tp1.bis.services;

import fr.uga.l3miage.tp1.bis.components.ClientComponent;
import fr.uga.l3miage.tp1.bis.domain.models.Client;
import fr.uga.l3miage.tp1.bis.domain.models.Command;
import fr.uga.l3miage.tp1.bis.exceptions.rest.ClientNotFoundRestException;
import fr.uga.l3miage.tp1.bis.exceptions.technical.ClientEntityNotFoundException;
import fr.uga.l3miage.tp1.bis.requests.ClientCreationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientComponent clientComponent;

    // TODO 🚧 21/03/2025 - À faire
    public Client createClient(ClientCreationRequest request){
        return null;
    }

    public Set<Command> getAllCommandByClient(Long idClient) {
        try {
            return clientComponent.getClient(idClient).getCommands();
        } catch (ClientEntityNotFoundException e) {
            throw new ClientNotFoundRestException(
                    e.getMessage());
        }
    }
}
