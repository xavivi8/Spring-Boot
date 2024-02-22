package com.application.gestorPeliculas.laApi.repository;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.passUser = :passUser")
    Usuario findByUsuarioAndPassUser(@Param("usuario") String usuario, @Param("passUser") String passUser);
}
