public class UsuarioPremium extends Usuario {
    private double mensalidade;

    public UsuarioPremium(int id, String nome, String email, double mensalidade) {
        super(id, nome, email);
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() { return mensalidade; }
    public void setMensalidade(double m) { this.mensalidade = m; }

    @Override
    public void exibirInfo() {
        System.out.println("[Premium] " + nome + " (" + email + ") - R$ " + mensalidade);
    }

    public void baixar(String conteudo) {
        System.out.println(nome + " baixou: " + conteudo);
    }
}