package fr.uga.l3miage.tp1.bis.services;

import fr.uga.l3miage.tp1.bis.exceptions.rest.ClientNotFoundRestException;
import fr.uga.l3miage.tp1.bis.exceptions.rest.EmailInvalidFormatRestException;
import fr.uga.l3miage.tp1.bis.requests.ClientCreationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@AutoConfigureTestDatabase
@SpringBootTest
class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @Test
    void createClientWithBadEmail() {
        assertThrows(EmailInvalidFormatRestException.class, ()-> clientService.createClient(new ClientCreationRequest("test","test.com")));
    }

    @Test
    void getAllCommandByClient_clientNotFound(){
        assertThrows(ClientNotFoundRestException.class, ()-> clientService.getAllCommandByClient(1L));
    }
}
