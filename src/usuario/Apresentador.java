package usuario;

public class Apresentador extends Usuario {
    private String programa;

    public Apresentador(int id, String nome, String email, String programa) {
        super(id, nome, email);
        this.programa = programa;
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Apresentador] " + nome + " - Programa: " + programa + " (" + email + ")");
    }

    public void apresentar() {
        System.out.println(nome + " está apresentando o programa: " + programa);
    }
}
