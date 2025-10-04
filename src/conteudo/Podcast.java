package conteudo;

import usuario.Apresentador;

public class Podcast extends Conteudo {
    private Apresentador apresentador;
    private int episodios;

    public Podcast(int id, String titulo, double duracao, Apresentador apresentador, int episodios) {
        super(id, titulo, duracao);
        this.apresentador = apresentador;
        this.episodios = episodios;
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo podcast: " + titulo + " — apresentado por " + apresentador.getNome());
    }

    public void ouvir() { reproduzir(); }
}
