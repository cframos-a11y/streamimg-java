public class Musica extends Conteudo {
    private Artista artista;
    private Album album;

    public Musica(int id, String titulo, double duracao, Artista artista, Album album) {
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