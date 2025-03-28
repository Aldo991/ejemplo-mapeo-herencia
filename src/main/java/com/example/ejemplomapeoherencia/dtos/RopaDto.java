package com.example.ejemplomapeoherencia.dtos;

import com.example.ejemplomapeoherencia.model.entities.Talle;
import lombok.Data;

@Data
public class RopaDto {
  private String marca;
  private String tipoDeRopa;
  private String talle;
  private String tela;
  private String modelo;
  private int nroCalzado;
}
