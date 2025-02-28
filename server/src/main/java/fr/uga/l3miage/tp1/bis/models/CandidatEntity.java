package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import org.example.enums.StatusCandidat;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class CandidatEntity {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private StatusCandidat statusCandidat;
    @Max(100)
    private Double note;
    @ManyToOne
    private CirconscriptionEntity circonscriptionEntity;
}
