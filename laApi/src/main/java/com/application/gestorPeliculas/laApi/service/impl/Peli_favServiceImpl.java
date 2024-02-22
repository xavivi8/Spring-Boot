package com.application.gestorPeliculas.laApi.service.impl;

import com.application.gestorPeliculas.laApi.entities.Peli_fav;
import com.application.gestorPeliculas.laApi.persistence.IPeli_favDao;
import com.application.gestorPeliculas.laApi.service.IPeli_favService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Peli_favServiceImpl implements IPeli_favService {

    @Autowired
    private IPeli_favDao peliFavDao;

    @Override
    public List<Peli_fav> findAll() {
        return peliFavDao.findAll();
    }

    @Override
    public Optional<Peli_fav> findById(Long id) {
        return peliFavDao.findById(id);
    }

    @Override
    public void save(Peli_fav peliFav) {
        peliFavDao.save(peliFav);
    }

    @Override
    public void deleteById(Long id) {
        peliFavDao.deleteById(id);
    }

    @Override
    public List<Peli_fav> findByIdUser(int id) {
        return peliFavDao.findByIdUser(id);
    }
}
