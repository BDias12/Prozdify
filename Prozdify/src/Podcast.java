import java.util.ArrayList;

public class Podcast extends Midia {
    private String apresentador;
    private ArrayList<Episodio> episodios;

    public Podcast(String titulo, String apresentador) {
        super(titulo, new Time(0,0,0));
        this.apresentador = apresentador;
        this.episodios = new ArrayList<>();
    }

    public void adicionarEpisodio(Episodio ep) {
        episodios.add(ep);
        System.out.println("Episódio adicionado: " + ep.getTitulo());
    }

    public void listarEpisodios() {
        System.out.println("📻 Podcast: " + getTitulo() + " - Apresentador: " + apresentador);
        for (Episodio ep : episodios) {
            System.out.println("   • " + ep);
        }
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }
}
