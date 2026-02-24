package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    String fullName;
    @NotBlank
    int age;
    @NotBlank
    String position;
    @NotBlank
    int jerseyNumber;
    @NotBlank
    String nationality;
    List<String> achievement;


    @ManyToOne
    @JoinColumn(name = "club_id")
    Club club;



}
