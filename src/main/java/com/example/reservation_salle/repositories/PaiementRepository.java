package com.example.reservation_salle.repositories;

import com.example.reservation_salle.entities.Paiement;
import com.example.reservation_salle.entities.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
