package com.application.gestorPeliculas.laApi.persistence.impl;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import com.application.gestorPeliculas.laApi.persistence.IUsuarioDao;
import com.application.gestorPeliculas.laApi.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UsuarioDaoImpl implements IUsuarioDao {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findByID(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findByUsuarioAndPassUser(String usuario, String passUser) {
        return usuarioRepository.findByUsuarioAndPassUser(usuario, passUser);
    }
}
