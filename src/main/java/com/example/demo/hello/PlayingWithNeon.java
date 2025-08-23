package com.example.demo.hello;

import jakarta.persistence.*;

@Entity
@Table(name = "playing_with_neon")
public class PlayingWithNeon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL in Postgres
    private Long id;

    private String name;
    private Double value;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }
}
