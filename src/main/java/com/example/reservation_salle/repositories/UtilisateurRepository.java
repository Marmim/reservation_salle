package com.example.reservation_salle.repositories;


import com.example.reservation_salle.entities.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UtilisateurRepository extends JpaRepository <Utilisateurs, Long> {
}
