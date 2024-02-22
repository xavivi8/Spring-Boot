package com.application.gestorPeliculas.laApi.service.impl;

import com.application.gestorPeliculas.laApi.entities.Usuario;
import com.application.gestorPeliculas.laApi.persistence.IUsuarioDao;
import com.application.gestorPeliculas.laApi.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Optional<Usuario> findByID(Long id) {
        return usuarioDao.findByID(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public Usuario findByUsuarioAndPassUser(String usuario, String passUser) {
        return usuarioDao.findByUsuarioAndPassUser(usuario,passUser);
    }
}
