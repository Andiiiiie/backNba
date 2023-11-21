package com.example.demo.repository;

import com.example.demo.entity.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "saison",path = "saisons")
public interface SaisonRepository extends PagingAndSortingRepository<Saison,Integer>, CrudRepository<Saison,Integer>,JpaRepository<Saison, Integer> {
    @Query("select s from Saison s order by s.dateFin DESC")
    List<Saison> findByOrderByDateFinDesc();

}