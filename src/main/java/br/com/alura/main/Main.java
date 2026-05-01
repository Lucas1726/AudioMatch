package br.com.alura.main;

import br.com.alura.models.Audio;
import br.com.alura.models.Song;
import br.com.alura.models.Podcast;
import br.com.alura.models.Favorites;

public class Main {
    public static void main(String[] args) {
        Song musica = new Song();
        musica.setTitulo("Maturidade");
        musica.setArtista("Kayblack");

        simularReproducoes(musica, 1000);
        simularCurtidas(musica, 50);

        Podcast podcast = new Podcast();
        podcast.setTitulo("Podpah");
        podcast.setApresentador("Higão & Mitico");

        simularReproducoes(podcast, 5000);
        simularCurtidas(podcast, 1000);

        Favorites preferidas = new Favorites();

        System.out.println(podcast);
        preferidas.inclui(podcast);
        System.out.println(musica);
        preferidas.inclui(musica);
    }

    // Método para simular várias reproduções de uma vez
    public static void simularReproducoes(Audio audio, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            audio.reproduz();
        }
    }

    // Método para simular várias curtidas de uma vez
    public static void simularCurtidas(Audio audio, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            audio.curte();
        }
    }
}
