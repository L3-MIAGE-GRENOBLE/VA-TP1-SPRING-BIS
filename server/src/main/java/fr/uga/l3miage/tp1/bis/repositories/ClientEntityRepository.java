package fr.uga.l3miage.tp1.bis.repositories;

import fr.uga.l3miage.tp1.bis.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientEntityRepository extends JpaRepository<ClientEntity, Long> {
}