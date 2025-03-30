package com.example.ejemplomapeoherencia.controllers;

import com.example.ejemplomapeoherencia.dtos.input.RopaDto;
import com.example.ejemplomapeoherencia.services.IRopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ropas")
public class RopaController {
  @Autowired
  private IRopaService ropaService;

  @PostMapping
  public ResponseEntity<?> crearRopa(@RequestBody RopaDto ropaDto) {
    System.out.println("LLEGO UN POST");
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(this.ropaService.crearRopa(ropaDto));
  }

  @GetMapping({"/id"})
  public ResponseEntity<?> llegoUnaSolicitud(@PathVariable Long idRopa) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.ropaService.obtenerRopa(idRopa));
  }
}
