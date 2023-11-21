package com.example.demo.entity.assoc;

import com.example.demo.entity.model.Equipe;
import com.example.demo.entity.model.Joueur;
import com.example.demo.entity.model.Saison;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "assoc_joueur_equipe")
public class AssocJoueurEquipe {
    @ManyToOne
    @JoinColumn(name = "saison_id")
    private Saison saison;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "joueur_id")
    private Joueur joueur;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

}