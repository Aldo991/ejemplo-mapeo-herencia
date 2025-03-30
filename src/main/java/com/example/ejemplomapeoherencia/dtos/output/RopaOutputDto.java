package com.example.ejemplomapeoherencia.dtos.output;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RopaOutputDto {
  private Long id;
  private String marca;
}
