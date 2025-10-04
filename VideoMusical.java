public class VideoMusical extends Conteudo {
    private Artista artista;

    public VideoMusical(int id, String titulo, double duracao, Artista artista) {
        super(id, titulo, duracao);
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo video musical: " + titulo + " — " + artista.getNome());
    }
}