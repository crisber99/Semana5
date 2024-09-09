package com.example.peliculas.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.repository.PeliculasRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServiceImpl implements PeliculasService{
    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> getPeliculasById(Long id) {
        return peliculasRepository.findById(id);
    }

    @Override
    public Peliculas createPelicula(Peliculas peli) {
        return peliculasRepository.save(peli);
    }

    @Override
    public Peliculas updatePelicula(Long id, Peliculas peli) {
        if(peliculasRepository.existsById(id))
        {
            peli.setId(id);
            return peliculasRepository.save(peli);
        }
        else
        return null;
    }

    @Override
    public void deletePelicula(Long id) {
        peliculasRepository.deleteById(id);
    }
}
