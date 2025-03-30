package com.example.ejemplomapeoherencia.services;

import com.example.ejemplomapeoherencia.dtos.input.RopaDto;
import com.example.ejemplomapeoherencia.dtos.output.RopaOutputDto;

public interface IRopaService {
  Long crearRopa(RopaDto ropaDto);
  RopaOutputDto obtenerRopa(Long id);
}
