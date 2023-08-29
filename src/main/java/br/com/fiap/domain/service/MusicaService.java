package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Musica;
import br.com.fiap.domain.repository.MusicaRepository;

import java.util.List;
import java.util.Objects;

public class MusicaService implements Service<Musica, Long> {

    private MusicaRepository repository;

    public MusicaService(){
        this.repository = new MusicaRepository();
    }

    @Override
    public List<Musica> findAll() {
        return null;
    }

    @Override
    public Musica findById(Long id) {
        return null;
    }

    @Override
    public List<Musica> findByName(String texto) {
        return null;
    }

    @Override
    public Musica persist(Musica musica) {

        if (Objects.nonNull(musica)){
            return repository.persist(musica);
        }else {
            return null;
        }
    }
}
