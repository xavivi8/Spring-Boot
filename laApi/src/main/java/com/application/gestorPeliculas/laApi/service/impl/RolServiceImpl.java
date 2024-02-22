package com.application.gestorPeliculas.laApi.service.impl;

import com.application.gestorPeliculas.laApi.entities.Rol;
import com.application.gestorPeliculas.laApi.persistence.IRolDao;
import com.application.gestorPeliculas.laApi.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolDao rolDao;

    @Override
    public List<Rol> findAll() {
        return rolDao.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return rolDao.findById(id);
    }

    @Override
    public void save(Rol rol) {
        rolDao.save(rol);
    }

    @Override
    public void deleteById(Long id) {
        rolDao.deleteById(id);
    }
}
