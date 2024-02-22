package com.application.gestorPeliculas.laApi.service;

import com.application.gestorPeliculas.laApi.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findByID(Long id);

    void save(Usuario usuario);

    void deleteById(Long id);

    Usuario findByUsuarioAndPassUser(String usuario, String passUser);
}
