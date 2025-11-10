public class Video extends Midia {
    private String qualidade;

    public Video(String titulo, Time duracao, String qualidade) {
        super(titulo, duracao);
        this.qualidade = qualidade;
    }

    @Override
    public String toString() {
        return "🎬 " + getTitulo() + " [" + qualidade + "]";
    }
}
