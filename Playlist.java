import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private Usuario criador;
    private int tamanhoMax;
    private List<Conteudo> itens = new ArrayList<>();

    public Playlist(Usuario criador, int tamanhoMax) {
        this.criador = criador;
        this.tamanhoMax = tamanhoMax;
    }

    public void adicionar(Conteudo c) {
        if (itens.size() < tamanhoMax) itens.add(c);
        else System.out.println("Playlist cheia");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo playlist criada por " + criador.getNome());
        for (Conteudo c : itens) c.reproduzir();
    }
}