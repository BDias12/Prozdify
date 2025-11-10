public class Musica extends Midia {
    private String artista;
    private String genero;
    private int anoLancamento;

    public Musica(String titulo, Time duracao, String artista, String genero, int anoLancamento) {
        super(titulo, duracao);
        this.artista = artista;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "🎵 " + getTitulo() + " - " + artista + " (" + genero + ") / " + anoLancamento;
    }
}
