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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Paiement_type")

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idPaiment;
    private double montant;

}
