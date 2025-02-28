package fr.uga.l3miage.tp1.bis.repositories;

import org.example.entities.ResultatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ResultatRepository extends JpaRepository<ResultatEntity, Long> {

    Set<ResultatEntity> findAllByCandidatEntityIdEqualsAndCirconscriptionEntityIdEquals(Long candidatEntityId, Long circonscriptionEntityId);
}
