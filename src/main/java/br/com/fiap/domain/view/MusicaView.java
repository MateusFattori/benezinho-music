package br.com.fiap.domain.view;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.entity.Musica;

import javax.swing.*;

public class MusicaView {

    public Musica form() {

        String nome = null;

        do{
            nome = JOptionPane.showInputDialog("Nome da Musica");
        } while (nome == null);

        return new Musica(null,nome,new Estilo(), null);
    }

}
