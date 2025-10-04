import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private int ano;
    private List<String> faixas = new ArrayList<>();

    public Album(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public void addMusica(String titulo) { faixas.add(titulo); }
    public List<String> getFaixas() { return faixas; }

    public void exibirInfo() {
        System.out.println("Album: " + nome + " (" + ano + ")");
        System.out.println("Faixas:");
        for (String f : faixas) System.out.println(" - " + f);
    }
}