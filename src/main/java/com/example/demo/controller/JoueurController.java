package com.example.demo.controller;

import com.example.demo.entity.model.Saison;
import com.example.demo.repository.SaisonRepository;
import com.example.demo.service.SaisonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoueurController {
    SaisonRepository saisonRepository;
    @GetMapping("saison")
    public Saison get_last()
    {
        SaisonService saisonService=new SaisonService(saisonRepository);
        return saisonService.get_last_saison();
    }

}
