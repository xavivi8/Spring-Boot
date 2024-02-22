package com.application.gestorPeliculas.laApi.service;

import com.application.gestorPeliculas.laApi.entities.Peli_fav;

import java.util.List;
import java.util.Optional;

public interface IPeli_favService {

    List<Peli_fav> findAll();
    Optional<Peli_fav> findById(Long id);
    void save(Peli_fav peliFav);

    void deleteById(Long id);
    List<Peli_fav> findByIdUser(int id);
}
