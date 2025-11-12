import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Midia> historico;
    public Usuario(String nome) {
        this.nome = nome;
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void reproduzirMidia(Midia m) {
        System.out.println("\n🎧 " + nome + " está reproduzindo " + m.getTitulo());
        m.reproduzir();
        historico.add(m);
    }

    public void curtirMidia(Midia m) {
        System.out.println("\n❤️ " + nome + " curtiu " + m.getTitulo());
        m.curtir();
    }

    public void mostrarHistorico() {
        System.out.println("\n📜 Histórico de " + nome + ":");
        for (Midia m : historico) {
            System.out.println("- " + m.getTitulo() + " (" + m.getReproducoes() + " reproduções)");
        }
    }
}
