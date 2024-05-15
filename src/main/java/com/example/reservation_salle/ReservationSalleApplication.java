package com.example.reservation_salle;

import com.example.reservation_salle.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ReservationSalleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationSalleApplication.class, args);
    }


}
