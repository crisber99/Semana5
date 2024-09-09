package com.example.peliculas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.peliculas.model.Peliculas;

public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {

    
}
