package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String status;

    @OneToMany(mappedBy = "commandEntity",cascade = CascadeType.ALL)
    private Set<OrderedProductEntity> orderedProductEntities;
}

