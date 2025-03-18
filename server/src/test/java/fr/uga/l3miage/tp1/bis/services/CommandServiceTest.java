package fr.uga.l3miage.tp1.bis.services;

import fr.uga.l3miage.tp1.bis.exceptions.rest.CommandNotFoundRestException;
import fr.uga.l3miage.tp1.bis.exceptions.rest.EmptyCommandRestException;
import fr.uga.l3miage.tp1.bis.exceptions.rest.ProductNotFoundRestException;
import fr.uga.l3miage.tp1.bis.models.CommandEntity;
import fr.uga.l3miage.tp1.bis.models.OrderedProductEntity;
import fr.uga.l3miage.tp1.bis.models.ProductEntity;
import fr.uga.l3miage.tp1.bis.repositories.CommandEntityRepository;
import fr.uga.l3miage.tp1.bis.repositories.OrderedProductEntityRepository;
import fr.uga.l3miage.tp1.bis.repositories.ProductEntityRepository;
import fr.uga.l3miage.tp1.bis.requests.CommandAddProductRequest;
import fr.uga.l3miage.tp1.bis.requests.CommandCreationRequest;
import fr.uga.l3miage.tp1.bis.requests.CommandRemoveProductsRequest;
import fr.uga.l3miage.tp1.bis.requests.ProductRequest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

@AutoConfigureTestDatabase
@SpringBootTest
class CommandServiceTest {
    @Autowired
    private CommandService commandService;
    @Autowired
    private CommandEntityRepository commandEntityRepository;
    @Autowired
    private ProductEntityRepository productEntityRepository;
    @Autowired
    private OrderedProductEntityRepository orderedProductEntityRepository;

    @BeforeEach
    void setUp() {
        orderedProductEntityRepository.deleteAll();
        productEntityRepository.deleteAll();
        commandEntityRepository.deleteAll();
    }

    @Test
    void createCommand_emptyRequets() {
        assertThrows(EmptyCommandRestException.class, () -> commandService.createCommand(new CommandCreationRequest(Set.of())));
    }

    @Test
    void createCommand_productNotExist() {
        assertThrows(ProductNotFoundRestException.class, () -> commandService.createCommand(new CommandCreationRequest(Set.of(new ProductRequest("test", 1)))));
    }

    @Test
    void addProducts_commandNotFound() {
        ProductEntity productTest = ProductEntity.builder().price(10.0).name("test").build();
        productEntityRepository.save(productTest);
        assertThrows(CommandNotFoundRestException.class, () -> commandService.addProducts(1L, new CommandAddProductRequest(Set.of(new ProductRequest("test", 1)))));
    }


    @Test
    void addProducts_productNotExist() {
        CommandEntity commande = CommandEntity.builder()
                .status("")
                .date(Date.from(Instant.now()))
                .orderedProductEntities(Set.of())
                .build();
        commandEntityRepository.save(commande);
        assertThrows(ProductNotFoundRestException.class, () -> commandService.addProducts(commande.getId(), new CommandAddProductRequest(Set.of(new ProductRequest("test", 1)))));
    }

    @Test
    void removeProducts_commandNotFound() {
        assertThrows(CommandNotFoundRestException.class, () -> commandService.removeProducts(1L, new CommandRemoveProductsRequest(Set.of(1L))));
    }

    @Test
    @Disabled
    void removeProducts_emptyCommand() {
        CommandEntity commandEntity = prepareSituation();
        assertThrows(EmptyCommandRestException.class, () -> commandService.removeProducts(commandEntity.getId(), new CommandRemoveProductsRequest(Set.of(0L))));
    }

    @Transactional
    CommandEntity prepareSituation() {
        CommandEntity commandEntity = CommandEntity
                .builder()
                .orderedProductEntities(Set.of())
                .status("OK")
                .date(Date.from(Instant.now()))
                .build();
        commandEntityRepository.save(commandEntity);

        ProductEntity productEntity = ProductEntity
                .builder()
                .name("test")
                .price(10.0)
                .build();
        productEntityRepository.save(productEntity);

        OrderedProductEntity orderedProductEntity1 = OrderedProductEntity
                .builder()
                .commandEntity(commandEntity)
                .quantity(1)
                .productEntity(productEntity)
                .build();
        orderedProductEntityRepository.save(orderedProductEntity1);

        commandEntity.setOrderedProductEntities(Set.of(orderedProductEntity1));
        return commandEntityRepository.save(commandEntity);
    }
}
