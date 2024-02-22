package com.application.gestorPeliculas.laApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios" )
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "nombre_publico")
    private String nombrePublico;

    @Column(name = "pass_user")
    private String passUser;

    @Column(name = "habilitado")
    private boolean habilitado;

    @Column(name = "token_sesion")
    private String tokenSesion;

    @Column(name = "token_passwd")
    private String tokenPasswd;

    @Column(name = "token_passwd_expira")
    private String tokenPasswdExpira;

    @Column(name = "observaciones")
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    @JsonIgnore
    private Rol rol;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Peli_fav> peliFavList = new ArrayList<>();
}
