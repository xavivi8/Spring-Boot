package com.application.gestorPeliculas.laApi.controllers.dto;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Peli_favDTO {

    private int idPeliculaFav;
    private Usuario usuario;
    private int identificador;
}
