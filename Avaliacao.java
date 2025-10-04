public class Avaliacao {
    private String comentario;
    private int estrelas;

    public Avaliacao(String comentario, int estrelas) {
        this.comentario = comentario;
        this.estrelas = estrelas;
    }

    public void avaliar() {
        System.out.println("Avaliação: " + estrelas + " estrelas - " + comentario);
    }
}