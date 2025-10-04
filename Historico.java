import java.util.ArrayList;
import java.util.List;

public class Historico {
    private String descricao;
    private List<String> registros = new ArrayList<>();

    public Historico(String descricao) { this.descricao = descricao; }

    public void registrar(String item) { registros.add(item); }
    public void exibir() {
        System.out.println(descricao + ":");
        for (String r : registros) System.out.println(" - " + r);
    }
}