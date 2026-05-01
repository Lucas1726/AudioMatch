package br.com.alura.models;

public class Song extends Audio implements Classifiable {
    private String album;
    private String artista;
    private String genero;

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() >= 2000) {
            return 10;
        } else  {
            return 7;
        }
    }

    @Override
    public String toString() {
        return "Música: " + this.getTitulo() + " | Artista: " + this.getArtista() +
                " | Classificação: " + this.getClassificacao();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
