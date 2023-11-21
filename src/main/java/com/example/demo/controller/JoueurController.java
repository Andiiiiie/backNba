package com.example.demo.controller;

import com.example.demo.entity.model.Saison;
import com.example.demo.models.Statistique;
import com.example.demo.repository.JoueurRepository;
import com.example.demo.repository.SaisonRepository;
import com.example.demo.service.SaisonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoueurController {
    SaisonRepository saisonRepository;
    JoueurRepository joueurRepository;

    public JoueurController(SaisonRepository saisonRepository, JoueurRepository joueurRepository) {
        this.saisonRepository = saisonRepository;
        this.joueurRepository = joueurRepository;
    }

    @GetMapping("statistiques")
    public List<Statistique> get_statistiques()
    {
        SaisonService saisonService=new SaisonService(saisonRepository);
        Saison saison=saisonService.get_last_saison();
        return null;
    }
    @GetMapping("statistiques/{id}")
    List<Statistique> get_statistiques(@PathVariable int id)
    {
        SaisonService saisonService=new SaisonService(saisonRepository);
        Saison saison=saisonService.get_last_saison();
        return null;
    }

}
