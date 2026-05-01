package br.com.alura.models;

public class Podcast extends Audio implements Classifiable {
    private String apresentador;
    private String descricao;

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }

    @Override
    public String toString() {
        return "Podcast: " + this.getTitulo() + " | Apresentador: " + this.getApresentador() +
                " | Classificação: " + this.getClassificacao() + " | Curtidas: " + this.getTotalCurtidas();
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String host) {
        this.apresentador = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
