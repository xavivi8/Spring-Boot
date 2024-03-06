package com.application.gestorPeliculas.laApi.controllers;

import com.application.gestorPeliculas.laApi.controllers.dto.UsuarioDTO;
import com.application.gestorPeliculas.laApi.entities.Usuario;
import com.application.gestorPeliculas.laApi.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("laApi/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        Optional<Usuario> usuarioOptional = usuarioService.findByID(id);

        if(usuarioOptional.isPresent()){
            Usuario usuario = usuarioOptional.get();

            UsuarioDTO usuarioDTO = UsuarioDTO.builder()
                    .idUsuario(usuario.getIdUsuario())
                    .usuario(usuario.getUsuario())
                    .nombrePublico(usuario.getNombrePublico())
                    .passUser(usuario.getPassUser())
                    .habilitado(usuario.isHabilitado())
                    .tokenSesion((usuario.getTokenSesion()))
                    .tokenPasswd(usuario.getTokenPasswd())
                    .tokenPasswdExpira(usuario.getTokenPasswdExpira())
                    .observaciones((usuario.getObservaciones()))
                    .rol(usuario.getRol())
                    .peliFavList(usuario.getPeliFavList())
                    .build();
            return ResponseEntity.ok(usuarioDTO);
        }

        return  ResponseEntity.notFound().build();
    }

    /*@GetMapping(value = "/findByIdAndUser", params = {"user","pass"}) /* /findByIdAndUser?user=valorUsuario&pass=valorPassword */
    /*public ResponseEntity<?> findByUsuarioAndPassUser(@RequestParam String user, @RequestParam String pass){
        Usuario usuario = usuarioService.findByUsuarioAndPassUser(user, pass);

        if(usuario.isHabilitado()){

            UsuarioDTO usuarioDTO = UsuarioDTO.builder()
                    .idUsuario(usuario.getIdUsuario())
                    .usuario(usuario.getUsuario())
                    .nombrePublico(usuario.getNombrePublico())
                    .passUser(usuario.getPassUser())
                    .habilitado(usuario.isHabilitado())
                    .tokenSesion((usuario.getTokenSesion()))
                    .tokenPasswd(usuario.getTokenPasswd())
                    .tokenPasswdExpira(usuario.getTokenPasswdExpira())
                    .observaciones((usuario.getObservaciones()))
                    .rol(usuario.getRol())
                    .peliFavList(usuario.getPeliFavList())
                    .build();
            return ResponseEntity.ok(usuarioDTO);
        }
        return  ResponseEntity.notFound().build();
    }*/
}
