package com.example.ejemplomapeoherencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("remera")
public class Remera extends Ropa {
  @Column(name = "tela")
  private String tela;
  @Column(name = "talle")
  @Enumerated
  private Talle talle;
}
