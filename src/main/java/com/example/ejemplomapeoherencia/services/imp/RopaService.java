package com.example.ejemplomapeoherencia.services.imp;

import com.example.ejemplomapeoherencia.dtos.RopaDto;
import com.example.ejemplomapeoherencia.model.entities.Calzado;
import com.example.ejemplomapeoherencia.model.entities.Remera;
import com.example.ejemplomapeoherencia.model.entities.Ropa;
import com.example.ejemplomapeoherencia.model.repositories.RopaRepository;
import com.example.ejemplomapeoherencia.services.IRopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RopaService implements IRopaService {
  @Autowired
  private RopaRepository ropaRepository;

  @Override
  public Long crearRopa(RopaDto ropaDto) {
    Long id = null;

    if (ropaDto.getTipoDeRopa().equals("calzado")) {
      Calzado calzado = Calzado
          .builder()
          .nroCalzado(ropaDto.getNroCalzado())
          .modelo(ropaDto.getModelo())
          .build();
      calzado.setModelo(ropaDto.getModelo());

      ropaRepository.save(calzado);
      id = calzado.getId();
    } else if (ropaDto.getTipoDeRopa().equals("remera")) {
      Remera remera = Remera
          .builder()
          .tela(ropaDto.getTela())
          .talle(ropaDto.getTalle())
          .build();
      remera.setMarca(ropaDto.getMarca());

      ropaRepository.save(remera);
      id = remera.getId();
    }
    return id;
  }
}
