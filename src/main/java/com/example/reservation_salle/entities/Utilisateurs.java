package com.example.reservation_salle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public  class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUtilisateurs;
    private String nom;
    private String prenom;
    private String tele;
    private String email;
   private String password;

    @ManyToOne
    public Reservation reservation1;



}
