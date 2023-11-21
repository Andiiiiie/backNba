package com.example.demo.controller;

import com.example.demo.entity.model.Equipe;
import com.example.demo.repository.EquipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipeController {
    EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }


}
