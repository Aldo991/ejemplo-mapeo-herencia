package com.example.ejemplomapeoherencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Remera extends Ropa{
  @Column(name = "tela")
  private String tela;
  @Column(name = "talle")
  @Enumerated
  private Talle talle;
}
