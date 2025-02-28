package fr.uga.l3miage.tp1.bis.repositories;

import org.example.entities.CandidatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CandidatRepository extends JpaRepository<CandidatEntity, Long> {
    Set<CandidatEntity> findAllByType(String type);
}
