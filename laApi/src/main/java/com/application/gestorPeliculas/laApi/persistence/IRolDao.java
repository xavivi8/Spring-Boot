package com.application.gestorPeliculas.laApi.persistence;

import com.application.gestorPeliculas.laApi.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolDao {

    List<Rol> findAll();
    Optional<Rol> findById(Long id);
    void save(Rol rol);
    void deleteById(Long id);
}
