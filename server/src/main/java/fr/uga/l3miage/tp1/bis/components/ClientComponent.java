package fr.uga.l3miage.tp1.bis.components;

import fr.uga.l3miage.tp1.bis.domain.models.Client;
import fr.uga.l3miage.tp1.bis.exceptions.technical.ClientEntityNotFoundException;
import fr.uga.l3miage.tp1.bis.mappers.ClientMapper;
import fr.uga.l3miage.tp1.bis.repositories.ClientEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientComponent {
    private final ClientEntityRepository clientEntityRepository;
    private final ClientMapper clientMapper;

    public Client getClient(Long idClient) throws ClientEntityNotFoundException {
        return clientMapper.toClient(clientEntityRepository.findById(idClient)
                .orElseThrow(() -> new ClientEntityNotFoundException(String.format("Le client [%s] n'existe pas", idClient))));
    }
}
