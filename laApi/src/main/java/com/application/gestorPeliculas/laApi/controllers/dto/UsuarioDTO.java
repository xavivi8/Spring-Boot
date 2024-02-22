package com.application.gestorPeliculas.laApi.controllers.dto;

import com.application.gestorPeliculas.laApi.entities.Peli_fav;
import com.application.gestorPeliculas.laApi.entities.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private int idUsuario;
    private String usuario;
    private String nombrePublico;
    private String passUser;
    private boolean habilitado;
    private String tokenSesion;
    private String tokenPasswd;
    private String tokenPasswdExpira;
    private String observaciones;
    private Rol rol;
    private List<Peli_fav> peliFavList;
}
