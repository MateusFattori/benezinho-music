package br.com.fiap.domain.entity;

public class Estilo {

    private Long id;

    private String nome;

    public Estilo() {
    }

    public Estilo(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estilo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
