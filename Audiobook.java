public class Audiobook extends Conteudo {
    private Narrador narrador;
    private int capitulos;

    public Audiobook(int id, String titulo, double duracao, Narrador narrador, int capitulos) {
        super(id, titulo, duracao);
        this.narrador = narrador;
        this.capitulos = capitulos;
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo audiobook: " + titulo + " — narrado por " + narrador.getNome());
    }

    public void ouvir() { reproduzir(); }
}