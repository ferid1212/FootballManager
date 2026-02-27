package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    String title;
    @NotBlank
    String content;
    @Future
    @NotBlank
    LocalDate publishDate;
    @NotBlank
    String category;

    @OneToOne(mappedBy = "news")
    Club club;
}
