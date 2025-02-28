package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

@Entity
public class ResultatEntity {
    @Id
    private Long id;
    @Max(100)
    @Column(precision = 2, updatable = false)
    private Double note;
    private Integer rang;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private CandidatEntity candidatEntity;

    @ManyToOne
    private CirconscriptionEntity circonscriptionEntity;

}
