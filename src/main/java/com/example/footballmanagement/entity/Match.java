package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    String opponent;
    @Past
    LocalDateTime date;
    @NotBlank
    String homeOrAwayOrNeutral;
    @NotBlank
    String score;
    @NotBlank
    String competition;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    Club club;






}
