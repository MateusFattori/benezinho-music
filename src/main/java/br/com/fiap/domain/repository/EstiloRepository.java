package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.service.Service;

import java.util.List;

public class EstiloRepository implements Service<Estilo, Long> {

    List<Estilo> estilos;

    @Override
    public List<Estilo> findAll() {
        return estilos;
    }

    @Override
    public Estilo findById(Long id) {
        return null;
    }

    @Override
    public List<Estilo> findByName(String texto) {
        return null;
    }

    @Override
    public Estilo persist(Estilo estilo) {
        return null;
    }
}
