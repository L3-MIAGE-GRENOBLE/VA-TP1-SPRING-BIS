package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Independant")
public class CandidatIndependantEntity extends CandidatEntity {
}
