public class UsuarioGratuito extends Usuario {
    private boolean anuncios;

    public UsuarioGratuito(int id, String nome, String email, boolean anuncios) {
        super(id, nome, email);
        this.anuncios = anuncios;
    }

    public boolean hasAnuncios() { return anuncios; }
    public void setAnuncios(boolean anuncios) { this.anuncios = anuncios; }

    @Override
    public void exibirInfo() {
        System.out.println("[Gratuito] " + nome + " (" + email + ") - Anúncios: " + anuncios);
    }

    public void ouvirAnuncio() {
        System.out.println(nome + " está ouvindo um anúncio...");
    }
}