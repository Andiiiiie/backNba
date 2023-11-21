package com.example.demo.entity.assoc;

import com.example.demo.entity.model.Equipe;
import com.example.demo.entity.model.Saison;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "assoc_match_equipe")
public class AssocMatchEquipe {
    @ManyToOne
    @JoinColumn(name = "equipe_2_id")
    private Equipe equipe2;

    @ManyToOne
    @JoinColumn(name = "equipe_1_id")
    private Equipe equipe1;

    @ManyToOne
    @JoinColumn(name = "saison_id")
    private Saison saison;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

}