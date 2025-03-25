package com.example.ejemplomapeoherencia.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Ropa")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Ropa {
  @Id
  @GeneratedValue
  protected Long id;
  @Column(name = "marca")
  protected String marca;
}
