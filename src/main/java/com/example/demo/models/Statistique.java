package com.example.demo.models;

import com.example.demo.entity.model.Equipe;
import com.example.demo.entity.model.Joueur;

public class Statistique {
    Joueur joueur;
    Equipe equipe;
    int Matchs;
    int MatchJouees;
    double PointsParMatch;
    double RebondParMatch;
    double PasseDeciciveParMatch;
    double MinutesParMatch;
    double Efficacite;
    double FG_pourcentage;
    double P3_pourcentage;

    double pourcentage_LF;


    public Statistique() {
    }






    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getMatchs() {
        return Matchs;
    }

    public void setMatchs(int matchs) {
        Matchs = matchs;
    }

    public int getMatchJouees() {
        return MatchJouees;
    }

    public void setMatchJouees(int matchJouees) {
        MatchJouees = matchJouees;
    }

    public double getPointsParMatch() {
        return PointsParMatch;
    }

    public void setPointsParMatch(double pointsParMatch) {
        PointsParMatch = pointsParMatch;
    }

    public double getRebondParMatch() {
        return RebondParMatch;
    }

    public void setRebondParMatch(double rebondParMatch) {
        RebondParMatch = rebondParMatch;
    }

    public double getPasseDeciciveParMatch() {
        return PasseDeciciveParMatch;
    }

    public void setPasseDeciciveParMatch(double passeDeciciveParMatch) {
        PasseDeciciveParMatch = passeDeciciveParMatch;
    }

    public double getMinutesParMatch() {
        return MinutesParMatch;
    }

    public void setMinutesParMatch(double minutesParMatch) {
        MinutesParMatch = minutesParMatch;
    }

    public double getEfficacite() {
        return Efficacite;
    }

    public void setEfficacite(double efficacite) {
        Efficacite = efficacite;
    }

    public double getFG_pourcentage() {
        return FG_pourcentage;
    }

    public void setFG_pourcentage(double FG_pourcentage) {
        this.FG_pourcentage = FG_pourcentage;
    }

    public double getP3_pourcentage() {
        return P3_pourcentage;
    }

    public void setP3_pourcentage(double p3_pourcentage) {
        P3_pourcentage = p3_pourcentage;
    }

    public double getPourcentage_LF() {
        return pourcentage_LF;
    }

    public void setPourcentage_LF(double pourcentage_LF) {
        this.pourcentage_LF = pourcentage_LF;
    }
}
