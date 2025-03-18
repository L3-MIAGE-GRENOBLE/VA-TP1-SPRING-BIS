package fr.uga.l3miage.tp1.bis.repositories;

import fr.uga.l3miage.tp1.bis.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findFirstByName(String name);
}