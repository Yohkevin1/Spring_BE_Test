package MerkMobil.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MerkMobil.API.model.MerkMobil;

public interface MerkMobilRepository extends JpaRepository<MerkMobil, Long> {
    
}
