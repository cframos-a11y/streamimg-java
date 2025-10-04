package pagamento;

public class Assinatura {
    private String tipo;
    private double preco;

    public void setTipo(String t) { this.tipo = t; }
    public void setPreco(double p) { this.preco = p; }

    public void exibir() {
        System.out.println("Assinatura: " + tipo + " - R$ " + preco);
    }
}
