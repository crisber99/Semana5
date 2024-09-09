package com.example.peliculas.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.service.PeliculasService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired
    private PeliculasService peliculaService;

    @GetMapping
    public List<Peliculas> getAllPeliculas(){
        return peliculaService.getAllPeliculas();
    }
        
    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculasById(@PathVariable Long id) {
        return peliculaService.getPeliculasById(id);
    }

    @PostMapping
    public Peliculas createPelicula(@RequestBody Peliculas peli) {
        return peliculaService.createPelicula(peli);
    }

    @PutMapping("path/{id}")
    public Peliculas updatePeliculas(@PathVariable Long id, @RequestBody Peliculas peli) {
        return peliculaService.updatePelicula(id, peli);
    }

    @DeleteMapping("/{id}")
    public void deletePelicula(@PathVariable Long id)
    {
        peliculaService.deletePelicula(id);
    }
    
}
