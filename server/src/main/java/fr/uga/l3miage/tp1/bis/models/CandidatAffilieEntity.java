package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Affilie")
public class CandidatAffilieEntity extends CandidatEntity {
    @ManyToOne
    private PartiPolitiqueEntity partiPolitiqueEntity;
}
