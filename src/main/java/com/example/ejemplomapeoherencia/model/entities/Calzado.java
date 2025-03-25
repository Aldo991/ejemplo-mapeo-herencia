package com.example.ejemplopersistencia.model.entities;

import jakarta.persistence.Column;

public class Calzado extends Ropa{
  @Column(name = "nroCalzado")
  private int nroCalzado;
  @Column(name = "modelo")
  private String modelo;
}
