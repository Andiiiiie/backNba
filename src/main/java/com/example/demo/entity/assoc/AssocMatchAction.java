package com.example.demo.entity.assoc;

import com.example.demo.entity.model.Action;
import com.example.demo.entity.model.Joueur;
import com.example.demo.entity.model.Match;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "assoc_match_action")
public class AssocMatchAction {
    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "joueur_id")
    private Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

}