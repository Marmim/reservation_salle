package com.example.reservation_salle.services;

import com.example.reservation_salle.entities.Reservation;
import com.example.reservation_salle.entities.Salle;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface SalleService {
        Salle saveSalle(Salle salle);

        Salle updateSalle(Salle salle);

        Salle getSalle(Long id);

        List<Salle> getAllSalleInpages();

        List<Salle> getAllSalle();

        void deleteSalleById(Long id);

        void deleteAllSalle();

        Page<Salle> getAllSalleByPage(int page ,int size);
}





