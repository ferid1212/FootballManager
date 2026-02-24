package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    String name;
    @FutureOrPresent
    int foundedYear;
    @NotBlank
    String stadium;
    @NotBlank
    String city;
    String coach;

    @OneToMany(mappedBy = "club")
    List<Player> players;

    @OneToOne
    @JoinColumn(name = "match_id")
    Match match;

    @OneToOne
    @JoinColumn(name = "news_id")
    News news;

}
