package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class CirconscriptionEntity {
    @Id
    private Long id ;
    private String nom;
    private String ZoneGeographique;
    @OneToMany(mappedBy = "circonscriptionEntity")
    private Set<ResultatEntity> resultatEntities;
    @OneToMany(mappedBy = "circonscriptionEntity")
    private Set<CandidatEntity> candidatEntities;
}
