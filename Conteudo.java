public abstract class Conteudo {
    protected int id;
    protected String titulo;
    protected double duracao;

    public Conteudo(int id, String titulo, double duracao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() { return titulo; }
    public double getDuracao() { return duracao; }

    public abstract void reproduzir();
}