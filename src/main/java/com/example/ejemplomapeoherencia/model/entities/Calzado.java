package com.example.ejemplomapeoherencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("calzado")
public class Calzado extends Ropa {
  @Column(name = "nroCalzado")
  private int nroCalzado;
  @Column(name = "modelo")
  private String modelo;
}
