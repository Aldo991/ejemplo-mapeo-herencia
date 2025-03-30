package com.example.ejemplomapeoherencia.services.imp;

import com.example.ejemplomapeoherencia.dtos.input.RopaDto;
import com.example.ejemplomapeoherencia.dtos.output.RopaOutputDto;
import com.example.ejemplomapeoherencia.model.entities.Calzado;
import com.example.ejemplomapeoherencia.model.entities.Remera;
import com.example.ejemplomapeoherencia.model.entities.Ropa;
import com.example.ejemplomapeoherencia.model.entities.Talle;
import com.example.ejemplomapeoherencia.model.repositories.RopaRepository;
import com.example.ejemplomapeoherencia.services.IRopaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RopaService implements IRopaService {
  @Autowired
  private RopaRepository ropaRepository;

  @Override
  public Long crearRopa(RopaDto ropaDto) {
    Long id = null;

    System.out.println("SE ESTA POR CREAR UNA ROPA");

    if (ropaDto.getTipoDeRopa().equals("calzado")) {
      Calzado calzado = Calzado
          .builder()
          .nroCalzado(ropaDto.getNroCalzado())
          .modelo(ropaDto.getModelo())
          .build();
      calzado.setMarca(ropaDto.getMarca());

      ropaRepository.save(calzado);
      id = calzado.getId();
    } else if (ropaDto.getTipoDeRopa().equals("remera")) {
      Remera remera = Remera
          .builder()
          .tela(ropaDto.getTela())
          .talle(Talle.valueOf(ropaDto.getTalle()))
          .build();
      remera.setMarca(ropaDto.getMarca());

      ropaRepository.save(remera);
      id = remera.getId();
    }
    return id;
  }

  @Override
  public RopaOutputDto obtenerRopa(Long id) {
    Optional<Ropa> ropa = ropaRepository.findById(id);
    return ropa.orElse(null).toDto();
  }
}
