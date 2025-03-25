package com.example.ejemplomapeoherencia.model.repositories;

import com.example.ejemplomapeoherencia.model.entities.Ropa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Long> {
}
