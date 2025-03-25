package com.example.ejemplopersistencia.model.repositories;

import com.example.ejemplopersistencia.model.entities.Ropa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Long> {
}
