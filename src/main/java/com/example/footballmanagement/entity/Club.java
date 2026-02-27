package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.Year;
import java.util.List;

@Entity
@Data
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    @Column(unique = true)
    String name;
    @Max(2026)
    int foundedYear;
    @NotBlank
    String stadium;
    @NotBlank
    String city;
    @Column(unique = true)
    String coach;

    @OneToMany(mappedBy = "club",cascade = CascadeType.ALL, orphanRemoval = true)
    List<Player> players;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Match> matches;

    @OneToOne
    @JoinColumn(name = "news_id")
    News news;

}
