package com.application.gestorPeliculas.laApi.persistence.impl;

import com.application.gestorPeliculas.laApi.entities.Rol;
import com.application.gestorPeliculas.laApi.persistence.IRolDao;
import com.application.gestorPeliculas.laApi.repository.IRolRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RolDaoImpl implements IRolDao {

    private IRolRepository repository;

    @Override
    public List<Rol> findAll() {
        return (List<Rol>) repository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Rol rol) {
        repository.save(rol);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
