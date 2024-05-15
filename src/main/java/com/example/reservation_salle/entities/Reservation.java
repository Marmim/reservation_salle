package com.example.reservation_salle.entities;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int idReservation;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date date_fin;
    private LocalTime heure_debut;
    private LocalTime heure_fin;
    private String SalleReserve;
    private String NomReservant;


    //lazy:les entités associées ne seront récupérées qu'au moment où elles seront réellement utilisées.
    @OneToMany(mappedBy = "reservation1",fetch = FetchType.LAZY)
    public List<Utilisateurs> utilisateurs=new ArrayList<>();
    @OneToMany(mappedBy = "reservation2",fetch = FetchType.LAZY)
    public List<Salle> salles=new ArrayList<>();



}
