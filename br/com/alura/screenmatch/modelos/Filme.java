package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    // GETTER

    public String getDiretor() {
        return diretor;
    }

    // SETTER

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }

}
