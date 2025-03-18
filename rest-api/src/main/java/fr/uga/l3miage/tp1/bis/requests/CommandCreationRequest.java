package fr.uga.l3miage.tp1.bis.requests;

import java.util.Collection;

public record CommandCreationRequest(
    Collection<ProductRequest> products
) {
}
