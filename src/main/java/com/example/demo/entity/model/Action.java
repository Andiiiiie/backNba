package com.example.demo.entity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "action")
public class Action {
    @ManyToOne
    @JoinColumn(name = "type_action_id")
    private TypeAction typeAction;


    @Column(name = "temps")
    private LocalDateTime temps;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}