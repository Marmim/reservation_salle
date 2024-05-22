package com.example.reservation_salle.services;

import com.example.reservation_salle.entities.Reservation;
import com.example.reservation_salle.entities.Salle;
import com.example.reservation_salle.repositories.ReservationRepository;
import com.example.reservation_salle.repositories.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleServiceImpl implements SalleService{

    @Autowired
    SalleRepository salleRepository;

    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Salle getSalle(Long id) {
        return salleRepository.findById(id).get();

    }

    @Override
    public List<Salle> getAllSalleInpages() {
        return salleRepository.findAll();
    }

    @Override
    public List<Salle> getAllSalle() {
        return salleRepository.findAll();

    }

        @Override
    public void deleteSalleById(Long id) {

        salleRepository.deleteById(id);
    }

    @Override
    public void deleteAllSalle() {
        salleRepository.deleteAll();

    }

    @Override
    public Page<Salle> getAllSalleByPage(int page, int size) {
        return salleRepository.findAll(PageRequest.of(page,size));
    }


}

