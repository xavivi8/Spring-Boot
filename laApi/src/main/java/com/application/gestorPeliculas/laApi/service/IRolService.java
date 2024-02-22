package com.application.gestorPeliculas.laApi.service;

import com.application.gestorPeliculas.laApi.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolService {

    List<Rol> findAll();
    Optional<Rol> findById(Long id);
    void save(Rol rol);
    void deleteById(Long id);
}
