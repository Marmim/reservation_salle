package com.example.reservation_salle.controller;



import com.example.reservation_salle.entities.Utilisateurs;
import com.example.reservation_salle.repositories.UtilisateurRepository;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    public class UtilisateursController {
        @Autowired
        private UtilisateurRepository utilisateurRepository;

        @PostMapping("/saveutilisateurs")
        public String inscription(@ModelAttribute Utilisateurs utilisateurs , ModelMap modelmap)
        {
            // Enregistrement de l'utilisateur dans la base de données
            utilisateurRepository.save(utilisateurs);
            modelmap.addAttribute("enregistrementReussi", true);
            return "CreateSalle";
        }
    }


