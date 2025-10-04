package conteudo;

import usuario.Artista;
import album.Album; // forward reference; Album is in root package 'album' (we'll create it)

public class Musica extends Conteudo {
    private Artista artista;
    private album.Album album;

    public Musica(int id, String titulo, double duracao, Artista artista, album.Album album) {
        super(id, titulo, duracao);
        this.artista = artista;
        this.album = album;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + titulo + " — " + artista.getNome());
    }

    public void tocar() { reproduzir(); }
}
