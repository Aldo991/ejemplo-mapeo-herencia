package com.example.ejemplopersistencia.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ropas")
public class RopaController {

  @PostMapping
  public ResponseEntity<String> crearRopa() {
    return null;
  }
}
