package com.example.reservation_salle.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("check")
public class Check extends Paiement {

    private String bankName;
    private String bankId;


}
