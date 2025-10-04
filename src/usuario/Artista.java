package usuario;

public class Artista extends Usuario {
    private String estilo;

    public Artista(int id, String nome, String email, String estilo) {
        super(id, nome, email);
        this.estilo = estilo;
    }

    public String getEstilo() { return estilo; }
    public void setEstilo(String e) { this.estilo = e; }

    @Override
    public void exibirInfo() {
        System.out.println("[Artista] " + nome + " - Estilo: " + estilo + " (" + email + ")");
    }

    public void publicarConteudo() {
        System.out.println(nome + " publicou novo conteúdo!");
    }
}
