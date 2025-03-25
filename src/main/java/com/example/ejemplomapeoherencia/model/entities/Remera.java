package com.example.ejemplopersistencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;

public class Remera extends Ropa{
  @Column(name = "tela")
  private String tela;
  @Column(name = "talle")
  @Enumerated
  private Talle talle;
}
