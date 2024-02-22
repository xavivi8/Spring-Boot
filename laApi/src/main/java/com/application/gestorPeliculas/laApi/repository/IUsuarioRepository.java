package com.application.gestorPeliculas.laApi.repository;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuarios AND u.passUser = :passUsers")
    Usuario findByUsuarioAndPassUser(@Param("usuarios") String usuario, @Param("passUsers") String passUser);
}
