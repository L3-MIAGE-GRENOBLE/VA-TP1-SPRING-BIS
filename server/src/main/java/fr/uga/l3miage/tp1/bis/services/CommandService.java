package fr.uga.l3miage.tp1.bis.services;

import fr.uga.l3miage.tp1.bis.domain.models.Command;
import fr.uga.l3miage.tp1.bis.requests.CommandAddProductRequest;
import fr.uga.l3miage.tp1.bis.requests.CommandCreationRequest;
import fr.uga.l3miage.tp1.bis.requests.CommandRemoveProductsRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommandService {

    // TODO 🚧 21/03/2025 - À faire
    public Command createCommand(CommandCreationRequest request) {
        return null;
    }

    // TODO 🚧 21/03/2025 - À faire
    public Command addProducts(Long idCommand, CommandAddProductRequest request) {
        return null;
    }

    // TODO 🚧 21/03/2025 - À faire
    public Command removeProducts(Long idCommand, CommandRemoveProductsRequest request) {
        return null;
    }
}
