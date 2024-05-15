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

  public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation de l'identifiant
    private long id_salle;
    private String nom_salle;
    private int Capacite;
    private String type_equipement;
    private double tarif;
    private String photo;
    private String adresse_salle;
    private boolean disponibilite;




    @ManyToOne
    public Reservation reservation2;

}
