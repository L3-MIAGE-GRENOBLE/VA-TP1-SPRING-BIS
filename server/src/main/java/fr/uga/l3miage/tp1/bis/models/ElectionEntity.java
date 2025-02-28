package fr.uga.l3miage.tp1.bis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.util.Set;

@Entity
public class ElectionEntity {
    @Id
    private Long id;
    private String titre;
    private Date date;
    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    private Set<CirconscriptionEntity> circonscriptionEntitySet;
}
