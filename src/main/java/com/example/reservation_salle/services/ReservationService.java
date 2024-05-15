package com.example.reservation_salle.services;

import com.example.reservation_salle.entities.Reservation;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    Reservation saveReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    Reservation getReservation(int id);

    List<Reservation> getAllReservation();

    void deleteReservationById(int id);

    void deleteAllReservation();


}

