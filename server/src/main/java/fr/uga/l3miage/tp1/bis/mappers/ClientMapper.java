package fr.uga.l3miage.tp1.bis.mappers;

import fr.uga.l3miage.tp1.bis.domain.models.Client;
import fr.uga.l3miage.tp1.bis.domain.models.OrderedProduct;
import fr.uga.l3miage.tp1.bis.models.ClientEntity;
import fr.uga.l3miage.tp1.bis.requests.ClientCreationRequest;
import fr.uga.l3miage.tp1.bis.responses.ClientResponse;
import fr.uga.l3miage.tp1.bis.responses.OrderedProductResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {
    
    Client toClient(ClientEntity clientEntity);
    
    ClientResponse toResponse(Client client);

    ClientEntity toEntity(ClientCreationRequest request);

    OrderedProductResponse toOrderedProductResponse(OrderedProduct orderedProduct);
}
