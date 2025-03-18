package fr.uga.l3miage.tp1.bis.requests;

import java.util.Set;

public record CommandAddProductRequest(
        Set<ProductRequest> productsToAdd
) {
}
