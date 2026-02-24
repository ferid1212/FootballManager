package com.example.footballmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String content;
    LocalDate publishDate;
    String category;

    @OneToOne(mappedBy = "news")
    Club club;
}
