package com.example.reservation_salle.controller;

import com.example.reservation_salle.entities.Reservation;
import com.example.reservation_salle.services.ReservationService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

    public  class ReservationController {
        @Autowired
        private ReservationService reservationService;


        @RequestMapping("/CreateReservation")
        public String createReservation() {
            return "CreateReservation";


        }

        @RequestMapping("/saveReservation")
        public String saveReservation(@ModelAttribute("reservationView") Reservation reservationController) {
            System.out.println(reservationController);
            Reservation saveReservation = reservationService.saveReservation(reservationController);
            return "CreateReservation";
        }
/*
    @GetMapping est utilisé pour les requêtes GET, @PostMapping pour les requêtes POST, tandis que @RequestMapping peut être utilisé pour toutes les méthodes HTTP, mais nécessite plus de configuration pour spécifier le type de requête.
*/

    }

