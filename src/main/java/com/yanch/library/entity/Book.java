package com.yanch.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
    private String name;
    private String author;
    private String isbn;
    private boolean borrowed;
    @Id
    @GeneratedValue
    private Long id;
}
