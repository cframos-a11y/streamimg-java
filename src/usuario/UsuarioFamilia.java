package usuario;

public class UsuarioFamilia extends Usuario {
    private int membros;

    public UsuarioFamilia(int id, String nome, String email, int membros) {
        super(id, nome, email);
        this.membros = membros;
    }

    public int getMembros() { return membros; }
    public void setMembros(int m) { this.membros = m; }

    @Override
    public void exibirInfo() {
        System.out.println("[Família] " + nome + " (" + email + ") - Membros: " + membros);
    }

    public void adicionarMembro() {
        membros++;
        System.out.println("Membro adicionado. Total agora: " + membros);
    }
}
