package fr.uga.l3miage.tp1.bis.domain.models;

import lombok.Data;

import java.util.Collection;

@Data
public class Command {
    private Collection<OrderedProduct> orderedProducts;
}
