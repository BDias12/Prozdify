public abstract class Midia {
    private String titulo;
    private Time duracao;
    private int curtidas;
    private int reproducoes;
    private boolean reproduzindo;

    public Midia(String titulo, Time duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.curtidas = 0;
        this.reproducoes = 0;
        this.reproduzindo = false;
    }

    public int getReproducoes(){
        return reproducoes;
    }

    public void reproduzir() {
        reproduzindo = true;
        reproducoes++;
        System.out.println("Reproduzindo: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public void pausar() {
        reproduzindo = false;
        System.out.println("Pausado: " + titulo);
    }

    public void curtir() {
        curtidas++;
        System.out.println(titulo + " recebeu um like! ❤️ Total: " + curtidas);
    }

    @Override
    public String toString() {
        return titulo + " (" + duracao.formatarTempo() + ") — " +
                reproducoes + " reprodução(ões)";
    }
}
