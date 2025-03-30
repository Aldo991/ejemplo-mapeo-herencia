package com.example.ejemplomapeoherencia.model.entities;

import com.example.ejemplomapeoherencia.dtos.output.RopaOutputDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoDeRopa")
public abstract class Ropa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "marca")
  private String marca;

  public RopaOutputDto toDto() {
    return RopaOutputDto.builder()
        .marca(this.marca)
        .id(this.id)
        .build();
  }
}
