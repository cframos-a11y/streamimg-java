package usuario;

public class Narrador extends Usuario {
    private String tipoVoz;

    public Narrador(int id, String nome, String email, String tipoVoz) {
        super(id, nome, email);
        this.tipoVoz = tipoVoz;
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Narrador] " + nome + " - Voz: " + tipoVoz + " (" + email + ")");
    }

    public void narrar() {
        System.out.println(nome + " está narrando...");
    }
}
