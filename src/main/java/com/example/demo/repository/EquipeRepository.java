package com.example.demo.repository;

import com.example.demo.entity.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "",path = "")
public interface EquipeRepository extends PagingAndSortingRepository<Equipe,Integer>, CrudRepository<Equipe,Integer>,JpaRepository<Equipe, Integer> {

}