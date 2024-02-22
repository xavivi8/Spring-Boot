package com.application.gestorPeliculas.laApi.persistence.impl;

import com.application.gestorPeliculas.laApi.entities.Peli_fav;
import com.application.gestorPeliculas.laApi.persistence.IPeli_favDao;
import com.application.gestorPeliculas.laApi.repository.IPeli_favRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Peli_favDaoImpl implements IPeli_favDao {

    private IPeli_favRepository peliFavRepository;

    @Override
    public List<Peli_fav> findAll() {
        return (List<Peli_fav>) peliFavRepository.findAll();
    }

    @Override
    public Optional<Peli_fav> findById(Long id) {
        return peliFavRepository.findById(id);
    }

    @Override
    public void save(Peli_fav peliFav) {
        peliFavRepository.save(peliFav);
    }

    @Override
    public void deleteById(Long id) {
        peliFavRepository.deleteById(id);
    }

    @Override
    public List<Peli_fav> findByIdUser(int id) {
        return peliFavRepository.findByIdUser(id);
    }
}
