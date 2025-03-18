package fr.uga.l3miage.tp1.bis.responses;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CommandResponse {
    private Collection<OrderedProductResponse> orderedProducts;
}
