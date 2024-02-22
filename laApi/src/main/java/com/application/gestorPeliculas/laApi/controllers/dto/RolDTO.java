package com.application.gestorPeliculas.laApi.controllers.dto;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolDTO {

    private int idRol;
    private String rol;
    private String observaciones;
    private List<Usuario> usuarios;
}
