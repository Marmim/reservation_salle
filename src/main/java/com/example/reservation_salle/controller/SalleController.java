package com.example.reservation_salle.controller;


import com.example.reservation_salle.entities.Reservation;
import com.example.reservation_salle.entities.Salle;
import com.example.reservation_salle.repositories.SalleRepository;
import com.example.reservation_salle.services.SalleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//Cette annotation est de Lombok et génère un constructeur avec tous les arguments.
@AllArgsConstructor

public class SalleController {
// injecter des dépendances dans la classe(SalleService et SalleRepository)
    @Autowired
    private  SalleService salleService;
    private SalleRepository salleRepository;
//renvoie simplement la vue "CreateSalle".
    @RequestMapping("/CreateSalle")
    public String createSalle(){
        return "CreateSalle";
    }

    // Cette méthode met à jour une salle en utilisant les données du formulaire.
    @RequestMapping("/updateSalle")
    public String updateSalle(@ModelAttribute("SalleVue") Salle salleController) {
        Salle saveSalle = salleService.updateSalle(salleController);
        return "listeSalle";
    }
    @RequestMapping("/saveSalle")
    //@ModelAttribute est utilisé pour lier les données du formulaire à un objet modèle
    public String saveSalle(@ModelAttribute("SalleVue") Salle salleController,ModelMap modelmap) {
        Salle saveSalle = salleService.saveSalle(salleController);
        modelmap.addAttribute("lancementReussi", true);
        return "CreateSalle";
    }

    @RequestMapping("/listeSalle")
    public String listeSalle(ModelMap modelmap,
                             @RequestParam(name = "page",defaultValue = "0") int page,
                             @RequestParam(name = "size",defaultValue = "3") int size

                             ) {
        Page<Salle> salleController = salleService.getAllSalleByPage(page, size);
        modelmap.addAttribute("SalleVue", salleController);
        modelmap.addAttribute("currentPage", page);
        modelmap.addAttribute("pages", new int[salleController.getTotalPages()]);
        return "ListeSalle";
    }
    @RequestMapping("/deleteSalle")
    // Modelmap:transporter des données entre un contrôleur et une vue
    public String deleteSalle(@RequestParam("id") Long id, ModelMap modelmap,
                             @RequestParam(name = "page",defaultValue = "0") int page,
                              @RequestParam(name = "size",defaultValue = "3") int size

                             ) {
        salleService.deleteSalleById(id);
        Page<Salle> salleController = salleService.getAllSalleByPage(page, size);
        modelmap.addAttribute("SalleVue", salleController);
        modelmap.addAttribute("currentPage", page);
        modelmap.addAttribute("pages", new int[salleController.getTotalPages()]);
        return "ListeSalle";
    }


    @RequestMapping("/editSalle")
    //@RequestParam est utilisé pour extraire des paramètres spécifiques de la requête,
    public String editSalle(@RequestParam("id") Long id, ModelMap modelmap) {
       Salle salleController= salleService.getSalle(id);
       modelmap.addAttribute("SalleVue",salleController);
       return "EditSalle";
    }
    @GetMapping("/pageSalles")
    public String getAllSalle(ModelMap modelmap) {
        List<Salle> salle =salleRepository.findAll();
        modelmap.addAttribute("SalleVue", salle);
        return "pageSalles";
    }

}




