package com.example.ejemplomapeoherencia.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name = "tipoRopa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Ropa {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "marca")
  private String marca;
}
