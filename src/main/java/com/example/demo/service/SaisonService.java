package com.example.demo.service;

import com.example.demo.entity.model.Saison;
import com.example.demo.repository.SaisonRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Setter
@Getter
@Service
public class SaisonService {
    private  final SaisonRepository saisonRepository;

    public SaisonService(SaisonRepository saisonRepository) {
        this.saisonRepository = saisonRepository;
    }

    public Saison get_last_saison()
    {
        List<Saison> saisonLists=saisonRepository.findByOrderByDateFinDesc();
        return saisonLists.get(0);
    }
}
