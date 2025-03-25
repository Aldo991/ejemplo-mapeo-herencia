package com.example.ejemplopersistencia.model.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Ropa")
public class Ropa {
  @Id
  @GeneratedValue
  private Long id;
  @Column(name = "marca")
  private String marca;
}
