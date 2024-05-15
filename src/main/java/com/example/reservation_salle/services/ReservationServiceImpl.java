package com.example.reservation_salle.services;

import com.example.reservation_salle.entities.Reservation;
import com.example.reservation_salle.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(int id) {
 return reservationRepository.findById(id).get();

    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();

    }

    @Override
    public void deleteReservationById(int id) {
    reservationRepository.deleteById(id);
    }

    @Override
    public void deleteAllReservation() {
        reservationRepository.deleteAll();

    }
}
