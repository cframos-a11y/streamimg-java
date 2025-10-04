public class Recomendacao {
    private String motivo;
    public Recomendacao(String motivo) { this.motivo = motivo; }
    public void sugerir() { System.out.println("Recomendação: " + motivo); }
}