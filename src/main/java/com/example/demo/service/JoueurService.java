package com.example.demo.service;

import com.example.demo.entity.assoc.AssocJoueurEquipe;
import com.example.demo.entity.model.Joueur;
import com.example.demo.entity.model.Saison;
import com.example.demo.models.Statistique;
import com.example.demo.repository.AssocJoueurEquipeRepository;
import com.example.demo.repository.JoueurRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JoueurService {
    JoueurRepository joueurRepository;
    AssocJoueurEquipeRepository assocJoueurEquipeRepository;
    public Statistique get_statistique(Joueur joueur,Saison saison)
    {
        Statistique statistique=new Statistique();
        statistique.setJoueur(joueur);
        statistique.setEquipe(assocJoueurEquipeRepository.findByJoueurAndSaison(joueur,saison).getEquipe());
        //statistique.setMatchs();
        return null;
    }

    public List<Statistique> get_statistiques(Saison saison)
    {
        List<Joueur> joueurList=joueurRepository.findAll();
        List<Statistique> statistiqueList=new ArrayList<>();
        for (Joueur joueur:joueurList)
        {
            statistiqueList.add(get_statistique(joueur,saison));
        }
        return statistiqueList;
    }
}
