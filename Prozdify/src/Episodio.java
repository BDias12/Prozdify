public class Episodio extends Midia {
    private int numero;
    private String descricao;
    private boolean temVideo;

    public Episodio(String titulo, Time duracao, int numero, String descricao, boolean temVideo) {
        super(titulo, duracao);
        this.numero = numero;
        this.descricao = descricao;
        this.temVideo = temVideo;
    }

    @Override
    public String toString() {
        String tipo = temVideo ? "🎥" : "🎧";
        return tipo + " Episódio " + numero + ": " + getTitulo() + " (" + getDuracao().formatarTempo() + ")";
    }


}
