package com.application.gestorPeliculas.laApi.repository;

import com.application.gestorPeliculas.laApi.entities.Peli_fav;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPeli_favRepository extends CrudRepository<Peli_fav, Long> {


    @Query("SELECT p FROM Peli_fav p WHERE p.usuario.id = :id")
    List<Peli_fav> findByIdUser(@Param("id") int id);
}
