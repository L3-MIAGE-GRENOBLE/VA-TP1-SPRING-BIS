package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.util.Set;

@Entity
public class PartiPolitiqueEntity {
    @Id
    private Long id;
    private String nom;
    private Date dateCreation;
    @OneToMany(mappedBy = "partiPolitiqueEntity")
    private Set<CandidatAffilieEntity> candidatAffiliesEntities;
}

