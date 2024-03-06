package com.application.gestorPeliculas.laApi.repository;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM usuarios u WHERE u.usuario = :usuarios AND u.pass_user = :passUsers LIMIT 1")
    Usuario findByUsuarioAndPassUser(@Param("usuarios") String usuario, @Param("passUsers") String passUser);
}
