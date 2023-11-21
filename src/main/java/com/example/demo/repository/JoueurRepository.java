package com.example.demo.repository;

import com.example.demo.entity.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {
}