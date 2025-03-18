package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderedProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer quantity;
    @ManyToOne
    private CommandEntity commandEntity;
    @ManyToOne
    private ProductEntity productEntity;

}