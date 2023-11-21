package com.example.demo.service;

import com.example.demo.entity.model.Equipe;
import com.example.demo.entity.model.Match;
import com.example.demo.entity.model.Saison;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    public List<Match> get_Matchs(Equipe equipe, Saison saison)
    {
        return null;
    }

    public int get_nbr_matchs(Equipe equipe, Saison saison)
    {
        return get_Matchs(equipe,saison).size();
    }
}
