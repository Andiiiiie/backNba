package com.example.demo.repository;

import com.example.demo.entity.assoc.AssocJoueurEquipe;
import com.example.demo.entity.model.Equipe;
import com.example.demo.entity.model.Joueur;
import com.example.demo.entity.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface AssocJoueurEquipeRepository extends JpaRepository<AssocJoueurEquipe, Integer> {
    @Query("select a from AssocJoueurEquipe a where a.joueur = ?1 and a.saison = ?2")
    AssocJoueurEquipe findByJoueurAndSaison(Joueur joueur, Saison saison);

    @Query("select a from AssocJoueurEquipe a where a.equipe = ?1 and a.saison = ?2")
    List<AssocJoueurEquipe> findByEquipeAndSaison(Equipe equipe, Saison saison);
}